// Generated from java-escape by ANTLR 4.11.1

package simpleexprlexer;

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
		IF=1, ELSE=2, FOR=3, WHILE=4, DO=5, BREAK=6, ADD=7, SUB=8, MUL=9, DIV=10, 
		ASSIGN=11, LBRACE=12, RBRACE=13, ID=14, INT=15, WS=16, SL_COMMENT=17, 
		ML_COMMENT=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "FOR", "WHILE", "DO", "BREAK", "ADD", "SUB", "MUL", "DIV", 
			"ASSIGN", "LBRACE", "RBRACE", "ID", "INT", "WS", "SL_COMMENT", "ML_COMMENT", 
			"DIGIT", "LETTER", "WORD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'for'", "'while'", "'do'", "'break'", "'+'", 
			"'-'", "'*'", "'/'", "'='", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "FOR", "WHILE", "DO", "BREAK", "ADD", "SUB", "MUL", 
			"DIV", "ASSIGN", "LBRACE", "RBRACE", "ID", "INT", "WS", "SL_COMMENT", 
			"ML_COMMENT"
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
	public String getGrammarFileName() { return "SimpleExprLexer.g4"; }

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
		"\u0004\u0000\u0012\u0090\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0003\rW\b\r\u0001\r\u0005"+
		"\rZ\b\r\n\r\f\r]\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000eb"+
		"\b\u000e\n\u000e\f\u000ee\t\u000e\u0003\u000eg\b\u000e\u0001\u000f\u0004"+
		"\u000fj\b\u000f\u000b\u000f\f\u000fk\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010t\b\u0010\n\u0010\f\u0010"+
		"w\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0081\b\u0011\n\u0011"+
		"\f\u0011\u0084\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0002u\u0082\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0000\'\u0000)\u0000\u0001\u0000\u0005\u0001\u000019\u0001\u000009\u0003"+
		"\u0000\t\n\r\r  \u0002\u0000AZaz\u0004\u000009AZ__az\u0093\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003"+
		".\u0001\u0000\u0000\u0000\u00053\u0001\u0000\u0000\u0000\u00077\u0001"+
		"\u0000\u0000\u0000\t=\u0001\u0000\u0000\u0000\u000b@\u0001\u0000\u0000"+
		"\u0000\rF\u0001\u0000\u0000\u0000\u000fH\u0001\u0000\u0000\u0000\u0011"+
		"J\u0001\u0000\u0000\u0000\u0013L\u0001\u0000\u0000\u0000\u0015N\u0001"+
		"\u0000\u0000\u0000\u0017P\u0001\u0000\u0000\u0000\u0019R\u0001\u0000\u0000"+
		"\u0000\u001bV\u0001\u0000\u0000\u0000\u001df\u0001\u0000\u0000\u0000\u001f"+
		"i\u0001\u0000\u0000\u0000!o\u0001\u0000\u0000\u0000#|\u0001\u0000\u0000"+
		"\u0000%\u008a\u0001\u0000\u0000\u0000\'\u008c\u0001\u0000\u0000\u0000"+
		")\u008e\u0001\u0000\u0000\u0000+,\u0005i\u0000\u0000,-\u0005f\u0000\u0000"+
		"-\u0002\u0001\u0000\u0000\u0000./\u0005e\u0000\u0000/0\u0005l\u0000\u0000"+
		"01\u0005s\u0000\u000012\u0005e\u0000\u00002\u0004\u0001\u0000\u0000\u0000"+
		"34\u0005f\u0000\u000045\u0005o\u0000\u000056\u0005r\u0000\u00006\u0006"+
		"\u0001\u0000\u0000\u000078\u0005w\u0000\u000089\u0005h\u0000\u00009:\u0005"+
		"i\u0000\u0000:;\u0005l\u0000\u0000;<\u0005e\u0000\u0000<\b\u0001\u0000"+
		"\u0000\u0000=>\u0005d\u0000\u0000>?\u0005o\u0000\u0000?\n\u0001\u0000"+
		"\u0000\u0000@A\u0005b\u0000\u0000AB\u0005r\u0000\u0000BC\u0005e\u0000"+
		"\u0000CD\u0005a\u0000\u0000DE\u0005k\u0000\u0000E\f\u0001\u0000\u0000"+
		"\u0000FG\u0005+\u0000\u0000G\u000e\u0001\u0000\u0000\u0000HI\u0005-\u0000"+
		"\u0000I\u0010\u0001\u0000\u0000\u0000JK\u0005*\u0000\u0000K\u0012\u0001"+
		"\u0000\u0000\u0000LM\u0005/\u0000\u0000M\u0014\u0001\u0000\u0000\u0000"+
		"NO\u0005=\u0000\u0000O\u0016\u0001\u0000\u0000\u0000PQ\u0005(\u0000\u0000"+
		"Q\u0018\u0001\u0000\u0000\u0000RS\u0005)\u0000\u0000S\u001a\u0001\u0000"+
		"\u0000\u0000TW\u0003\'\u0013\u0000UW\u0005_\u0000\u0000VT\u0001\u0000"+
		"\u0000\u0000VU\u0001\u0000\u0000\u0000W[\u0001\u0000\u0000\u0000XZ\u0003"+
		")\u0014\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u001c\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000^g\u00050\u0000\u0000_c\u0007\u0000\u0000"+
		"\u0000`b\u0007\u0001\u0000\u0000a`\u0001\u0000\u0000\u0000be\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000dg\u0001"+
		"\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000f^\u0001\u0000\u0000\u0000"+
		"f_\u0001\u0000\u0000\u0000g\u001e\u0001\u0000\u0000\u0000hj\u0007\u0002"+
		"\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"mn\u0006\u000f\u0000\u0000n \u0001\u0000\u0000\u0000op\u0005/\u0000\u0000"+
		"pq\u0005/\u0000\u0000qu\u0001\u0000\u0000\u0000rt\t\u0000\u0000\u0000"+
		"sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000xy\u0005\n\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0006\u0010"+
		"\u0000\u0000{\"\u0001\u0000\u0000\u0000|}\u0005/\u0000\u0000}~\u0005*"+
		"\u0000\u0000~\u0082\u0001\u0000\u0000\u0000\u007f\u0081\t\u0000\u0000"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000"+
		"\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005*\u0000\u0000\u0086\u0087\u0005/\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0006\u0011\u0000\u0000\u0089"+
		"$\u0001\u0000\u0000\u0000\u008a\u008b\u0007\u0001\u0000\u0000\u008b&\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0007\u0003\u0000\u0000\u008d(\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0007\u0004\u0000\u0000\u008f*\u0001\u0000\u0000"+
		"\u0000\b\u0000V[cfku\u0082\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}