// Generated from br\u005Cufscar\dc\compiladores\alguma\sintatico\Alguma.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.alguma.sintatico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgumaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ALGORITMO=2, FIM_ALGORITMO=3, REGISTRO=4, FIM_REGISTRO=5, FALSO=6, 
		VERDADEIRO=7, NAO=8, FACA=9, FUNCAO=10, FIM_FUNCAO=11, PROCEDIMENTO=12, 
		FIM_PROCEDIMENTO=13, RETORNE=14, LEIA=15, ESCREVA=16, DECLARE=17, TIPO=18, 
		LITERAL=19, VAR=20, LOGICO=21, INTEIRO=22, CONSTANTE=23, REAL=24, SE=25, 
		SENAO=26, FIM_SE=27, ENTAO=28, CASO=29, FIM_CASO=30, PARA=31, FIM_PARA=32, 
		ATE=33, SEJA=34, ENQUANTO=35, FIM_ENQUANTO=36, E=37, OU=38, IGUAL=39, 
		DIFERENTE=40, ATRIBUICAO=41, MENOR=42, MAIOR=43, MENOR_IGUAL=44, MAIOR_IGUAL=45, 
		SOMA=46, MOD=47, SUBTRACAO=48, DIVISAO=49, MULTIPLICACAO=50, ENDERECO=51, 
		PONT=52, NUM_INT=53, NUM_REAL=54, IDENT=55, CADEIA=56, CADEIA_NAO_FECHADA=57, 
		PONTO=58, INTERVALO=59, DOIS_PONTOS=60, ABREPAR=61, FECHAPAR=62, VIRGULA=63, 
		ABRECOL=64, FECHACOL=65, COMENTARIO=66, COMENTARIO_NAO_FECHADO=67, WS=68, 
		ERRO=69;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "ALGORITMO", "FIM_ALGORITMO", "REGISTRO", "FIM_REGISTRO", "FALSO", 
			"VERDADEIRO", "NAO", "FACA", "FUNCAO", "FIM_FUNCAO", "PROCEDIMENTO", 
			"FIM_PROCEDIMENTO", "RETORNE", "LEIA", "ESCREVA", "DECLARE", "TIPO", 
			"LITERAL", "VAR", "LOGICO", "INTEIRO", "CONSTANTE", "REAL", "SE", "SENAO", 
			"FIM_SE", "ENTAO", "CASO", "FIM_CASO", "PARA", "FIM_PARA", "ATE", "SEJA", 
			"ENQUANTO", "FIM_ENQUANTO", "E", "OU", "IGUAL", "DIFERENTE", "ATRIBUICAO", 
			"MENOR", "MAIOR", "MENOR_IGUAL", "MAIOR_IGUAL", "SOMA", "MOD", "SUBTRACAO", 
			"DIVISAO", "MULTIPLICACAO", "ENDERECO", "PONT", "NUM_INT", "NUM_REAL", 
			"IDENT", "CADEIA", "CADEIA_NAO_FECHADA", "PONTO", "INTERVALO", "DOIS_PONTOS", 
			"ABREPAR", "FECHAPAR", "VIRGULA", "ABRECOL", "FECHACOL", "COMENTARIO", 
			"COMENTARIO_NAO_FECHADO", "WS", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'. .'", "'algoritmo'", "'fim_algoritmo'", "'registro'", "'fim_registro'", 
			"'falso'", "'verdadeiro'", "'nao'", "'faca'", "'funcao'", "'fim_funcao'", 
			"'procedimento'", "'fim_procedimento'", "'retorne'", "'leia'", "'escreva'", 
			"'declare'", "'tipo'", "'literal'", "'var'", "'logico'", "'inteiro'", 
			"'constante'", "'real'", "'se'", "'senao'", "'fim_se'", "'entao'", "'caso'", 
			"'fim_caso'", "'para'", "'fim_para'", "'ate'", "'seja'", "'enquanto'", 
			"'fim_enquanto'", "'e'", "'ou'", "'='", "'<>'", "'<-'", "'<'", "'>'", 
			"'<='", "'>='", "'+'", "'%'", "'-'", "'/'", "'*'", "'&'", "'^'", null, 
			null, null, null, null, "'.'", "'..'", "':'", "'('", "')'", "','", "'['", 
			"']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ALGORITMO", "FIM_ALGORITMO", "REGISTRO", "FIM_REGISTRO", 
			"FALSO", "VERDADEIRO", "NAO", "FACA", "FUNCAO", "FIM_FUNCAO", "PROCEDIMENTO", 
			"FIM_PROCEDIMENTO", "RETORNE", "LEIA", "ESCREVA", "DECLARE", "TIPO", 
			"LITERAL", "VAR", "LOGICO", "INTEIRO", "CONSTANTE", "REAL", "SE", "SENAO", 
			"FIM_SE", "ENTAO", "CASO", "FIM_CASO", "PARA", "FIM_PARA", "ATE", "SEJA", 
			"ENQUANTO", "FIM_ENQUANTO", "E", "OU", "IGUAL", "DIFERENTE", "ATRIBUICAO", 
			"MENOR", "MAIOR", "MENOR_IGUAL", "MAIOR_IGUAL", "SOMA", "MOD", "SUBTRACAO", 
			"DIVISAO", "MULTIPLICACAO", "ENDERECO", "PONT", "NUM_INT", "NUM_REAL", 
			"IDENT", "CADEIA", "CADEIA_NAO_FECHADA", "PONTO", "INTERVALO", "DOIS_PONTOS", 
			"ABREPAR", "FECHAPAR", "VIRGULA", "ABRECOL", "FECHACOL", "COMENTARIO", 
			"COMENTARIO_NAO_FECHADO", "WS", "ERRO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public AlgumaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Alguma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2G\u0223\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\3\66\6\66\u01cd\n\66\r\66\16\66\u01ce\3\67\6\67\u01d2"+
		"\n\67\r\67\16\67\u01d3\3\67\3\67\6\67\u01d8\n\67\r\67\16\67\u01d9\38\3"+
		"8\78\u01de\n8\f8\168\u01e1\138\39\39\39\39\79\u01e7\n9\f9\169\u01ea\13"+
		"9\39\39\3:\3:\3:\3:\7:\u01f2\n:\f:\16:\u01f5\13:\3:\3:\3;\3;\3<\3<\3<"+
		"\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\7C\u020c\nC\fC\16C\u020f\13"+
		"C\3C\3C\3C\3C\3D\3D\7D\u0217\nD\fD\16D\u021a\13D\3D\3D\3E\3E\3E\3E\3F"+
		"\3F\2\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66"+
		"k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG"+
		"\3\2\b\4\2C\\c|\6\2\62;C\\aac|\5\2\f\f$$^^\5\2\f\f\17\17\177\177\3\2\177"+
		"\177\5\2\13\f\17\17\"\"\2\u022c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\3\u008d\3\2\2\2\5\u0091\3\2\2\2\7\u009b\3\2\2\2\t\u00a9"+
		"\3\2\2\2\13\u00b2\3\2\2\2\r\u00bf\3\2\2\2\17\u00c5\3\2\2\2\21\u00d0\3"+
		"\2\2\2\23\u00d4\3\2\2\2\25\u00d9\3\2\2\2\27\u00e0\3\2\2\2\31\u00eb\3\2"+
		"\2\2\33\u00f8\3\2\2\2\35\u0109\3\2\2\2\37\u0111\3\2\2\2!\u0116\3\2\2\2"+
		"#\u011e\3\2\2\2%\u0126\3\2\2\2\'\u012b\3\2\2\2)\u0133\3\2\2\2+\u0137\3"+
		"\2\2\2-\u013e\3\2\2\2/\u0146\3\2\2\2\61\u0150\3\2\2\2\63\u0155\3\2\2\2"+
		"\65\u0158\3\2\2\2\67\u015e\3\2\2\29\u0165\3\2\2\2;\u016b\3\2\2\2=\u0170"+
		"\3\2\2\2?\u0179\3\2\2\2A\u017e\3\2\2\2C\u0187\3\2\2\2E\u018b\3\2\2\2G"+
		"\u0190\3\2\2\2I\u0199\3\2\2\2K\u01a6\3\2\2\2M\u01a8\3\2\2\2O\u01ab\3\2"+
		"\2\2Q\u01ad\3\2\2\2S\u01b0\3\2\2\2U\u01b3\3\2\2\2W\u01b5\3\2\2\2Y\u01b7"+
		"\3\2\2\2[\u01ba\3\2\2\2]\u01bd\3\2\2\2_\u01bf\3\2\2\2a\u01c1\3\2\2\2c"+
		"\u01c3\3\2\2\2e\u01c5\3\2\2\2g\u01c7\3\2\2\2i\u01c9\3\2\2\2k\u01cc\3\2"+
		"\2\2m\u01d1\3\2\2\2o\u01db\3\2\2\2q\u01e2\3\2\2\2s\u01ed\3\2\2\2u\u01f8"+
		"\3\2\2\2w\u01fa\3\2\2\2y\u01fd\3\2\2\2{\u01ff\3\2\2\2}\u0201\3\2\2\2\177"+
		"\u0203\3\2\2\2\u0081\u0205\3\2\2\2\u0083\u0207\3\2\2\2\u0085\u0209\3\2"+
		"\2\2\u0087\u0214\3\2\2\2\u0089\u021d\3\2\2\2\u008b\u0221\3\2\2\2\u008d"+
		"\u008e\7\60\2\2\u008e\u008f\7\"\2\2\u008f\u0090\7\60\2\2\u0090\4\3\2\2"+
		"\2\u0091\u0092\7c\2\2\u0092\u0093\7n\2\2\u0093\u0094\7i\2\2\u0094\u0095"+
		"\7q\2\2\u0095\u0096\7t\2\2\u0096\u0097\7k\2\2\u0097\u0098\7v\2\2\u0098"+
		"\u0099\7o\2\2\u0099\u009a\7q\2\2\u009a\6\3\2\2\2\u009b\u009c\7h\2\2\u009c"+
		"\u009d\7k\2\2\u009d\u009e\7o\2\2\u009e\u009f\7a\2\2\u009f\u00a0\7c\2\2"+
		"\u00a0\u00a1\7n\2\2\u00a1\u00a2\7i\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4"+
		"\7t\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7o\2\2\u00a7"+
		"\u00a8\7q\2\2\u00a8\b\3\2\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7g\2\2\u00ab"+
		"\u00ac\7i\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7v\2\2"+
		"\u00af\u00b0\7t\2\2\u00b0\u00b1\7q\2\2\u00b1\n\3\2\2\2\u00b2\u00b3\7h"+
		"\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7o\2\2\u00b5\u00b6\7a\2\2\u00b6\u00b7"+
		"\7t\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7i\2\2\u00b9\u00ba\7k\2\2\u00ba"+
		"\u00bb\7u\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7q\2\2"+
		"\u00be\f\3\2\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7n"+
		"\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7q\2\2\u00c4\16\3\2\2\2\u00c5\u00c6"+
		"\7x\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7f\2\2\u00c9"+
		"\u00ca\7c\2\2\u00ca\u00cb\7f\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7k\2\2"+
		"\u00cd\u00ce\7t\2\2\u00ce\u00cf\7q\2\2\u00cf\20\3\2\2\2\u00d0\u00d1\7"+
		"p\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7q\2\2\u00d3\22\3\2\2\2\u00d4\u00d5"+
		"\7h\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7c\2\2\u00d8"+
		"\24\3\2\2\2\u00d9\u00da\7h\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7p\2\2\u00dc"+
		"\u00dd\7e\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7q\2\2\u00df\26\3\2\2\2\u00e0"+
		"\u00e1\7h\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7o\2\2\u00e3\u00e4\7a\2\2"+
		"\u00e4\u00e5\7h\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8"+
		"\7e\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7q\2\2\u00ea\30\3\2\2\2\u00eb\u00ec"+
		"\7r\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7e\2\2\u00ef"+
		"\u00f0\7g\2\2\u00f0\u00f1\7f\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7o\2\2"+
		"\u00f3\u00f4\7g\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7"+
		"\7q\2\2\u00f7\32\3\2\2\2\u00f8\u00f9\7h\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb"+
		"\7o\2\2\u00fb\u00fc\7a\2\2\u00fc\u00fd\7r\2\2\u00fd\u00fe\7t\2\2\u00fe"+
		"\u00ff\7q\2\2\u00ff\u0100\7e\2\2\u0100\u0101\7g\2\2\u0101\u0102\7f\2\2"+
		"\u0102\u0103\7k\2\2\u0103\u0104\7o\2\2\u0104\u0105\7g\2\2\u0105\u0106"+
		"\7p\2\2\u0106\u0107\7v\2\2\u0107\u0108\7q\2\2\u0108\34\3\2\2\2\u0109\u010a"+
		"\7t\2\2\u010a\u010b\7g\2\2\u010b\u010c\7v\2\2\u010c\u010d\7q\2\2\u010d"+
		"\u010e\7t\2\2\u010e\u010f\7p\2\2\u010f\u0110\7g\2\2\u0110\36\3\2\2\2\u0111"+
		"\u0112\7n\2\2\u0112\u0113\7g\2\2\u0113\u0114\7k\2\2\u0114\u0115\7c\2\2"+
		"\u0115 \3\2\2\2\u0116\u0117\7g\2\2\u0117\u0118\7u\2\2\u0118\u0119\7e\2"+
		"\2\u0119\u011a\7t\2\2\u011a\u011b\7g\2\2\u011b\u011c\7x\2\2\u011c\u011d"+
		"\7c\2\2\u011d\"\3\2\2\2\u011e\u011f\7f\2\2\u011f\u0120\7g\2\2\u0120\u0121"+
		"\7e\2\2\u0121\u0122\7n\2\2\u0122\u0123\7c\2\2\u0123\u0124\7t\2\2\u0124"+
		"\u0125\7g\2\2\u0125$\3\2\2\2\u0126\u0127\7v\2\2\u0127\u0128\7k\2\2\u0128"+
		"\u0129\7r\2\2\u0129\u012a\7q\2\2\u012a&\3\2\2\2\u012b\u012c\7n\2\2\u012c"+
		"\u012d\7k\2\2\u012d\u012e\7v\2\2\u012e\u012f\7g\2\2\u012f\u0130\7t\2\2"+
		"\u0130\u0131\7c\2\2\u0131\u0132\7n\2\2\u0132(\3\2\2\2\u0133\u0134\7x\2"+
		"\2\u0134\u0135\7c\2\2\u0135\u0136\7t\2\2\u0136*\3\2\2\2\u0137\u0138\7"+
		"n\2\2\u0138\u0139\7q\2\2\u0139\u013a\7i\2\2\u013a\u013b\7k\2\2\u013b\u013c"+
		"\7e\2\2\u013c\u013d\7q\2\2\u013d,\3\2\2\2\u013e\u013f\7k\2\2\u013f\u0140"+
		"\7p\2\2\u0140\u0141\7v\2\2\u0141\u0142\7g\2\2\u0142\u0143\7k\2\2\u0143"+
		"\u0144\7t\2\2\u0144\u0145\7q\2\2\u0145.\3\2\2\2\u0146\u0147\7e\2\2\u0147"+
		"\u0148\7q\2\2\u0148\u0149\7p\2\2\u0149\u014a\7u\2\2\u014a\u014b\7v\2\2"+
		"\u014b\u014c\7c\2\2\u014c\u014d\7p\2\2\u014d\u014e\7v\2\2\u014e\u014f"+
		"\7g\2\2\u014f\60\3\2\2\2\u0150\u0151\7t\2\2\u0151\u0152\7g\2\2\u0152\u0153"+
		"\7c\2\2\u0153\u0154\7n\2\2\u0154\62\3\2\2\2\u0155\u0156\7u\2\2\u0156\u0157"+
		"\7g\2\2\u0157\64\3\2\2\2\u0158\u0159\7u\2\2\u0159\u015a\7g\2\2\u015a\u015b"+
		"\7p\2\2\u015b\u015c\7c\2\2\u015c\u015d\7q\2\2\u015d\66\3\2\2\2\u015e\u015f"+
		"\7h\2\2\u015f\u0160\7k\2\2\u0160\u0161\7o\2\2\u0161\u0162\7a\2\2\u0162"+
		"\u0163\7u\2\2\u0163\u0164\7g\2\2\u01648\3\2\2\2\u0165\u0166\7g\2\2\u0166"+
		"\u0167\7p\2\2\u0167\u0168\7v\2\2\u0168\u0169\7c\2\2\u0169\u016a\7q\2\2"+
		"\u016a:\3\2\2\2\u016b\u016c\7e\2\2\u016c\u016d\7c\2\2\u016d\u016e\7u\2"+
		"\2\u016e\u016f\7q\2\2\u016f<\3\2\2\2\u0170\u0171\7h\2\2\u0171\u0172\7"+
		"k\2\2\u0172\u0173\7o\2\2\u0173\u0174\7a\2\2\u0174\u0175\7e\2\2\u0175\u0176"+
		"\7c\2\2\u0176\u0177\7u\2\2\u0177\u0178\7q\2\2\u0178>\3\2\2\2\u0179\u017a"+
		"\7r\2\2\u017a\u017b\7c\2\2\u017b\u017c\7t\2\2\u017c\u017d\7c\2\2\u017d"+
		"@\3\2\2\2\u017e\u017f\7h\2\2\u017f\u0180\7k\2\2\u0180\u0181\7o\2\2\u0181"+
		"\u0182\7a\2\2\u0182\u0183\7r\2\2\u0183\u0184\7c\2\2\u0184\u0185\7t\2\2"+
		"\u0185\u0186\7c\2\2\u0186B\3\2\2\2\u0187\u0188\7c\2\2\u0188\u0189\7v\2"+
		"\2\u0189\u018a\7g\2\2\u018aD\3\2\2\2\u018b\u018c\7u\2\2\u018c\u018d\7"+
		"g\2\2\u018d\u018e\7l\2\2\u018e\u018f\7c\2\2\u018fF\3\2\2\2\u0190\u0191"+
		"\7g\2\2\u0191\u0192\7p\2\2\u0192\u0193\7s\2\2\u0193\u0194\7w\2\2\u0194"+
		"\u0195\7c\2\2\u0195\u0196\7p\2\2\u0196\u0197\7v\2\2\u0197\u0198\7q\2\2"+
		"\u0198H\3\2\2\2\u0199\u019a\7h\2\2\u019a\u019b\7k\2\2\u019b\u019c\7o\2"+
		"\2\u019c\u019d\7a\2\2\u019d\u019e\7g\2\2\u019e\u019f\7p\2\2\u019f\u01a0"+
		"\7s\2\2\u01a0\u01a1\7w\2\2\u01a1\u01a2\7c\2\2\u01a2\u01a3\7p\2\2\u01a3"+
		"\u01a4\7v\2\2\u01a4\u01a5\7q\2\2\u01a5J\3\2\2\2\u01a6\u01a7\7g\2\2\u01a7"+
		"L\3\2\2\2\u01a8\u01a9\7q\2\2\u01a9\u01aa\7w\2\2\u01aaN\3\2\2\2\u01ab\u01ac"+
		"\7?\2\2\u01acP\3\2\2\2\u01ad\u01ae\7>\2\2\u01ae\u01af\7@\2\2\u01afR\3"+
		"\2\2\2\u01b0\u01b1\7>\2\2\u01b1\u01b2\7/\2\2\u01b2T\3\2\2\2\u01b3\u01b4"+
		"\7>\2\2\u01b4V\3\2\2\2\u01b5\u01b6\7@\2\2\u01b6X\3\2\2\2\u01b7\u01b8\7"+
		">\2\2\u01b8\u01b9\7?\2\2\u01b9Z\3\2\2\2\u01ba\u01bb\7@\2\2\u01bb\u01bc"+
		"\7?\2\2\u01bc\\\3\2\2\2\u01bd\u01be\7-\2\2\u01be^\3\2\2\2\u01bf\u01c0"+
		"\7\'\2\2\u01c0`\3\2\2\2\u01c1\u01c2\7/\2\2\u01c2b\3\2\2\2\u01c3\u01c4"+
		"\7\61\2\2\u01c4d\3\2\2\2\u01c5\u01c6\7,\2\2\u01c6f\3\2\2\2\u01c7\u01c8"+
		"\7(\2\2\u01c8h\3\2\2\2\u01c9\u01ca\7`\2\2\u01caj\3\2\2\2\u01cb\u01cd\4"+
		"\62;\2\u01cc\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cfl\3\2\2\2\u01d0\u01d2\4\62;\2\u01d1\u01d0\3\2\2\2"+
		"\u01d2\u01d3\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5"+
		"\3\2\2\2\u01d5\u01d7\7\60\2\2\u01d6\u01d8\4\62;\2\u01d7\u01d6\3\2\2\2"+
		"\u01d8\u01d9\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01dan\3"+
		"\2\2\2\u01db\u01df\t\2\2\2\u01dc\u01de\t\3\2\2\u01dd\u01dc\3\2\2\2\u01de"+
		"\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0p\3\2\2\2"+
		"\u01e1\u01df\3\2\2\2\u01e2\u01e8\7$\2\2\u01e3\u01e4\7^\2\2\u01e4\u01e7"+
		"\7$\2\2\u01e5\u01e7\n\4\2\2\u01e6\u01e3\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7"+
		"\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\3\2"+
		"\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ec\7$\2\2\u01ecr\3\2\2\2\u01ed\u01f3"+
		"\7$\2\2\u01ee\u01ef\7^\2\2\u01ef\u01f2\7$\2\2\u01f0\u01f2\n\4\2\2\u01f1"+
		"\u01ee\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2"+
		"\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6"+
		"\u01f7\7\f\2\2\u01f7t\3\2\2\2\u01f8\u01f9\7\60\2\2\u01f9v\3\2\2\2\u01fa"+
		"\u01fb\7\60\2\2\u01fb\u01fc\7\60\2\2\u01fcx\3\2\2\2\u01fd\u01fe\7<\2\2"+
		"\u01fez\3\2\2\2\u01ff\u0200\7*\2\2\u0200|\3\2\2\2\u0201\u0202\7+\2\2\u0202"+
		"~\3\2\2\2\u0203\u0204\7.\2\2\u0204\u0080\3\2\2\2\u0205\u0206\7]\2\2\u0206"+
		"\u0082\3\2\2\2\u0207\u0208\7_\2\2\u0208\u0084\3\2\2\2\u0209\u020d\7}\2"+
		"\2\u020a\u020c\n\5\2\2\u020b\u020a\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b"+
		"\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210"+
		"\u0211\7\177\2\2\u0211\u0212\3\2\2\2\u0212\u0213\bC\2\2\u0213\u0086\3"+
		"\2\2\2\u0214\u0218\7}\2\2\u0215\u0217\n\6\2\2\u0216\u0215\3\2\2\2\u0217"+
		"\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\3\2"+
		"\2\2\u021a\u0218\3\2\2\2\u021b\u021c\7\f\2\2\u021c\u0088\3\2\2\2\u021d"+
		"\u021e\t\7\2\2\u021e\u021f\3\2\2\2\u021f\u0220\bE\2\2\u0220\u008a\3\2"+
		"\2\2\u0221\u0222\13\2\2\2\u0222\u008c\3\2\2\2\r\2\u01ce\u01d3\u01d9\u01df"+
		"\u01e6\u01e8\u01f1\u01f3\u020d\u0218\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}