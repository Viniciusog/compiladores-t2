package br.ufscar.dc.compiladores.alguma.sintatico;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.*;

/**
 *
 * @author vinij
 */
public class Principal {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {

        try (PrintWriter pw = new PrintWriter(new File(args[1]))) {            
            CharStream cs = CharStreams.fromFileName(args[0]);
            AlgumaLexer lexer = new AlgumaLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AlgumaParser parser = new AlgumaParser(tokens);

            Token token = null;
            while( (token = lexer.nextToken()).getType() != Token.EOF) {
                String nomeToken = lexer.VOCABULARY.getDisplayName(token.getType());
                if (nomeToken.equals("ERRO")) {
                    String erroString = "Linha " + token.getLine()+ ": " + token.getText() + " - simbolo nao identificado";
                    pw.printf(erroString);
                    pw.println("Fim da compilacao");
                    pw.flush();
                    System.exit(1);
                    break;
                } else if (nomeToken.equals("COMENTARIO_NAO_FECHADO")) {
                    String erroString = "Linha " + token.getLine() + ": comentario nao fechado";
                    pw.printf(erroString);
                    pw.println("Fim da compilacao");
                    pw.flush();
                    System.exit(1);
                    break;
                } else if (nomeToken.equals("CADEIA_NAO_FECHADA"))  {
                    String erroString = "Linha " + token.getLine() + ": cadeia literal nao fechada";
                    pw.printf(erroString);
                    pw.println("Fim da compilacao");
                    pw.flush();
                    System.exit(1);
                    break;
                }
            }

            lexer.setInputStream(CharStreams.fromFileName(args[0]));
            parser.removeParseListeners();
            MyCustomErrorListener mcel = new MyCustomErrorListener(pw);
            parser.addErrorListener(mcel);

            parser.programa();
        }
    }
}
