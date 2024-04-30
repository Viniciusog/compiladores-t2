// Generated from br\u005Cufscar\dc\compiladores\alguma\sintatico\Alguma.g4 by ANTLR 4.3
package br.ufscar.dc.compiladores.alguma.sintatico;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgumaParser}.
 */
public interface AlgumaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(@NotNull AlgumaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(@NotNull AlgumaParser.ExpressaoRelacionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link AlgumaParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterTermoRelacional(@NotNull AlgumaParser.TermoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitTermoRelacional(@NotNull AlgumaParser.TermoRelacionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoAtribuicao(@NotNull AlgumaParser.ComandoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoAtribuicao(@NotNull AlgumaParser.ComandoAtribuicaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull AlgumaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull AlgumaParser.ProgramaContext ctx);

	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicao(@NotNull AlgumaParser.ComandoCondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicao(@NotNull AlgumaParser.ComandoCondicaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link AlgumaParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaracoes(@NotNull AlgumaParser.ListaDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaracoes(@NotNull AlgumaParser.ListaDeclaracoesContext ctx);

	/**
	 * Enter a parse tree produced by {@link AlgumaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(@NotNull AlgumaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(@NotNull AlgumaParser.DeclaracaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void enterComandoSaida(@NotNull AlgumaParser.ComandoSaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void exitComandoSaida(@NotNull AlgumaParser.ComandoSaidaContext ctx);

	/**
	 * Enter a parse tree produced by {@link AlgumaParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterFatorAritmetico(@NotNull AlgumaParser.FatorAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitFatorAritmetico(@NotNull AlgumaParser.FatorAritmeticoContext ctx);

	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void enterComandoRepeticao(@NotNull AlgumaParser.ComandoRepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void exitComandoRepeticao(@NotNull AlgumaParser.ComandoRepeticaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(@NotNull AlgumaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(@NotNull AlgumaParser.ComandoContext ctx);

	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterComandoEntrada(@NotNull AlgumaParser.ComandoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitComandoEntrada(@NotNull AlgumaParser.ComandoEntradaContext ctx);

	/**
	 * Enter a parse tree produced by {@link AlgumaParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterTermoAritmetico(@NotNull AlgumaParser.TermoAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitTermoAritmetico(@NotNull AlgumaParser.TermoAritmeticoContext ctx);

	/**
	 * Enter a parse tree produced by {@link AlgumaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(@NotNull AlgumaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(@NotNull AlgumaParser.ExpressaoAritmeticaContext ctx);

	/**
	 * Enter a parse tree produced by {@link AlgumaParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void enterListaComandos(@NotNull AlgumaParser.ListaComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void exitListaComandos(@NotNull AlgumaParser.ListaComandosContext ctx);

	/**
	 * Enter a parse tree produced by {@link AlgumaParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void enterSubAlgoritmo(@NotNull AlgumaParser.SubAlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void exitSubAlgoritmo(@NotNull AlgumaParser.SubAlgoritmoContext ctx);
}