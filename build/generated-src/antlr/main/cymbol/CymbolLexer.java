// Generated from cymbol/Cymbol.g4 by ANTLR 4.9.2

    package cymbol;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CymbolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, MINUS=29, LBRACKET=30, RBRACKET=31, 
		ID=32, INT=33, WS=34, SL_COMMENT=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "MINUS", "LBRACKET", "RBRACKET", "ID", "LETTER", 
			"INT", "WS", "SL_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'int'", "'float'", "'void'", "'('", "')'", "','", 
			"'{'", "'}'", "'if'", "'else'", "'while'", "'for'", "'return'", "'!'", 
			"'^'", "'*'", "'/'", "'+'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", 
			"'&&'", "'||'", "'-'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "MINUS", "LBRACKET", "RBRACKET", "ID", 
			"INT", "WS", "SL_COMMENT"
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


	public CymbolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cymbol.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00ca\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\7!\u00ab\n!\f!\16!\u00ae\13!"+
		"\3\"\3\"\3#\6#\u00b3\n#\r#\16#\u00b4\3$\6$\u00b8\n$\r$\16$\u00b9\3$\3"+
		"$\3%\3%\3%\3%\7%\u00c2\n%\f%\16%\u00c5\13%\3%\3%\3%\3%\3\u00c3\2&\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C\2E#G$I%\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u00cd\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3"+
		"\2\2\2\5M\3\2\2\2\7O\3\2\2\2\tS\3\2\2\2\13Y\3\2\2\2\r^\3\2\2\2\17`\3\2"+
		"\2\2\21b\3\2\2\2\23d\3\2\2\2\25f\3\2\2\2\27h\3\2\2\2\31k\3\2\2\2\33p\3"+
		"\2\2\2\35v\3\2\2\2\37z\3\2\2\2!\u0081\3\2\2\2#\u0083\3\2\2\2%\u0085\3"+
		"\2\2\2\'\u0087\3\2\2\2)\u0089\3\2\2\2+\u008b\3\2\2\2-\u008d\3\2\2\2/\u0090"+
		"\3\2\2\2\61\u0092\3\2\2\2\63\u0095\3\2\2\2\65\u0098\3\2\2\2\67\u009b\3"+
		"\2\2\29\u009e\3\2\2\2;\u00a1\3\2\2\2=\u00a3\3\2\2\2?\u00a5\3\2\2\2A\u00a7"+
		"\3\2\2\2C\u00af\3\2\2\2E\u00b2\3\2\2\2G\u00b7\3\2\2\2I\u00bd\3\2\2\2K"+
		"L\7?\2\2L\4\3\2\2\2MN\7=\2\2N\6\3\2\2\2OP\7k\2\2PQ\7p\2\2QR\7v\2\2R\b"+
		"\3\2\2\2ST\7h\2\2TU\7n\2\2UV\7q\2\2VW\7c\2\2WX\7v\2\2X\n\3\2\2\2YZ\7x"+
		"\2\2Z[\7q\2\2[\\\7k\2\2\\]\7f\2\2]\f\3\2\2\2^_\7*\2\2_\16\3\2\2\2`a\7"+
		"+\2\2a\20\3\2\2\2bc\7.\2\2c\22\3\2\2\2de\7}\2\2e\24\3\2\2\2fg\7\177\2"+
		"\2g\26\3\2\2\2hi\7k\2\2ij\7h\2\2j\30\3\2\2\2kl\7g\2\2lm\7n\2\2mn\7u\2"+
		"\2no\7g\2\2o\32\3\2\2\2pq\7y\2\2qr\7j\2\2rs\7k\2\2st\7n\2\2tu\7g\2\2u"+
		"\34\3\2\2\2vw\7h\2\2wx\7q\2\2xy\7t\2\2y\36\3\2\2\2z{\7t\2\2{|\7g\2\2|"+
		"}\7v\2\2}~\7w\2\2~\177\7t\2\2\177\u0080\7p\2\2\u0080 \3\2\2\2\u0081\u0082"+
		"\7#\2\2\u0082\"\3\2\2\2\u0083\u0084\7`\2\2\u0084$\3\2\2\2\u0085\u0086"+
		"\7,\2\2\u0086&\3\2\2\2\u0087\u0088\7\61\2\2\u0088(\3\2\2\2\u0089\u008a"+
		"\7-\2\2\u008a*\3\2\2\2\u008b\u008c\7>\2\2\u008c,\3\2\2\2\u008d\u008e\7"+
		">\2\2\u008e\u008f\7?\2\2\u008f.\3\2\2\2\u0090\u0091\7@\2\2\u0091\60\3"+
		"\2\2\2\u0092\u0093\7@\2\2\u0093\u0094\7?\2\2\u0094\62\3\2\2\2\u0095\u0096"+
		"\7?\2\2\u0096\u0097\7?\2\2\u0097\64\3\2\2\2\u0098\u0099\7#\2\2\u0099\u009a"+
		"\7?\2\2\u009a\66\3\2\2\2\u009b\u009c\7(\2\2\u009c\u009d\7(\2\2\u009d8"+
		"\3\2\2\2\u009e\u009f\7~\2\2\u009f\u00a0\7~\2\2\u00a0:\3\2\2\2\u00a1\u00a2"+
		"\7/\2\2\u00a2<\3\2\2\2\u00a3\u00a4\7]\2\2\u00a4>\3\2\2\2\u00a5\u00a6\7"+
		"_\2\2\u00a6@\3\2\2\2\u00a7\u00ac\5C\"\2\u00a8\u00ab\5C\"\2\u00a9\u00ab"+
		"\t\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00adB\3\2\2\2\u00ae\u00ac\3\2\2\2"+
		"\u00af\u00b0\t\3\2\2\u00b0D\3\2\2\2\u00b1\u00b3\t\2\2\2\u00b2\u00b1\3"+
		"\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"F\3\2\2\2\u00b6\u00b8\t\4\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc"+
		"\b$\2\2\u00bcH\3\2\2\2\u00bd\u00be\7\61\2\2\u00be\u00bf\7\61\2\2\u00bf"+
		"\u00c3\3\2\2\2\u00c0\u00c2\13\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00c7\7\f\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\b%"+
		"\3\2\u00c9J\3\2\2\2\b\2\u00aa\u00ac\u00b4\u00b9\u00c3\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}