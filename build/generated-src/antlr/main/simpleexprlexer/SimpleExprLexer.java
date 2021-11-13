// Generated from simpleexprlexer/SimpleExprLexer.g4 by ANTLR 4.9.2

    package simpleexprlexer;

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0092\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\5\17Y\n\17\3\17\7\17\\\n\17\f\17\16\17_\13\17\3\20\3\20"+
		"\3\20\7\20d\n\20\f\20\16\20g\13\20\5\20i\n\20\3\21\6\21l\n\21\r\21\16"+
		"\21m\3\21\3\21\3\22\3\22\3\22\3\22\7\22v\n\22\f\22\16\22y\13\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u0083\n\23\f\23\16\23\u0086\13"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\4w\u0084\2"+
		"\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\2)\2+\2\3\2\7\3\2\63;\3\2\62;\5\2\13\f\17\17\""+
		"\"\4\2C\\c|\6\2\62;C\\aac|\2\u0095\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3-\3\2\2\2\5\60\3\2\2"+
		"\2\7\65\3\2\2\2\t9\3\2\2\2\13?\3\2\2\2\rB\3\2\2\2\17H\3\2\2\2\21J\3\2"+
		"\2\2\23L\3\2\2\2\25N\3\2\2\2\27P\3\2\2\2\31R\3\2\2\2\33T\3\2\2\2\35X\3"+
		"\2\2\2\37h\3\2\2\2!k\3\2\2\2#q\3\2\2\2%~\3\2\2\2\'\u008c\3\2\2\2)\u008e"+
		"\3\2\2\2+\u0090\3\2\2\2-.\7k\2\2./\7h\2\2/\4\3\2\2\2\60\61\7g\2\2\61\62"+
		"\7n\2\2\62\63\7u\2\2\63\64\7g\2\2\64\6\3\2\2\2\65\66\7h\2\2\66\67\7q\2"+
		"\2\678\7t\2\28\b\3\2\2\29:\7y\2\2:;\7j\2\2;<\7k\2\2<=\7n\2\2=>\7g\2\2"+
		">\n\3\2\2\2?@\7f\2\2@A\7q\2\2A\f\3\2\2\2BC\7d\2\2CD\7t\2\2DE\7g\2\2EF"+
		"\7c\2\2FG\7m\2\2G\16\3\2\2\2HI\7-\2\2I\20\3\2\2\2JK\7/\2\2K\22\3\2\2\2"+
		"LM\7,\2\2M\24\3\2\2\2NO\7\61\2\2O\26\3\2\2\2PQ\7?\2\2Q\30\3\2\2\2RS\7"+
		"*\2\2S\32\3\2\2\2TU\7+\2\2U\34\3\2\2\2VY\5)\25\2WY\7a\2\2XV\3\2\2\2XW"+
		"\3\2\2\2Y]\3\2\2\2Z\\\5+\26\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2"+
		"^\36\3\2\2\2_]\3\2\2\2`i\7\62\2\2ae\t\2\2\2bd\t\3\2\2cb\3\2\2\2dg\3\2"+
		"\2\2ec\3\2\2\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2h`\3\2\2\2ha\3\2\2\2i \3\2"+
		"\2\2jl\t\4\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\b\21"+
		"\2\2p\"\3\2\2\2qr\7\61\2\2rs\7\61\2\2sw\3\2\2\2tv\13\2\2\2ut\3\2\2\2v"+
		"y\3\2\2\2wx\3\2\2\2wu\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\f\2\2{|\3\2\2\2"+
		"|}\b\22\2\2}$\3\2\2\2~\177\7\61\2\2\177\u0080\7,\2\2\u0080\u0084\3\2\2"+
		"\2\u0081\u0083\13\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0088\7,\2\2\u0088\u0089\7\61\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\b\23\2\2\u008b&\3\2\2\2\u008c\u008d\t\3\2\2\u008d(\3\2\2\2\u008e"+
		"\u008f\t\5\2\2\u008f*\3\2\2\2\u0090\u0091\t\6\2\2\u0091,\3\2\2\2\n\2X"+
		"]ehmw\u0084\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}