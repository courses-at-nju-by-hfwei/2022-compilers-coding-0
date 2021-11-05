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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ID=8, INT=9, WS=10, 
		SL_COMMENT=11, ML_COMMENT=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "ID", "INT", 
			"WS", "SL_COMMENT", "ML_COMMENT", "DIGIT", "LETTER", "WORD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'*'", "'/'", "'+'", "'-'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "ID", "INT", "WS", "SL_COMMENT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16k\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\5\t\62\n\t\3\t\7\t\65\n\t"+
		"\f\t\16\t8\13\t\3\n\3\n\3\n\7\n=\n\n\f\n\16\n@\13\n\5\nB\n\n\3\13\6\13"+
		"E\n\13\r\13\16\13F\3\13\3\13\3\f\3\f\3\f\3\f\7\fO\n\f\f\f\16\fR\13\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\\\n\r\f\r\16\r_\13\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\4P]\2\21\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\2\35\2\37\2\3\2\7\3\2\63;\3\2\62;"+
		"\5\2\13\f\17\17\"\"\4\2C\\c|\6\2\62;C\\aac|\2n\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3!\3\2\2\2"+
		"\5#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13)\3\2\2\2\r+\3\2\2\2\17-\3\2\2\2"+
		"\21\61\3\2\2\2\23A\3\2\2\2\25D\3\2\2\2\27J\3\2\2\2\31W\3\2\2\2\33e\3\2"+
		"\2\2\35g\3\2\2\2\37i\3\2\2\2!\"\7?\2\2\"\4\3\2\2\2#$\7,\2\2$\6\3\2\2\2"+
		"%&\7\61\2\2&\b\3\2\2\2\'(\7-\2\2(\n\3\2\2\2)*\7/\2\2*\f\3\2\2\2+,\7*\2"+
		"\2,\16\3\2\2\2-.\7+\2\2.\20\3\2\2\2/\62\5\35\17\2\60\62\7a\2\2\61/\3\2"+
		"\2\2\61\60\3\2\2\2\62\66\3\2\2\2\63\65\5\37\20\2\64\63\3\2\2\2\658\3\2"+
		"\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\22\3\2\2\28\66\3\2\2\29B\7\62\2\2"+
		":>\t\2\2\2;=\t\3\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?B\3\2\2\2"+
		"@>\3\2\2\2A9\3\2\2\2A:\3\2\2\2B\24\3\2\2\2CE\t\4\2\2DC\3\2\2\2EF\3\2\2"+
		"\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\b\13\2\2I\26\3\2\2\2JK\7\61\2\2KL\7"+
		"\61\2\2LP\3\2\2\2MO\13\2\2\2NM\3\2\2\2OR\3\2\2\2PQ\3\2\2\2PN\3\2\2\2Q"+
		"S\3\2\2\2RP\3\2\2\2ST\7\f\2\2TU\3\2\2\2UV\b\f\2\2V\30\3\2\2\2WX\7\61\2"+
		"\2XY\7,\2\2Y]\3\2\2\2Z\\\13\2\2\2[Z\3\2\2\2\\_\3\2\2\2]^\3\2\2\2][\3\2"+
		"\2\2^`\3\2\2\2_]\3\2\2\2`a\7,\2\2ab\7\61\2\2bc\3\2\2\2cd\b\r\2\2d\32\3"+
		"\2\2\2ef\t\3\2\2f\34\3\2\2\2gh\t\5\2\2h\36\3\2\2\2ij\t\6\2\2j \3\2\2\2"+
		"\n\2\61\66>AFP]\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}