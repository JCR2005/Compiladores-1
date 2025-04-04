// Generated from TipeScript.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TipeScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, MAS=2, MENOS=3, MUL=4, DIV=5, POT=6, CONST=7, REGRESO=8, COMA=9, 
		PAR1=10, PAR2=11, ASIGNACIO=12, ASIGNACIO_PAGINA=13, CORCH1=14, CORCH2=15, 
		MAYOR_QUE=16, MENOR_QUE=17, FINI_NSTRUCCION=18, DECIMAL=19, ENTERO=20, 
		DOS_PUNTOS=21, CADENA=22, CARACTER=23, WS=24, VAR=25, CONSOLE=26, LOG=27, 
		FUNCTION=28, NUMBER=29, STRING=30, CHAR=31, BOOLEAN=32, VOID=33, TRUE=34, 
		FALSE=35, IDENTIFICADOR=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "MAS", "MENOS", "MUL", "DIV", "POT", "CONST", "REGRESO", "COMA", 
			"PAR1", "PAR2", "ASIGNACIO", "ASIGNACIO_PAGINA", "CORCH1", "CORCH2", 
			"MAYOR_QUE", "MENOR_QUE", "FINI_NSTRUCCION", "DECIMAL", "ENTERO", "DOS_PUNTOS", 
			"CADENA", "CARACTER", "WS", "VAR", "CONSOLE", "LOG", "FUNCTION", "NUMBER", 
			"STRING", "CHAR", "BOOLEAN", "VOID", "TRUE", "FALSE", "IDENTIFICADOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'+'", "'-'", "'*'", "'/'", "'^'", "'const'", "'return'", 
			"','", "'('", "')'", "'='", "'=>'", "'{'", "'}'", "'>'", "'<'", "';'", 
			null, null, "':'", null, null, null, "'var'", "'console'", "'log'", "'function'", 
			"'number'", "'string'", "'char'", "'boolean'", "'void'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "MAS", "MENOS", "MUL", "DIV", "POT", "CONST", "REGRESO", 
			"COMA", "PAR1", "PAR2", "ASIGNACIO", "ASIGNACIO_PAGINA", "CORCH1", "CORCH2", 
			"MAYOR_QUE", "MENOR_QUE", "FINI_NSTRUCCION", "DECIMAL", "ENTERO", "DOS_PUNTOS", 
			"CADENA", "CARACTER", "WS", "VAR", "CONSOLE", "LOG", "FUNCTION", "NUMBER", 
			"STRING", "CHAR", "BOOLEAN", "VOID", "TRUE", "FALSE", "IDENTIFICADOR"
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


	public TipeScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TipeScript.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00ee\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\6\24{\n\24\r\24\16\24|\3\24\3\24\6\24\u0081"+
		"\n\24\r\24\16\24\u0082\3\25\6\25\u0086\n\25\r\25\16\25\u0087\3\26\3\26"+
		"\3\27\3\27\7\27\u008e\n\27\f\27\16\27\u0091\13\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\6\31\u009a\n\31\r\31\16\31\u009b\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%"+
		"\6%\u00e5\n%\r%\16%\u00e6\3%\7%\u00ea\n%\f%\16%\u00ed\13%\3\u008f\2&\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&\3\2\6\3\2\62;\5\2\13\f\17\17\"\"\4\2C\\c|\7\2\62;C\\^^"+
		"aac|\2\u00f4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5M\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13"+
		"S\3\2\2\2\rU\3\2\2\2\17W\3\2\2\2\21]\3\2\2\2\23d\3\2\2\2\25f\3\2\2\2\27"+
		"h\3\2\2\2\31j\3\2\2\2\33l\3\2\2\2\35o\3\2\2\2\37q\3\2\2\2!s\3\2\2\2#u"+
		"\3\2\2\2%w\3\2\2\2\'z\3\2\2\2)\u0085\3\2\2\2+\u0089\3\2\2\2-\u008b\3\2"+
		"\2\2/\u0094\3\2\2\2\61\u0099\3\2\2\2\63\u009f\3\2\2\2\65\u00a3\3\2\2\2"+
		"\67\u00ab\3\2\2\29\u00af\3\2\2\2;\u00b8\3\2\2\2=\u00bf\3\2\2\2?\u00c6"+
		"\3\2\2\2A\u00cb\3\2\2\2C\u00d3\3\2\2\2E\u00d8\3\2\2\2G\u00dd\3\2\2\2I"+
		"\u00e4\3\2\2\2KL\7\60\2\2L\4\3\2\2\2MN\7-\2\2N\6\3\2\2\2OP\7/\2\2P\b\3"+
		"\2\2\2QR\7,\2\2R\n\3\2\2\2ST\7\61\2\2T\f\3\2\2\2UV\7`\2\2V\16\3\2\2\2"+
		"WX\7e\2\2XY\7q\2\2YZ\7p\2\2Z[\7u\2\2[\\\7v\2\2\\\20\3\2\2\2]^\7t\2\2^"+
		"_\7g\2\2_`\7v\2\2`a\7w\2\2ab\7t\2\2bc\7p\2\2c\22\3\2\2\2de\7.\2\2e\24"+
		"\3\2\2\2fg\7*\2\2g\26\3\2\2\2hi\7+\2\2i\30\3\2\2\2jk\7?\2\2k\32\3\2\2"+
		"\2lm\7?\2\2mn\7@\2\2n\34\3\2\2\2op\7}\2\2p\36\3\2\2\2qr\7\177\2\2r \3"+
		"\2\2\2st\7@\2\2t\"\3\2\2\2uv\7>\2\2v$\3\2\2\2wx\7=\2\2x&\3\2\2\2y{\t\2"+
		"\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u0080\7\60\2\2"+
		"\177\u0081\t\2\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083(\3\2\2\2\u0084\u0086\t\2\2\2\u0085\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"*\3\2\2\2\u0089\u008a\7<\2\2\u008a,\3\2\2\2\u008b\u008f\7$\2\2\u008c\u008e"+
		"\13\2\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u0090\3\2\2\2"+
		"\u008f\u008d\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093"+
		"\7$\2\2\u0093.\3\2\2\2\u0094\u0095\7)\2\2\u0095\u0096\13\2\2\2\u0096\u0097"+
		"\7)\2\2\u0097\60\3\2\2\2\u0098\u009a\t\3\2\2\u0099\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\b\31\2\2\u009e\62\3\2\2\2\u009f\u00a0\7x\2\2\u00a0\u00a1"+
		"\7c\2\2\u00a1\u00a2\7t\2\2\u00a2\64\3\2\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5"+
		"\7q\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7q\2\2\u00a8"+
		"\u00a9\7n\2\2\u00a9\u00aa\7g\2\2\u00aa\66\3\2\2\2\u00ab\u00ac\7n\2\2\u00ac"+
		"\u00ad\7q\2\2\u00ad\u00ae\7i\2\2\u00ae8\3\2\2\2\u00af\u00b0\7h\2\2\u00b0"+
		"\u00b1\7w\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7e\2\2\u00b3\u00b4\7v\2\2"+
		"\u00b4\u00b5\7k\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7p\2\2\u00b7:\3\2\2"+
		"\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7o\2\2\u00bb\u00bc"+
		"\7d\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7t\2\2\u00be<\3\2\2\2\u00bf\u00c0"+
		"\7u\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7k\2\2\u00c3"+
		"\u00c4\7p\2\2\u00c4\u00c5\7i\2\2\u00c5>\3\2\2\2\u00c6\u00c7\7e\2\2\u00c7"+
		"\u00c8\7j\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7t\2\2\u00ca@\3\2\2\2\u00cb"+
		"\u00cc\7d\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7n\2\2"+
		"\u00cf\u00d0\7g\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7p\2\2\u00d2B\3\2\2"+
		"\2\u00d3\u00d4\7x\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7"+
		"\7f\2\2\u00d7D\3\2\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7t\2\2\u00da\u00db"+
		"\7w\2\2\u00db\u00dc\7g\2\2\u00dcF\3\2\2\2\u00dd\u00de\7h\2\2\u00de\u00df"+
		"\7c\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7g\2\2\u00e2"+
		"H\3\2\2\2\u00e3\u00e5\t\4\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2"+
		"\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00eb\3\2\2\2\u00e8\u00ea"+
		"\t\5\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ecJ\3\2\2\2\u00ed\u00eb\3\2\2\2\n\2|\u0082\u0087\u008f"+
		"\u009b\u00e6\u00eb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}