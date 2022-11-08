// Generated from java-escape by ANTLR 4.11.1

    package parserantlr.expr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprRRParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ID=7, WS=8;
	public static final int
		RULE_expr = 0, RULE_expr_prime = 1, RULE_term = 2, RULE_term_prime = 3, 
		RULE_factor = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "expr_prime", "term", "term_prime", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "ID", "WS"
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

	public ExprRRParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Expr_primeContext expr_prime() {
			return getRuleContext(Expr_primeContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRRListener ) ((ExprRRListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRRListener ) ((ExprRRListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRRVisitor ) return ((ExprRRVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			term();
			setState(11);
			expr_prime();
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
	public static class Expr_primeContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Expr_primeContext expr_prime() {
			return getRuleContext(Expr_primeContext.class,0);
		}
		public Expr_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRRListener ) ((ExprRRListener)listener).enterExpr_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRRListener ) ((ExprRRListener)listener).exitExpr_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRRVisitor ) return ((ExprRRVisitor<? extends T>)visitor).visitExpr_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_primeContext expr_prime() throws RecognitionException {
		Expr_primeContext _localctx = new Expr_primeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr_prime);
		int _la;
		try {
			setState(18);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(14);
				term();
				setState(15);
				expr_prime();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Term_primeContext term_prime() {
			return getRuleContext(Term_primeContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRRListener ) ((ExprRRListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRRListener ) ((ExprRRListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRRVisitor ) return ((ExprRRVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			factor();
			setState(21);
			term_prime();
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
	public static class Term_primeContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Term_primeContext term_prime() {
			return getRuleContext(Term_primeContext.class,0);
		}
		public Term_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRRListener ) ((ExprRRListener)listener).enterTerm_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRRListener ) ((ExprRRListener)listener).exitTerm_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRRVisitor ) return ((ExprRRVisitor<? extends T>)visitor).visitTerm_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_primeContext term_prime() throws RecognitionException {
		Term_primeContext _localctx = new Term_primeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_term_prime);
		int _la;
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(24);
				factor();
				setState(25);
				term_prime();
				}
				break;
			case T__0:
			case T__1:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class FactorContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExprRRParser.ID, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRRListener ) ((ExprRRListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprRRListener ) ((ExprRRListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprRRVisitor ) return ((ExprRRVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_factor);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(T__4);
				setState(31);
				expr();
				setState(32);
				match(T__5);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(ID);
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

	public static final String _serializedATN =
		"\u0004\u0001\b&\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u0013\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u001d\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004$\b\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002"+
		"\u0004\u0006\b\u0000\u0002\u0001\u0000\u0001\u0002\u0001\u0000\u0003\u0004"+
		"#\u0000\n\u0001\u0000\u0000\u0000\u0002\u0012\u0001\u0000\u0000\u0000"+
		"\u0004\u0014\u0001\u0000\u0000\u0000\u0006\u001c\u0001\u0000\u0000\u0000"+
		"\b#\u0001\u0000\u0000\u0000\n\u000b\u0003\u0004\u0002\u0000\u000b\f\u0003"+
		"\u0002\u0001\u0000\f\u0001\u0001\u0000\u0000\u0000\r\u000e\u0007\u0000"+
		"\u0000\u0000\u000e\u000f\u0003\u0004\u0002\u0000\u000f\u0010\u0003\u0002"+
		"\u0001\u0000\u0010\u0013\u0001\u0000\u0000\u0000\u0011\u0013\u0001\u0000"+
		"\u0000\u0000\u0012\r\u0001\u0000\u0000\u0000\u0012\u0011\u0001\u0000\u0000"+
		"\u0000\u0013\u0003\u0001\u0000\u0000\u0000\u0014\u0015\u0003\b\u0004\u0000"+
		"\u0015\u0016\u0003\u0006\u0003\u0000\u0016\u0005\u0001\u0000\u0000\u0000"+
		"\u0017\u0018\u0007\u0001\u0000\u0000\u0018\u0019\u0003\b\u0004\u0000\u0019"+
		"\u001a\u0003\u0006\u0003\u0000\u001a\u001d\u0001\u0000\u0000\u0000\u001b"+
		"\u001d\u0001\u0000\u0000\u0000\u001c\u0017\u0001\u0000\u0000\u0000\u001c"+
		"\u001b\u0001\u0000\u0000\u0000\u001d\u0007\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0005\u0005\u0000\u0000\u001f \u0003\u0000\u0000\u0000 !\u0005"+
		"\u0006\u0000\u0000!$\u0001\u0000\u0000\u0000\"$\u0005\u0007\u0000\u0000"+
		"#\u001e\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000\u0000$\t\u0001\u0000"+
		"\u0000\u0000\u0003\u0012\u001c#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}