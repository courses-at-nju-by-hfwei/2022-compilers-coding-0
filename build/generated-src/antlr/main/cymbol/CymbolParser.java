// Generated from cymbol/Cymbol.g4 by ANTLR 4.9.2

    package cymbol;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CymbolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUAL=1, SEMI=2, LPAREN=3, RPAREN=4, COMMA=5, LBRACE=6, RBRACE=7, IF=8, 
		ELSE=9, WHILE=10, FOR=11, RETURN=12, INTTYPE=13, FLOATTYPE=14, VOIDTYPE=15, 
		LBRACK=16, RBRACK=17, SUB=18, LNOT=19, POWER=20, MUL=21, DIV=22, ADD=23, 
		LT=24, LE=25, GT=26, GE=27, EQUAL_EQUAL=28, NOT_EQUAL=29, LAND=30, LOR=31, 
		ID=32, INT=33, WS=34, SL_COMMENT=35;
	public static final int
		RULE_prog = 0, RULE_varDecl = 1, RULE_type = 2, RULE_functionDecl = 3, 
		RULE_formalParameters = 4, RULE_formalParameter = 5, RULE_block = 6, RULE_stat = 7, 
		RULE_expr = 8, RULE_exprList = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "varDecl", "type", "functionDecl", "formalParameters", "formalParameter", 
			"block", "stat", "expr", "exprList"
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

	@Override
	public String getGrammarFileName() { return "Cymbol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CymbolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CymbolParser.EOF, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(22);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(20);
					varDecl();
					}
					break;
				case 2:
					{
					setState(21);
					functionDecl();
					}
					break;
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTTYPE) | (1L << FLOATTYPE) | (1L << VOIDTYPE))) != 0) );
			setState(26);
			match(EOF);
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

	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(CymbolParser.SEMI, 0); }
		public TerminalNode EQUAL() { return getToken(CymbolParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			type();
			setState(29);
			match(ID);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(30);
				match(EQUAL);
				setState(31);
				expr(0);
				}
			}

			setState(34);
			match(SEMI);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTTYPE() { return getToken(CymbolParser.INTTYPE, 0); }
		public TerminalNode FLOATTYPE() { return getToken(CymbolParser.FLOATTYPE, 0); }
		public TerminalNode VOIDTYPE() { return getToken(CymbolParser.VOIDTYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTTYPE) | (1L << FLOATTYPE) | (1L << VOIDTYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CymbolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CymbolParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			type();
			setState(39);
			match(ID);
			setState(40);
			match(LPAREN);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTTYPE) | (1L << FLOATTYPE) | (1L << VOIDTYPE))) != 0)) {
				{
				setState(41);
				formalParameters();
				}
			}

			setState(44);
			match(RPAREN);
			setState(45);
			block();
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

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CymbolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CymbolParser.COMMA, i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			formalParameter();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(48);
				match(COMMA);
				setState(49);
				formalParameter();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			type();
			setState(56);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CymbolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CymbolParser.RBRACE, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(LBRACE);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << INTTYPE) | (1L << FLOATTYPE) | (1L << VOIDTYPE) | (1L << SUB) | (1L << LNOT) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				setState(59);
				stat();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(RBRACE);
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

	public static class StatContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public TerminalNode IF() { return getToken(CymbolParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CymbolParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(CymbolParser.WHILE, 0); }
		public TerminalNode FOR() { return getToken(CymbolParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(CymbolParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(CymbolParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CymbolParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(CymbolParser.RPAREN, 0); }
		public TerminalNode RETURN() { return getToken(CymbolParser.RETURN, 0); }
		public TerminalNode EQUAL() { return getToken(CymbolParser.EQUAL, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stat);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				varDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(IF);
				setState(70);
				expr(0);
				setState(71);
				stat();
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(72);
					match(ELSE);
					setState(73);
					stat();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				match(WHILE);
				setState(77);
				expr(0);
				setState(78);
				stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				match(FOR);
				setState(81);
				match(LPAREN);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SUB) | (1L << LNOT) | (1L << ID) | (1L << INT))) != 0)) {
					{
					setState(82);
					expr(0);
					}
				}

				setState(85);
				match(SEMI);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SUB) | (1L << LNOT) | (1L << ID) | (1L << INT))) != 0)) {
					{
					setState(86);
					expr(0);
					}
				}

				setState(89);
				match(SEMI);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SUB) | (1L << LNOT) | (1L << ID) | (1L << INT))) != 0)) {
					{
					setState(90);
					expr(0);
					}
				}

				setState(93);
				match(RPAREN);
				setState(94);
				stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				match(RETURN);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SUB) | (1L << LNOT) | (1L << ID) | (1L << INT))) != 0)) {
					{
					setState(96);
					expr(0);
					}
				}

				setState(99);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(100);
				expr(0);
				setState(101);
				match(EQUAL);
				setState(102);
				expr(0);
				setState(103);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(105);
				expr(0);
				setState(106);
				match(SEMI);
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CymbolParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CymbolParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode SUB() { return getToken(CymbolParser.SUB, 0); }
		public TerminalNode LNOT() { return getToken(CymbolParser.LNOT, 0); }
		public TerminalNode INT() { return getToken(CymbolParser.INT, 0); }
		public TerminalNode POWER() { return getToken(CymbolParser.POWER, 0); }
		public TerminalNode MUL() { return getToken(CymbolParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CymbolParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(CymbolParser.ADD, 0); }
		public TerminalNode LT() { return getToken(CymbolParser.LT, 0); }
		public TerminalNode LE() { return getToken(CymbolParser.LE, 0); }
		public TerminalNode GT() { return getToken(CymbolParser.GT, 0); }
		public TerminalNode GE() { return getToken(CymbolParser.GE, 0); }
		public TerminalNode EQUAL_EQUAL() { return getToken(CymbolParser.EQUAL_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(CymbolParser.NOT_EQUAL, 0); }
		public TerminalNode LAND() { return getToken(CymbolParser.LAND, 0); }
		public TerminalNode LOR() { return getToken(CymbolParser.LOR, 0); }
		public TerminalNode LBRACK() { return getToken(CymbolParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(CymbolParser.RBRACK, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(111);
				match(LPAREN);
				setState(112);
				expr(0);
				setState(113);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(115);
				match(ID);
				setState(116);
				match(LPAREN);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SUB) | (1L << LNOT) | (1L << ID) | (1L << INT))) != 0)) {
					{
					setState(117);
					exprList();
					}
				}

				setState(120);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(121);
				match(SUB);
				setState(122);
				expr(10);
				}
				break;
			case 4:
				{
				setState(123);
				match(LNOT);
				setState(124);
				expr(9);
				}
				break;
			case 5:
				{
				setState(125);
				match(ID);
				}
				break;
			case 6:
				{
				setState(126);
				match(INT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(130);
						match(POWER);
						setState(131);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(133);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(134);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(135);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(136);
						_la = _input.LA(1);
						if ( !(_la==SUB || _la==ADD) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(137);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(139);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LE) | (1L << GT) | (1L << GE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(140);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(142);
						_la = _input.LA(1);
						if ( !(_la==EQUAL_EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(145);
						_la = _input.LA(1);
						if ( !(_la==LAND || _la==LOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(146);
						expr(4);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(148);
						match(LBRACK);
						setState(149);
						expr(0);
						setState(150);
						match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CymbolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CymbolParser.COMMA, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			expr(0);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(158);
				match(COMMA);
				setState(159);
				expr(0);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00a8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\6\2\31\n\2\r\2\16\2\32\3\2\3\2\3\3\3\3\3\3\3\3\5\3#\n\3\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5-\n\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6\65"+
		"\n\6\f\6\16\68\13\6\3\7\3\7\3\7\3\b\3\b\7\b?\n\b\f\b\16\bB\13\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tM\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\tV\n\t\3\t\3\t\5\tZ\n\t\3\t\3\t\5\t^\n\t\3\t\3\t\3\t\3\t\5\td\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\to\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\ny\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0082\n\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\7\n\u009b\n\n\f\n\16\n\u009e\13\n\3\13\3\13\3\13\7\13\u00a3\n"+
		"\13\f\13\16\13\u00a6\13\13\3\13\2\3\22\f\2\4\6\b\n\f\16\20\22\24\2\b\3"+
		"\2\17\21\3\2\27\30\4\2\24\24\31\31\3\2\32\35\3\2\36\37\3\2 !\2\u00bd\2"+
		"\30\3\2\2\2\4\36\3\2\2\2\6&\3\2\2\2\b(\3\2\2\2\n\61\3\2\2\2\f9\3\2\2\2"+
		"\16<\3\2\2\2\20n\3\2\2\2\22\u0081\3\2\2\2\24\u009f\3\2\2\2\26\31\5\4\3"+
		"\2\27\31\5\b\5\2\30\26\3\2\2\2\30\27\3\2\2\2\31\32\3\2\2\2\32\30\3\2\2"+
		"\2\32\33\3\2\2\2\33\34\3\2\2\2\34\35\7\2\2\3\35\3\3\2\2\2\36\37\5\6\4"+
		"\2\37\"\7\"\2\2 !\7\3\2\2!#\5\22\n\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$"+
		"%\7\4\2\2%\5\3\2\2\2&\'\t\2\2\2\'\7\3\2\2\2()\5\6\4\2)*\7\"\2\2*,\7\5"+
		"\2\2+-\5\n\6\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\7\6\2\2/\60\5\16\b\2\60"+
		"\t\3\2\2\2\61\66\5\f\7\2\62\63\7\7\2\2\63\65\5\f\7\2\64\62\3\2\2\2\65"+
		"8\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\13\3\2\2\28\66\3\2\2\29:\5\6"+
		"\4\2:;\7\"\2\2;\r\3\2\2\2<@\7\b\2\2=?\5\20\t\2>=\3\2\2\2?B\3\2\2\2@>\3"+
		"\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\t\2\2D\17\3\2\2\2Eo\5\16\b\2"+
		"Fo\5\4\3\2GH\7\n\2\2HI\5\22\n\2IL\5\20\t\2JK\7\13\2\2KM\5\20\t\2LJ\3\2"+
		"\2\2LM\3\2\2\2Mo\3\2\2\2NO\7\f\2\2OP\5\22\n\2PQ\5\20\t\2Qo\3\2\2\2RS\7"+
		"\r\2\2SU\7\5\2\2TV\5\22\n\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WY\7\4\2\2XZ"+
		"\5\22\n\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[]\7\4\2\2\\^\5\22\n\2]\\\3\2\2"+
		"\2]^\3\2\2\2^_\3\2\2\2_`\7\6\2\2`o\5\20\t\2ac\7\16\2\2bd\5\22\n\2cb\3"+
		"\2\2\2cd\3\2\2\2de\3\2\2\2eo\7\4\2\2fg\5\22\n\2gh\7\3\2\2hi\5\22\n\2i"+
		"j\7\4\2\2jo\3\2\2\2kl\5\22\n\2lm\7\4\2\2mo\3\2\2\2nE\3\2\2\2nF\3\2\2\2"+
		"nG\3\2\2\2nN\3\2\2\2nR\3\2\2\2na\3\2\2\2nf\3\2\2\2nk\3\2\2\2o\21\3\2\2"+
		"\2pq\b\n\1\2qr\7\5\2\2rs\5\22\n\2st\7\6\2\2t\u0082\3\2\2\2uv\7\"\2\2v"+
		"x\7\5\2\2wy\5\24\13\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z\u0082\7\6\2\2{|\7"+
		"\24\2\2|\u0082\5\22\n\f}~\7\25\2\2~\u0082\5\22\n\13\177\u0082\7\"\2\2"+
		"\u0080\u0082\7#\2\2\u0081p\3\2\2\2\u0081u\3\2\2\2\u0081{\3\2\2\2\u0081"+
		"}\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u009c\3\2\2\2\u0083"+
		"\u0084\f\n\2\2\u0084\u0085\7\26\2\2\u0085\u009b\5\22\n\n\u0086\u0087\f"+
		"\t\2\2\u0087\u0088\t\3\2\2\u0088\u009b\5\22\n\n\u0089\u008a\f\b\2\2\u008a"+
		"\u008b\t\4\2\2\u008b\u009b\5\22\n\t\u008c\u008d\f\7\2\2\u008d\u008e\t"+
		"\5\2\2\u008e\u009b\5\22\n\b\u008f\u0090\f\6\2\2\u0090\u0091\t\6\2\2\u0091"+
		"\u009b\5\22\n\7\u0092\u0093\f\5\2\2\u0093\u0094\t\7\2\2\u0094\u009b\5"+
		"\22\n\6\u0095\u0096\f\r\2\2\u0096\u0097\7\22\2\2\u0097\u0098\5\22\n\2"+
		"\u0098\u0099\7\23\2\2\u0099\u009b\3\2\2\2\u009a\u0083\3\2\2\2\u009a\u0086"+
		"\3\2\2\2\u009a\u0089\3\2\2\2\u009a\u008c\3\2\2\2\u009a\u008f\3\2\2\2\u009a"+
		"\u0092\3\2\2\2\u009a\u0095\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\23\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a4"+
		"\5\22\n\2\u00a0\u00a1\7\7\2\2\u00a1\u00a3\5\22\n\2\u00a2\u00a0\3\2\2\2"+
		"\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\25"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\23\30\32\",\66@LUY]cnx\u0081\u009a\u009c"+
		"\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}