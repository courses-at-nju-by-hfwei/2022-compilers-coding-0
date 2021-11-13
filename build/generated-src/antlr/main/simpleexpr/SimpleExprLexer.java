// Generated from simpleexpr/SimpleExpr.g4 by ANTLR 4.9.2

    package simpleexpr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ID=9, 
		INT=10, WS=11, SL_COMMENT=12, ML_COMMENT=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "ID", 
			"INT", "WS", "SL_COMMENT", "ML_COMMENT", "DIGIT", "LETTER", "WORD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'if'", "'*'", "'/'", "'+'", "'-'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "ID", "INT", "WS", 
			"SL_COMMENT", "ML_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\5\n"+
		"\67\n\n\3\n\7\n:\n\n\f\n\16\n=\13\n\3\13\3\13\3\13\7\13B\n\13\f\13\16"+
		"\13E\13\13\5\13G\n\13\3\f\6\fJ\n\f\r\f\16\fK\3\f\3\f\3\r\3\r\3\r\3\r\7"+
		"\rT\n\r\f\r\16\rW\13\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16a\n\16"+
		"\f\16\16\16d\13\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\4Ub\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\2\37\2!\2\3\2\7\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\4\2C\\c|"+
		"\6\2\62;C\\aac|\2s\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7(\3\2"+
		"\2\2\t*\3\2\2\2\13,\3\2\2\2\r.\3\2\2\2\17\60\3\2\2\2\21\62\3\2\2\2\23"+
		"\66\3\2\2\2\25F\3\2\2\2\27I\3\2\2\2\31O\3\2\2\2\33\\\3\2\2\2\35j\3\2\2"+
		"\2\37l\3\2\2\2!n\3\2\2\2#$\7?\2\2$\4\3\2\2\2%&\7k\2\2&\'\7h\2\2\'\6\3"+
		"\2\2\2()\7,\2\2)\b\3\2\2\2*+\7\61\2\2+\n\3\2\2\2,-\7-\2\2-\f\3\2\2\2."+
		"/\7/\2\2/\16\3\2\2\2\60\61\7*\2\2\61\20\3\2\2\2\62\63\7+\2\2\63\22\3\2"+
		"\2\2\64\67\5\37\20\2\65\67\7a\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67;\3\2"+
		"\2\28:\5!\21\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\24\3\2\2\2=;\3"+
		"\2\2\2>G\7\62\2\2?C\t\2\2\2@B\t\3\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD"+
		"\3\2\2\2DG\3\2\2\2EC\3\2\2\2F>\3\2\2\2F?\3\2\2\2G\26\3\2\2\2HJ\t\4\2\2"+
		"IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\b\f\2\2N\30\3\2\2"+
		"\2OP\7\61\2\2PQ\7\61\2\2QU\3\2\2\2RT\13\2\2\2SR\3\2\2\2TW\3\2\2\2UV\3"+
		"\2\2\2US\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7\f\2\2YZ\3\2\2\2Z[\b\r\2\2[\32"+
		"\3\2\2\2\\]\7\61\2\2]^\7,\2\2^b\3\2\2\2_a\13\2\2\2`_\3\2\2\2ad\3\2\2\2"+
		"bc\3\2\2\2b`\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7,\2\2fg\7\61\2\2gh\3\2\2\2"+
		"hi\b\16\2\2i\34\3\2\2\2jk\t\3\2\2k\36\3\2\2\2lm\t\5\2\2m \3\2\2\2no\t"+
		"\6\2\2o\"\3\2\2\2\n\2\66;CFKUb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}