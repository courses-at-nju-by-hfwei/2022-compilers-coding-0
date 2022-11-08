// Generated from java-escape by ANTLR 4.11.1

package cymbol;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CymbolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUAL=1, SEMI=2, LPAREN=3, RPAREN=4, COMMA=5, LBRACE=6, RBRACE=7, IF=8, 
		ELSE=9, WHILE=10, FOR=11, RETURN=12, INTTYPE=13, FLOATTYPE=14, VOIDTYPE=15, 
		LBRACK=16, RBRACK=17, SUB=18, LNOT=19, POWER=20, MUL=21, DIV=22, ADD=23, 
		LT=24, LE=25, GT=26, GE=27, EQUAL_EQUAL=28, NOT_EQUAL=29, LAND=30, LOR=31, 
		ID=32, INT=33, WS=34, SL_COMMENT=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EQUAL", "SEMI", "LPAREN", "RPAREN", "COMMA", "LBRACE", "RBRACE", "IF", 
			"ELSE", "WHILE", "FOR", "RETURN", "INTTYPE", "FLOATTYPE", "VOIDTYPE", 
			"LBRACK", "RBRACK", "SUB", "LNOT", "POWER", "MUL", "DIV", "ADD", "LT", 
			"LE", "GT", "GE", "EQUAL_EQUAL", "NOT_EQUAL", "LAND", "LOR", "ID", "LETTER", 
			"INT", "WS", "SL_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'('", "')'", "','", "'{'", "'}'", "'if'", "'else'", 
			"'while'", "'for'", "'return'", "'int'", "'float'", "'void'", "'['", 
			"']'", "'-'", "'!'", "'^'", "'*'", "'/'", "'+'", "'<'", "'<='", "'>'", 
			"'>='", "'=='", "'!='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQUAL", "SEMI", "LPAREN", "RPAREN", "COMMA", "LBRACE", "RBRACE", 
			"IF", "ELSE", "WHILE", "FOR", "RETURN", "INTTYPE", "FLOATTYPE", "VOIDTYPE", 
			"LBRACK", "RBRACK", "SUB", "LNOT", "POWER", "MUL", "DIV", "ADD", "LT", 
			"LE", "GT", "GE", "EQUAL_EQUAL", "NOT_EQUAL", "LAND", "LOR", "ID", "INT", 
			"WS", "SL_COMMENT"
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
		"\u0004\u0000#\u00c8\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
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
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u00a9\b\u001f\n\u001f\f\u001f\u00ac\t\u001f\u0001 \u0001 \u0001"+
		"!\u0004!\u00b1\b!\u000b!\f!\u00b2\u0001\"\u0004\"\u00b6\b\"\u000b\"\f"+
		"\"\u00b7\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0005#\u00c0\b#\n"+
		"#\f#\u00c3\t#\u0001#\u0001#\u0001#\u0001#\u0001\u00c1\u0000$\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"1\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A\u0000C!E\"G#\u0001"+
		"\u0000\u0003\u0001\u000009\u0002\u0000AZaz\u0003\u0000\t\n\r\r  \u00cb"+
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
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000C\u0001\u0000"+
		"\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000"+
		"\u0001I\u0001\u0000\u0000\u0000\u0003K\u0001\u0000\u0000\u0000\u0005M"+
		"\u0001\u0000\u0000\u0000\u0007O\u0001\u0000\u0000\u0000\tQ\u0001\u0000"+
		"\u0000\u0000\u000bS\u0001\u0000\u0000\u0000\rU\u0001\u0000\u0000\u0000"+
		"\u000fW\u0001\u0000\u0000\u0000\u0011Z\u0001\u0000\u0000\u0000\u0013_"+
		"\u0001\u0000\u0000\u0000\u0015e\u0001\u0000\u0000\u0000\u0017i\u0001\u0000"+
		"\u0000\u0000\u0019p\u0001\u0000\u0000\u0000\u001bt\u0001\u0000\u0000\u0000"+
		"\u001dz\u0001\u0000\u0000\u0000\u001f\u007f\u0001\u0000\u0000\u0000!\u0081"+
		"\u0001\u0000\u0000\u0000#\u0083\u0001\u0000\u0000\u0000%\u0085\u0001\u0000"+
		"\u0000\u0000\'\u0087\u0001\u0000\u0000\u0000)\u0089\u0001\u0000\u0000"+
		"\u0000+\u008b\u0001\u0000\u0000\u0000-\u008d\u0001\u0000\u0000\u0000/"+
		"\u008f\u0001\u0000\u0000\u00001\u0091\u0001\u0000\u0000\u00003\u0094\u0001"+
		"\u0000\u0000\u00005\u0096\u0001\u0000\u0000\u00007\u0099\u0001\u0000\u0000"+
		"\u00009\u009c\u0001\u0000\u0000\u0000;\u009f\u0001\u0000\u0000\u0000="+
		"\u00a2\u0001\u0000\u0000\u0000?\u00a5\u0001\u0000\u0000\u0000A\u00ad\u0001"+
		"\u0000\u0000\u0000C\u00b0\u0001\u0000\u0000\u0000E\u00b5\u0001\u0000\u0000"+
		"\u0000G\u00bb\u0001\u0000\u0000\u0000IJ\u0005=\u0000\u0000J\u0002\u0001"+
		"\u0000\u0000\u0000KL\u0005;\u0000\u0000L\u0004\u0001\u0000\u0000\u0000"+
		"MN\u0005(\u0000\u0000N\u0006\u0001\u0000\u0000\u0000OP\u0005)\u0000\u0000"+
		"P\b\u0001\u0000\u0000\u0000QR\u0005,\u0000\u0000R\n\u0001\u0000\u0000"+
		"\u0000ST\u0005{\u0000\u0000T\f\u0001\u0000\u0000\u0000UV\u0005}\u0000"+
		"\u0000V\u000e\u0001\u0000\u0000\u0000WX\u0005i\u0000\u0000XY\u0005f\u0000"+
		"\u0000Y\u0010\u0001\u0000\u0000\u0000Z[\u0005e\u0000\u0000[\\\u0005l\u0000"+
		"\u0000\\]\u0005s\u0000\u0000]^\u0005e\u0000\u0000^\u0012\u0001\u0000\u0000"+
		"\u0000_`\u0005w\u0000\u0000`a\u0005h\u0000\u0000ab\u0005i\u0000\u0000"+
		"bc\u0005l\u0000\u0000cd\u0005e\u0000\u0000d\u0014\u0001\u0000\u0000\u0000"+
		"ef\u0005f\u0000\u0000fg\u0005o\u0000\u0000gh\u0005r\u0000\u0000h\u0016"+
		"\u0001\u0000\u0000\u0000ij\u0005r\u0000\u0000jk\u0005e\u0000\u0000kl\u0005"+
		"t\u0000\u0000lm\u0005u\u0000\u0000mn\u0005r\u0000\u0000no\u0005n\u0000"+
		"\u0000o\u0018\u0001\u0000\u0000\u0000pq\u0005i\u0000\u0000qr\u0005n\u0000"+
		"\u0000rs\u0005t\u0000\u0000s\u001a\u0001\u0000\u0000\u0000tu\u0005f\u0000"+
		"\u0000uv\u0005l\u0000\u0000vw\u0005o\u0000\u0000wx\u0005a\u0000\u0000"+
		"xy\u0005t\u0000\u0000y\u001c\u0001\u0000\u0000\u0000z{\u0005v\u0000\u0000"+
		"{|\u0005o\u0000\u0000|}\u0005i\u0000\u0000}~\u0005d\u0000\u0000~\u001e"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0005[\u0000\u0000\u0080 \u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0005]\u0000\u0000\u0082\"\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005-\u0000\u0000\u0084$\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0005!\u0000\u0000\u0086&\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"^\u0000\u0000\u0088(\u0001\u0000\u0000\u0000\u0089\u008a\u0005*\u0000"+
		"\u0000\u008a*\u0001\u0000\u0000\u0000\u008b\u008c\u0005/\u0000\u0000\u008c"+
		",\u0001\u0000\u0000\u0000\u008d\u008e\u0005+\u0000\u0000\u008e.\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0005<\u0000\u0000\u00900\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005<\u0000\u0000\u0092\u0093\u0005=\u0000\u0000\u0093"+
		"2\u0001\u0000\u0000\u0000\u0094\u0095\u0005>\u0000\u0000\u00954\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005>\u0000\u0000\u0097\u0098\u0005=\u0000"+
		"\u0000\u00986\u0001\u0000\u0000\u0000\u0099\u009a\u0005=\u0000\u0000\u009a"+
		"\u009b\u0005=\u0000\u0000\u009b8\u0001\u0000\u0000\u0000\u009c\u009d\u0005"+
		"!\u0000\u0000\u009d\u009e\u0005=\u0000\u0000\u009e:\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0005&\u0000\u0000\u00a0\u00a1\u0005&\u0000\u0000\u00a1"+
		"<\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005|\u0000\u0000\u00a3\u00a4\u0005"+
		"|\u0000\u0000\u00a4>\u0001\u0000\u0000\u0000\u00a5\u00aa\u0003A \u0000"+
		"\u00a6\u00a9\u0003A \u0000\u00a7\u00a9\u0007\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00ac"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ab@\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0007\u0001\u0000\u0000\u00aeB\u0001\u0000"+
		"\u0000\u0000\u00af\u00b1\u0007\u0000\u0000\u0000\u00b0\u00af\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3D\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b6\u0007\u0002\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0006\"\u0000\u0000\u00baF\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0005/\u0000\u0000\u00bc\u00bd\u0005/\u0000\u0000\u00bd\u00c1"+
		"\u0001\u0000\u0000\u0000\u00be\u00c0\t\u0000\u0000\u0000\u00bf\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005"+
		"\n\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0006#"+
		"\u0001\u0000\u00c7H\u0001\u0000\u0000\u0000\u0006\u0000\u00a8\u00aa\u00b2"+
		"\u00b7\u00c1\u0002\u0006\u0000\u0000\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}