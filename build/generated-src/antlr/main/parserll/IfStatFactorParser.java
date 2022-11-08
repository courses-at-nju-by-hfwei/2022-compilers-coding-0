// Generated from java-escape by ANTLR 4.11.1

    package parserll;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class IfStatFactorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ID=4, WS=5;
	public static final int
		RULE_stat = 0, RULE_stat_prime = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"stat", "stat_prime", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ID", "WS"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IfStatFactorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Stat_primeContext stat_prime() {
			return getRuleContext(Stat_primeContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfStatFactorListener ) ((IfStatFactorListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfStatFactorListener ) ((IfStatFactorListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IfStatFactorVisitor ) return ((IfStatFactorVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		try {
			setState(13);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				match(T__0);
				setState(7);
				expr();
				setState(8);
				match(T__1);
				setState(9);
				stat();
				setState(10);
				stat_prime();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Stat_primeContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Stat_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfStatFactorListener ) ((IfStatFactorListener)listener).enterStat_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfStatFactorListener ) ((IfStatFactorListener)listener).exitStat_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IfStatFactorVisitor ) return ((IfStatFactorVisitor<? extends T>)visitor).visitStat_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_primeContext stat_prime() throws RecognitionException {
		Stat_primeContext _localctx = new Stat_primeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat_prime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(15);
				match(T__2);
				setState(16);
				stat();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IfStatFactorParser.ID, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfStatFactorListener ) ((IfStatFactorListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfStatFactorListener ) ((IfStatFactorListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IfStatFactorVisitor ) return ((IfStatFactorVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0005\u0016\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u000e\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0012\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0000\u0000\u0003\u0000\u0002\u0004\u0000\u0000\u0014\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0002\u0011\u0001\u0000\u0000\u0000\u0004\u0013\u0001\u0000"+
		"\u0000\u0000\u0006\u0007\u0005\u0001\u0000\u0000\u0007\b\u0003\u0004\u0002"+
		"\u0000\b\t\u0005\u0002\u0000\u0000\t\n\u0003\u0000\u0000\u0000\n\u000b"+
		"\u0003\u0002\u0001\u0000\u000b\u000e\u0001\u0000\u0000\u0000\f\u000e\u0003"+
		"\u0004\u0002\u0000\r\u0006\u0001\u0000\u0000\u0000\r\f\u0001\u0000\u0000"+
		"\u0000\u000e\u0001\u0001\u0000\u0000\u0000\u000f\u0010\u0005\u0003\u0000"+
		"\u0000\u0010\u0012\u0003\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000"+
		"\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0003\u0001\u0000\u0000"+
		"\u0000\u0013\u0014\u0005\u0004\u0000\u0000\u0014\u0005\u0001\u0000\u0000"+
		"\u0000\u0002\r\u0011";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}