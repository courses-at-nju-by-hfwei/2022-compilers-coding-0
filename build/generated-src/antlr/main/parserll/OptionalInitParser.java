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
public class OptionalInitParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ASSIGN=2, LPAREN=3, RPAREN=4, INT=5, ID=6, WS=7;
	public static final int
		RULE_optional_init = 0, RULE_expr = 1, RULE_decl = 2, RULE_arg = 3, RULE_func_call = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"optional_init", "expr", "decl", "arg", "func_call"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "')'", "'int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ASSIGN", "LPAREN", "RPAREN", "INT", "ID", "WS"
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

	public OptionalInitParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Optional_initContext extends ParserRuleContext {
		public Optional_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_init; }
	 
		public Optional_initContext() { }
		public void copyFrom(Optional_initContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends Optional_initContext {
		public TerminalNode ASSIGN() { return getToken(OptionalInitParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InitContext(Optional_initContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OptionalInitListener ) ((OptionalInitListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OptionalInitListener ) ((OptionalInitListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OptionalInitVisitor ) return ((OptionalInitVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoInitContext extends Optional_initContext {
		public NoInitContext(Optional_initContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OptionalInitListener ) ((OptionalInitListener)listener).enterNoInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OptionalInitListener ) ((OptionalInitListener)listener).exitNoInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OptionalInitVisitor ) return ((OptionalInitVisitor<? extends T>)visitor).visitNoInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_initContext optional_init() throws RecognitionException {
		Optional_initContext _localctx = new Optional_initContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_optional_init);
		try {
			setState(13);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				_localctx = new InitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				match(ASSIGN);
				setState(11);
				expr();
				}
				break;
			case T__0:
			case RPAREN:
				_localctx = new NoInitContext(_localctx);
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OptionalInitParser.ID, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OptionalInitListener ) ((OptionalInitListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OptionalInitListener ) ((OptionalInitListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OptionalInitVisitor ) return ((OptionalInitVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(OptionalInitParser.INT, 0); }
		public TerminalNode ID() { return getToken(OptionalInitParser.ID, 0); }
		public Optional_initContext optional_init() {
			return getRuleContext(Optional_initContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OptionalInitListener ) ((OptionalInitListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OptionalInitListener ) ((OptionalInitListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OptionalInitVisitor ) return ((OptionalInitVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(INT);
			setState(18);
			match(ID);
			setState(19);
			optional_init();
			setState(20);
			match(T__0);
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
	public static class ArgContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(OptionalInitParser.INT, 0); }
		public TerminalNode ID() { return getToken(OptionalInitParser.ID, 0); }
		public Optional_initContext optional_init() {
			return getRuleContext(Optional_initContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OptionalInitListener ) ((OptionalInitListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OptionalInitListener ) ((OptionalInitListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OptionalInitVisitor ) return ((OptionalInitVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(INT);
			setState(23);
			match(ID);
			setState(24);
			optional_init();
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
	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OptionalInitParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(OptionalInitParser.LPAREN, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OptionalInitParser.RPAREN, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OptionalInitListener ) ((OptionalInitListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OptionalInitListener ) ((OptionalInitListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OptionalInitVisitor ) return ((OptionalInitVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(ID);
			setState(27);
			match(LPAREN);
			setState(28);
			arg();
			setState(29);
			match(RPAREN);
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
		"\u0004\u0001\u0007 \u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u000e\b\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002"+
		"\u0004\u0006\b\u0000\u0000\u001b\u0000\r\u0001\u0000\u0000\u0000\u0002"+
		"\u000f\u0001\u0000\u0000\u0000\u0004\u0011\u0001\u0000\u0000\u0000\u0006"+
		"\u0016\u0001\u0000\u0000\u0000\b\u001a\u0001\u0000\u0000\u0000\n\u000b"+
		"\u0005\u0002\u0000\u0000\u000b\u000e\u0003\u0002\u0001\u0000\f\u000e\u0001"+
		"\u0000\u0000\u0000\r\n\u0001\u0000\u0000\u0000\r\f\u0001\u0000\u0000\u0000"+
		"\u000e\u0001\u0001\u0000\u0000\u0000\u000f\u0010\u0005\u0006\u0000\u0000"+
		"\u0010\u0003\u0001\u0000\u0000\u0000\u0011\u0012\u0005\u0005\u0000\u0000"+
		"\u0012\u0013\u0005\u0006\u0000\u0000\u0013\u0014\u0003\u0000\u0000\u0000"+
		"\u0014\u0015\u0005\u0001\u0000\u0000\u0015\u0005\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0005\u0005\u0000\u0000\u0017\u0018\u0005\u0006\u0000\u0000"+
		"\u0018\u0019\u0003\u0000\u0000\u0000\u0019\u0007\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0005\u0006\u0000\u0000\u001b\u001c\u0005\u0003\u0000\u0000"+
		"\u001c\u001d\u0003\u0006\u0003\u0000\u001d\u001e\u0005\u0004\u0000\u0000"+
		"\u001e\t\u0001\u0000\u0000\u0000\u0001\r";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}