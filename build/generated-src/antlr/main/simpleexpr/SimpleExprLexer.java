// Generated from java-escape by ANTLR 4.11.1

package simpleexpr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpleExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, INT=2, WS=3, SEMI=4, EQUAL=5, IF=6, MUL=7, DIV=8, ADD=9, SUB=10, 
		LPAREN=11, RPAREN=12, SL_COMMENT=13, SL_COMMENT2=14, ML_COMMENT=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ID", "INT", "WS", "SEMI", "EQUAL", "IF", "MUL", "DIV", "ADD", "SUB", 
			"LPAREN", "RPAREN", "SL_COMMENT", "SL_COMMENT2", "ML_COMMENT", "DIGIT", 
			"LETTER", "WORD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "';'", "'='", "'if'", "'*'", "'/'", "'+'", "'-'", 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "INT", "WS", "SEMI", "EQUAL", "IF", "MUL", "DIV", "ADD", 
			"SUB", "LPAREN", "RPAREN", "SL_COMMENT", "SL_COMMENT2", "ML_COMMENT"
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


	public SimpleExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleExpr.g4"; }

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
		"\u0004\u0000\u000f\u0084\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0003\u0000(\b\u0000\u0001\u0000\u0005\u0000"+
		"+\b\u0000\n\u0000\f\u0000.\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u00013\b\u0001\n\u0001\f\u00016\t\u0001\u0003\u00018\b\u0001\u0001"+
		"\u0002\u0004\u0002;\b\u0002\u000b\u0002\f\u0002<\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\fX\b\f\n\f\f\f[\t\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\re\b\r\n\r\f\rh\t\r\u0001\r\u0003"+
		"\rk\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000eu\b\u000e\n\u000e\f\u000ex\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0002Yv\u0000\u0012"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0000!\u0000#\u0000\u0001\u0000\u0006\u0001\u00001"+
		"9\u0001\u000009\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u0002\u0000"+
		"AZaz\u0004\u000009AZ__az\u0089\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000"+
		"\u0000\u0000\u00037\u0001\u0000\u0000\u0000\u0005:\u0001\u0000\u0000\u0000"+
		"\u0007@\u0001\u0000\u0000\u0000\tB\u0001\u0000\u0000\u0000\u000bD\u0001"+
		"\u0000\u0000\u0000\rG\u0001\u0000\u0000\u0000\u000fI\u0001\u0000\u0000"+
		"\u0000\u0011K\u0001\u0000\u0000\u0000\u0013M\u0001\u0000\u0000\u0000\u0015"+
		"O\u0001\u0000\u0000\u0000\u0017Q\u0001\u0000\u0000\u0000\u0019S\u0001"+
		"\u0000\u0000\u0000\u001b`\u0001\u0000\u0000\u0000\u001dp\u0001\u0000\u0000"+
		"\u0000\u001f~\u0001\u0000\u0000\u0000!\u0080\u0001\u0000\u0000\u0000#"+
		"\u0082\u0001\u0000\u0000\u0000%(\u0003!\u0010\u0000&(\u0005_\u0000\u0000"+
		"\'%\u0001\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000(,\u0001\u0000\u0000"+
		"\u0000)+\u0003#\u0011\u0000*)\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-\u0002\u0001"+
		"\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/8\u00050\u0000\u000004\u0007"+
		"\u0000\u0000\u000013\u0007\u0001\u0000\u000021\u0001\u0000\u0000\u0000"+
		"36\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000"+
		"\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u00007/\u0001\u0000"+
		"\u0000\u000070\u0001\u0000\u0000\u00008\u0004\u0001\u0000\u0000\u0000"+
		"9;\u0007\u0002\u0000\u0000:9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>?\u0006\u0002\u0000\u0000?\u0006\u0001\u0000\u0000\u0000"+
		"@A\u0005;\u0000\u0000A\b\u0001\u0000\u0000\u0000BC\u0005=\u0000\u0000"+
		"C\n\u0001\u0000\u0000\u0000DE\u0005i\u0000\u0000EF\u0005f\u0000\u0000"+
		"F\f\u0001\u0000\u0000\u0000GH\u0005*\u0000\u0000H\u000e\u0001\u0000\u0000"+
		"\u0000IJ\u0005/\u0000\u0000J\u0010\u0001\u0000\u0000\u0000KL\u0005+\u0000"+
		"\u0000L\u0012\u0001\u0000\u0000\u0000MN\u0005-\u0000\u0000N\u0014\u0001"+
		"\u0000\u0000\u0000OP\u0005(\u0000\u0000P\u0016\u0001\u0000\u0000\u0000"+
		"QR\u0005)\u0000\u0000R\u0018\u0001\u0000\u0000\u0000ST\u0005/\u0000\u0000"+
		"TU\u0005/\u0000\u0000UY\u0001\u0000\u0000\u0000VX\t\u0000\u0000\u0000"+
		"WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000YW\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000\\]\u0005\n\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0006"+
		"\f\u0000\u0000_\u001a\u0001\u0000\u0000\u0000`a\u0005/\u0000\u0000ab\u0005"+
		"/\u0000\u0000bf\u0001\u0000\u0000\u0000ce\b\u0003\u0000\u0000dc\u0001"+
		"\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000"+
		"\u0000ik\u0005\r\u0000\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000kl\u0001\u0000\u0000\u0000lm\u0005\n\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000no\u0006\r\u0000\u0000o\u001c\u0001\u0000\u0000\u0000pq\u0005/\u0000"+
		"\u0000qr\u0005*\u0000\u0000rv\u0001\u0000\u0000\u0000su\t\u0000\u0000"+
		"\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000vt\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000yz\u0005*\u0000\u0000z{\u0005/\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|}\u0006\u000e\u0000\u0000}\u001e\u0001\u0000\u0000\u0000"+
		"~\u007f\u0007\u0001\u0000\u0000\u007f \u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0007\u0004\u0000\u0000\u0081\"\u0001\u0000\u0000\u0000\u0082\u0083\u0007"+
		"\u0005\u0000\u0000\u0083$\u0001\u0000\u0000\u0000\n\u0000\',47<Yfjv\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}