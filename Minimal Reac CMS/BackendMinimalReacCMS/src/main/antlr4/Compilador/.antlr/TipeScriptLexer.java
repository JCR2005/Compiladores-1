// Generated from /home/carlos/NetBeansProjects/BackendMinimalReacCMS/src/main/antlr4/Compilador/TipeScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TipeScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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
		"\u0004\u0000$\u00ec\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012y\b\u0012"+
		"\u000b\u0012\f\u0012z\u0001\u0012\u0001\u0012\u0004\u0012\u007f\b\u0012"+
		"\u000b\u0012\f\u0012\u0080\u0001\u0013\u0004\u0013\u0084\b\u0013\u000b"+
		"\u0013\f\u0013\u0085\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u008c\b\u0015\n\u0015\f\u0015\u008f\t\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0004\u0017"+
		"\u0098\b\u0017\u000b\u0017\f\u0017\u0099\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0004#\u00e3\b#\u000b#\f#\u00e4\u0001#\u0005"+
		"#\u00e8\b#\n#\f#\u00eb\t#\u0001\u008d\u0000$\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$\u0001\u0000\u0004\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  \u0002\u0000AZaz\u0005\u000009AZ\\\\__az\u00f2"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0001I\u0001\u0000\u0000\u0000\u0003K"+
		"\u0001\u0000\u0000\u0000\u0005M\u0001\u0000\u0000\u0000\u0007O\u0001\u0000"+
		"\u0000\u0000\tQ\u0001\u0000\u0000\u0000\u000bS\u0001\u0000\u0000\u0000"+
		"\rU\u0001\u0000\u0000\u0000\u000f[\u0001\u0000\u0000\u0000\u0011b\u0001"+
		"\u0000\u0000\u0000\u0013d\u0001\u0000\u0000\u0000\u0015f\u0001\u0000\u0000"+
		"\u0000\u0017h\u0001\u0000\u0000\u0000\u0019j\u0001\u0000\u0000\u0000\u001b"+
		"m\u0001\u0000\u0000\u0000\u001do\u0001\u0000\u0000\u0000\u001fq\u0001"+
		"\u0000\u0000\u0000!s\u0001\u0000\u0000\u0000#u\u0001\u0000\u0000\u0000"+
		"%x\u0001\u0000\u0000\u0000\'\u0083\u0001\u0000\u0000\u0000)\u0087\u0001"+
		"\u0000\u0000\u0000+\u0089\u0001\u0000\u0000\u0000-\u0092\u0001\u0000\u0000"+
		"\u0000/\u0097\u0001\u0000\u0000\u00001\u009d\u0001\u0000\u0000\u00003"+
		"\u00a1\u0001\u0000\u0000\u00005\u00a9\u0001\u0000\u0000\u00007\u00ad\u0001"+
		"\u0000\u0000\u00009\u00b6\u0001\u0000\u0000\u0000;\u00bd\u0001\u0000\u0000"+
		"\u0000=\u00c4\u0001\u0000\u0000\u0000?\u00c9\u0001\u0000\u0000\u0000A"+
		"\u00d1\u0001\u0000\u0000\u0000C\u00d6\u0001\u0000\u0000\u0000E\u00db\u0001"+
		"\u0000\u0000\u0000G\u00e2\u0001\u0000\u0000\u0000IJ\u0005.\u0000\u0000"+
		"J\u0002\u0001\u0000\u0000\u0000KL\u0005+\u0000\u0000L\u0004\u0001\u0000"+
		"\u0000\u0000MN\u0005-\u0000\u0000N\u0006\u0001\u0000\u0000\u0000OP\u0005"+
		"*\u0000\u0000P\b\u0001\u0000\u0000\u0000QR\u0005/\u0000\u0000R\n\u0001"+
		"\u0000\u0000\u0000ST\u0005^\u0000\u0000T\f\u0001\u0000\u0000\u0000UV\u0005"+
		"c\u0000\u0000VW\u0005o\u0000\u0000WX\u0005n\u0000\u0000XY\u0005s\u0000"+
		"\u0000YZ\u0005t\u0000\u0000Z\u000e\u0001\u0000\u0000\u0000[\\\u0005r\u0000"+
		"\u0000\\]\u0005e\u0000\u0000]^\u0005t\u0000\u0000^_\u0005u\u0000\u0000"+
		"_`\u0005r\u0000\u0000`a\u0005n\u0000\u0000a\u0010\u0001\u0000\u0000\u0000"+
		"bc\u0005,\u0000\u0000c\u0012\u0001\u0000\u0000\u0000de\u0005(\u0000\u0000"+
		"e\u0014\u0001\u0000\u0000\u0000fg\u0005)\u0000\u0000g\u0016\u0001\u0000"+
		"\u0000\u0000hi\u0005=\u0000\u0000i\u0018\u0001\u0000\u0000\u0000jk\u0005"+
		"=\u0000\u0000kl\u0005>\u0000\u0000l\u001a\u0001\u0000\u0000\u0000mn\u0005"+
		"{\u0000\u0000n\u001c\u0001\u0000\u0000\u0000op\u0005}\u0000\u0000p\u001e"+
		"\u0001\u0000\u0000\u0000qr\u0005>\u0000\u0000r \u0001\u0000\u0000\u0000"+
		"st\u0005<\u0000\u0000t\"\u0001\u0000\u0000\u0000uv\u0005;\u0000\u0000"+
		"v$\u0001\u0000\u0000\u0000wy\u0007\u0000\u0000\u0000xw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0005.\u0000\u0000}\u007f\u0007"+
		"\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081&\u0001\u0000\u0000\u0000\u0082\u0084\u0007\u0000\u0000\u0000\u0083"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"(\u0001\u0000\u0000\u0000\u0087\u0088\u0005:\u0000\u0000\u0088*\u0001"+
		"\u0000\u0000\u0000\u0089\u008d\u0005\"\u0000\u0000\u008a\u008c\t\u0000"+
		"\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0005\"\u0000\u0000\u0091,\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0005\'\u0000\u0000\u0093\u0094\t\u0000\u0000\u0000"+
		"\u0094\u0095\u0005\'\u0000\u0000\u0095.\u0001\u0000\u0000\u0000\u0096"+
		"\u0098\u0007\u0001\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0006\u0017\u0000\u0000\u009c0\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0005v\u0000\u0000\u009e\u009f\u0005a\u0000\u0000\u009f\u00a0\u0005r"+
		"\u0000\u0000\u00a02\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005c\u0000\u0000"+
		"\u00a2\u00a3\u0005o\u0000\u0000\u00a3\u00a4\u0005n\u0000\u0000\u00a4\u00a5"+
		"\u0005s\u0000\u0000\u00a5\u00a6\u0005o\u0000\u0000\u00a6\u00a7\u0005l"+
		"\u0000\u0000\u00a7\u00a8\u0005e\u0000\u0000\u00a84\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0005l\u0000\u0000\u00aa\u00ab\u0005o\u0000\u0000\u00ab\u00ac"+
		"\u0005g\u0000\u0000\u00ac6\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005f"+
		"\u0000\u0000\u00ae\u00af\u0005u\u0000\u0000\u00af\u00b0\u0005n\u0000\u0000"+
		"\u00b0\u00b1\u0005c\u0000\u0000\u00b1\u00b2\u0005t\u0000\u0000\u00b2\u00b3"+
		"\u0005i\u0000\u0000\u00b3\u00b4\u0005o\u0000\u0000\u00b4\u00b5\u0005n"+
		"\u0000\u0000\u00b58\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005n\u0000\u0000"+
		"\u00b7\u00b8\u0005u\u0000\u0000\u00b8\u00b9\u0005m\u0000\u0000\u00b9\u00ba"+
		"\u0005b\u0000\u0000\u00ba\u00bb\u0005e\u0000\u0000\u00bb\u00bc\u0005r"+
		"\u0000\u0000\u00bc:\u0001\u0000\u0000\u0000\u00bd\u00be\u0005s\u0000\u0000"+
		"\u00be\u00bf\u0005t\u0000\u0000\u00bf\u00c0\u0005r\u0000\u0000\u00c0\u00c1"+
		"\u0005i\u0000\u0000\u00c1\u00c2\u0005n\u0000\u0000\u00c2\u00c3\u0005g"+
		"\u0000\u0000\u00c3<\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005c\u0000\u0000"+
		"\u00c5\u00c6\u0005h\u0000\u0000\u00c6\u00c7\u0005a\u0000\u0000\u00c7\u00c8"+
		"\u0005r\u0000\u0000\u00c8>\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005b"+
		"\u0000\u0000\u00ca\u00cb\u0005o\u0000\u0000\u00cb\u00cc\u0005o\u0000\u0000"+
		"\u00cc\u00cd\u0005l\u0000\u0000\u00cd\u00ce\u0005e\u0000\u0000\u00ce\u00cf"+
		"\u0005a\u0000\u0000\u00cf\u00d0\u0005n\u0000\u0000\u00d0@\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0005v\u0000\u0000\u00d2\u00d3\u0005o\u0000\u0000"+
		"\u00d3\u00d4\u0005i\u0000\u0000\u00d4\u00d5\u0005d\u0000\u0000\u00d5B"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005t\u0000\u0000\u00d7\u00d8\u0005"+
		"r\u0000\u0000\u00d8\u00d9\u0005u\u0000\u0000\u00d9\u00da\u0005e\u0000"+
		"\u0000\u00daD\u0001\u0000\u0000\u0000\u00db\u00dc\u0005f\u0000\u0000\u00dc"+
		"\u00dd\u0005a\u0000\u0000\u00dd\u00de\u0005l\u0000\u0000\u00de\u00df\u0005"+
		"s\u0000\u0000\u00df\u00e0\u0005e\u0000\u0000\u00e0F\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e3\u0007\u0002\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e8\u0007\u0003\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00eaH\u0001\u0000\u0000\u0000"+
		"\u00eb\u00e9\u0001\u0000\u0000\u0000\b\u0000z\u0080\u0085\u008d\u0099"+
		"\u00e4\u00e9\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}