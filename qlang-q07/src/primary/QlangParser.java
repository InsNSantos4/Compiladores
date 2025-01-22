// Generated from Qlang.g4 by ANTLR 4.13.1

import java.util.Map;
import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class QlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, TEXT=31, CODEPIL=32, 
		VAR=33, ID=34, INTEGER=35, ESC=36, WS=37, COMMENT=38;
	public static final int
		RULE_main = 0, RULE_statements = 1, RULE_stat = 2, RULE_declaration = 3, 
		RULE_question = 4, RULE_variable = 5, RULE_assignment = 6, RULE_expr = 7, 
		RULE_execution = 8, RULE_print = 9, RULE_export = 10, RULE_uses = 11, 
		RULE_grading = 12, RULE_grades = 13, RULE_type = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "statements", "stat", "declaration", "question", "variable", 
			"assignment", "expr", "execution", "print", "export", "uses", "grading", 
			"grades", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':'", "'hole'", "'is'", "'end'", "'open'", "'code-hole'", 
			"'code-open'", "'code'", "':='", "'new'", "'|'", "'read'", "'integer('", 
			"')'", "'text('", "'execute'", "'println'", "'ans->'", "'export'", "'result'", 
			"'to'", "'uses'", "'from'", "','", "'line'", "'fraction'", "'question'", 
			"'integer'", "'text'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "TEXT", "CODEPIL", "VAR", "ID", 
			"INTEGER", "ESC", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "Qlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	static protected Map<String,Symbol> symbolTable = new HashMap<>();

	public QlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(QlangParser.EOF, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			statements();
			setState(31);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 25779635146L) != 0)) {
				{
				{
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 25779635144L) != 0)) {
					{
					setState(33);
					stat();
					}
				}

				setState(36);
				match(T__0);
				}
				}
				setState(41);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public UsesContext uses() {
			return getRuleContext(UsesContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public ExecutionContext execution() {
			return getRuleContext(ExecutionContext.class,0);
		}
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				uses();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				print();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				question();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(47);
				execution();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(48);
				export();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QlangParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ID);
			setState(52);
			match(T__1);
			setState(53);
			type();
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
	public static class QuestionContext extends ParserRuleContext {
		public String varName;
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
	 
		public QuestionContext() { }
		public void copyFrom(QuestionContext ctx) {
			super.copyFrom(ctx);
			this.varName = ctx.varName;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuestionCodeOpenContext extends QuestionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public QuestionCodeOpenContext(QuestionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterQuestionCodeOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitQuestionCodeOpen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitQuestionCodeOpen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CodePILContext extends QuestionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode CODEPIL() { return getToken(QlangParser.CODEPIL, 0); }
		public CodePILContext(QuestionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterCodePIL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitCodePIL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitCodePIL(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuestionCodeHoleContext extends QuestionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public QuestionCodeHoleContext(QuestionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterQuestionCodeHole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitQuestionCodeHole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitQuestionCodeHole(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuestionOpenContext extends QuestionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public QuestionOpenContext(QuestionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterQuestionOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitQuestionOpen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitQuestionOpen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuestionHoleContext extends QuestionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public QuestionHoleContext(QuestionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterQuestionHole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitQuestionHole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitQuestionHole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_question);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new QuestionHoleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(T__2);
				setState(56);
				variable();
				setState(57);
				match(T__3);
				setState(58);
				print();
				setState(59);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new QuestionOpenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(T__5);
				setState(62);
				variable();
				setState(63);
				match(T__3);
				setState(64);
				print();
				setState(65);
				match(T__4);
				}
				break;
			case T__6:
				_localctx = new QuestionCodeHoleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(T__6);
				setState(68);
				variable();
				setState(69);
				match(T__3);
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(70);
					stat();
					setState(71);
					match(T__0);
					}
					}
					setState(75); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 25779635144L) != 0) );
				setState(77);
				match(T__4);
				}
				break;
			case T__7:
				_localctx = new QuestionCodeOpenContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(T__7);
				setState(80);
				variable();
				setState(81);
				match(T__3);
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(82);
					stat();
					setState(83);
					match(T__0);
					}
					}
					setState(87); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 25779635144L) != 0) );
				setState(89);
				match(T__4);
				}
				break;
			case T__8:
				_localctx = new CodePILContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				match(T__8);
				setState(92);
				variable();
				setState(93);
				match(T__3);
				setState(94);
				match(CODEPIL);
				setState(95);
				match(T__4);
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
	public static class VariableContext extends ParserRuleContext {
		public String varName;
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
			this.varName = ctx.varName;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuestionIDtypeContext extends VariableContext {
		public TerminalNode ID() { return getToken(QlangParser.ID, 0); }
		public QuestionIDtypeContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterQuestionIDtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitQuestionIDtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitQuestionIDtype(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuestionIDsubtypeContext extends VariableContext {
		public TerminalNode VAR() { return getToken(QlangParser.VAR, 0); }
		public QuestionIDsubtypeContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterQuestionIDsubtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitQuestionIDsubtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitQuestionIDsubtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				_localctx = new QuestionIDsubtypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(VAR);
				}
				break;
			case ID:
				_localctx = new QuestionIDtypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewAssignContext extends AssignmentContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public NewAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterNewAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitNewAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitNewAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteAssignContext extends AssignmentContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExecutionContext execution() {
			return getRuleContext(ExecutionContext.class,0);
		}
		public ExecuteAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterExecuteAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitExecuteAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitExecuteAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAssignContext extends AssignmentContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterExprAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitExprAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitExprAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StdInputAssignContext extends AssignmentContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(QlangParser.TEXT, 0); }
		public ExecutionContext execution() {
			return getRuleContext(ExecutionContext.class,0);
		}
		public StdInputAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterStdInputAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitStdInputAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitStdInputAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new NewAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				variable();
				setState(104);
				match(T__9);
				setState(105);
				match(T__10);
				setState(106);
				variable();
				}
				break;
			case 2:
				_localctx = new ExecuteAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				variable();
				setState(109);
				match(T__9);
				setState(110);
				execution();
				}
				break;
			case 3:
				_localctx = new ExprAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				variable();
				setState(113);
				match(T__9);
				setState(114);
				expr();
				}
				break;
			case 4:
				_localctx = new StdInputAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				variable();
				setState(117);
				match(T__9);
				setState(118);
				match(TEXT);
				setState(119);
				match(T__11);
				setState(120);
				execution();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public QType eType;
		public String varName;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.eType = ctx.eType;
			this.varName = ctx.varName;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextConversionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TextConversionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterTextConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitTextConversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitTextConversion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerConversionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IntegerConversionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterIntegerConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitIntegerConversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitIntegerConversion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprReadContext extends ExprContext {
		public TerminalNode TEXT() { return getToken(QlangParser.TEXT, 0); }
		public ExprReadContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterExprRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitExprRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitExprRead(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprINTEGERContext extends ExprContext {
		public TerminalNode INTEGER() { return getToken(QlangParser.INTEGER, 0); }
		public ExprINTEGERContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterExprINTEGER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitExprINTEGER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitExprINTEGER(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIDContext extends ExprContext {
		public TerminalNode ID() { return getToken(QlangParser.ID, 0); }
		public ExprIDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterExprID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitExprID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitExprID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprTEXTContext extends ExprContext {
		public TerminalNode TEXT() { return getToken(QlangParser.TEXT, 0); }
		public ExprTEXTContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterExprTEXT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitExprTEXT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitExprTEXT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				_localctx = new ExprReadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__12);
				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(125);
					match(TEXT);
					}
					break;
				}
				}
				break;
			case T__13:
				_localctx = new IntegerConversionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(T__13);
				setState(129);
				expr();
				setState(130);
				match(T__14);
				}
				break;
			case T__15:
				_localctx = new TextConversionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(T__15);
				setState(133);
				expr();
				setState(134);
				match(T__14);
				}
				break;
			case TEXT:
				_localctx = new ExprTEXTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(TEXT);
				}
				break;
			case INTEGER:
				_localctx = new ExprINTEGERContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				match(INTEGER);
				}
				break;
			case ID:
				_localctx = new ExprIDContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExecutionContext extends ParserRuleContext {
		public ExecutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execution; }
	 
		public ExecutionContext() { }
		public void copyFrom(ExecutionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExecNewVARContext extends ExecutionContext {
		public TerminalNode VAR() { return getToken(QlangParser.VAR, 0); }
		public ExecNewVARContext(ExecutionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterExecNewVAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitExecNewVAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitExecNewVAR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExecIDContext extends ExecutionContext {
		public TerminalNode ID() { return getToken(QlangParser.ID, 0); }
		public ExecIDContext(ExecutionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterExecID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitExecID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitExecID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecutionContext execution() throws RecognitionException {
		ExecutionContext _localctx = new ExecutionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_execution);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ExecIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(T__16);
				setState(142);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ExecNewVARContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(T__16);
				setState(144);
				match(T__10);
				setState(145);
				match(VAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TEXT() { return getToken(QlangParser.TEXT, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__17);
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149);
				expr();
				}
				}
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 53687181312L) != 0) );
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(154);
				match(T__18);
				setState(155);
				match(TEXT);
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(156);
					expr();
					}
					}
					setState(159); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 53687181312L) != 0) );
				}
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
	public static class ExportContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(QlangParser.TEXT, 0); }
		public ExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__19);
			setState(164);
			match(T__20);
			setState(165);
			match(T__21);
			setState(166);
			match(TEXT);
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
	public static class UsesContext extends ParserRuleContext {
		public UsesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uses; }
	 
		public UsesContext() { }
		public void copyFrom(UsesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UsesFileContext extends UsesContext {
		public TerminalNode TEXT() { return getToken(QlangParser.TEXT, 0); }
		public UsesFileContext(UsesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterUsesFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitUsesFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitUsesFile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UsesCodeContext extends UsesContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public GradingContext grading() {
			return getRuleContext(GradingContext.class,0);
		}
		public UsesCodeContext(UsesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterUsesCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitUsesCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitUsesCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsesContext uses() throws RecognitionException {
		UsesContext _localctx = new UsesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_uses);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new UsesFileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(T__22);
				setState(169);
				match(T__8);
				setState(170);
				match(T__23);
				setState(171);
				match(TEXT);
				setState(172);
				match(T__4);
				}
				break;
			case 2:
				_localctx = new UsesCodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__22);
				setState(174);
				match(T__8);
				setState(175);
				variable();
				setState(176);
				grading();
				setState(177);
				match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GradingContext extends ParserRuleContext {
		public List<GradesContext> grades() {
			return getRuleContexts(GradesContext.class);
		}
		public GradesContext grades(int i) {
			return getRuleContext(GradesContext.class,i);
		}
		public GradingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterGrading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitGrading(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitGrading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GradingContext grading() throws RecognitionException {
		GradingContext _localctx = new GradingContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_grading);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(181);
					grades();
					setState(182);
					match(T__0);
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(189);
			grades();
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
	public static class GradesContext extends ParserRuleContext {
		public GradesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grades; }
	 
		public GradesContext() { }
		public void copyFrom(GradesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GradingTextContext extends GradesContext {
		public TerminalNode INTEGER() { return getToken(QlangParser.INTEGER, 0); }
		public TerminalNode TEXT() { return getToken(QlangParser.TEXT, 0); }
		public GradingTextContext(GradesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterGradingText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitGradingText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitGradingText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GradingLineContext extends GradesContext {
		public List<TerminalNode> INTEGER() { return getTokens(QlangParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(QlangParser.INTEGER, i);
		}
		public TerminalNode TEXT() { return getToken(QlangParser.TEXT, 0); }
		public GradingLineContext(GradesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterGradingLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitGradingLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitGradingLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GradesContext grades() throws RecognitionException {
		GradesContext _localctx = new GradesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_grades);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new GradingLineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(INTEGER);
				setState(192);
				match(T__24);
				setState(193);
				match(TEXT);
				setState(194);
				match(T__25);
				setState(195);
				match(INTEGER);
				}
				break;
			case 2:
				_localctx = new GradingTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(INTEGER);
				setState(197);
				match(T__24);
				setState(198);
				match(TEXT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlangListener ) ((QlangListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlangVisitor ) return ((QlangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2013266432L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001&\u00cc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0003\u0001#\b\u0001\u0001\u0001\u0005\u0001"+
		"&\b\u0001\n\u0001\f\u0001)\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00022\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004J\b\u0004"+
		"\u000b\u0004\f\u0004K\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004V\b\u0004"+
		"\u000b\u0004\f\u0004W\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004b\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u0005f\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"{\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u007f\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008c\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0093\b\b\u0001\t\u0001"+
		"\t\u0004\t\u0097\b\t\u000b\t\f\t\u0098\u0001\t\u0001\t\u0001\t\u0004\t"+
		"\u009e\b\t\u000b\t\f\t\u009f\u0003\t\u00a2\b\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00b4\b\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00b9"+
		"\b\f\n\f\f\f\u00bc\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c8\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0001\u0002\u0000\t\t\u001b"+
		"\u001e\u00db\u0000\u001e\u0001\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000"+
		"\u0000\u00041\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000\u0000\b"+
		"a\u0001\u0000\u0000\u0000\ne\u0001\u0000\u0000\u0000\fz\u0001\u0000\u0000"+
		"\u0000\u000e\u008b\u0001\u0000\u0000\u0000\u0010\u0092\u0001\u0000\u0000"+
		"\u0000\u0012\u0094\u0001\u0000\u0000\u0000\u0014\u00a3\u0001\u0000\u0000"+
		"\u0000\u0016\u00b3\u0001\u0000\u0000\u0000\u0018\u00ba\u0001\u0000\u0000"+
		"\u0000\u001a\u00c7\u0001\u0000\u0000\u0000\u001c\u00c9\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0003\u0002\u0001\u0000\u001f \u0005\u0000\u0000\u0001"+
		" \u0001\u0001\u0000\u0000\u0000!#\u0003\u0004\u0002\u0000\"!\u0001\u0000"+
		"\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0005"+
		"\u0001\u0000\u0000%\"\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000"+
		"\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(\u0003\u0001\u0000"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000*2\u0003\u0016\u000b\u0000+2\u0003"+
		"\u0012\t\u0000,2\u0003\u0006\u0003\u0000-2\u0003\f\u0006\u0000.2\u0003"+
		"\b\u0004\u0000/2\u0003\u0010\b\u000002\u0003\u0014\n\u00001*\u0001\u0000"+
		"\u0000\u00001+\u0001\u0000\u0000\u00001,\u0001\u0000\u0000\u00001-\u0001"+
		"\u0000\u0000\u00001.\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"10\u0001\u0000\u0000\u00002\u0005\u0001\u0000\u0000\u000034\u0005\"\u0000"+
		"\u000045\u0005\u0002\u0000\u000056\u0003\u001c\u000e\u00006\u0007\u0001"+
		"\u0000\u0000\u000078\u0005\u0003\u0000\u000089\u0003\n\u0005\u00009:\u0005"+
		"\u0004\u0000\u0000:;\u0003\u0012\t\u0000;<\u0005\u0005\u0000\u0000<b\u0001"+
		"\u0000\u0000\u0000=>\u0005\u0006\u0000\u0000>?\u0003\n\u0005\u0000?@\u0005"+
		"\u0004\u0000\u0000@A\u0003\u0012\t\u0000AB\u0005\u0005\u0000\u0000Bb\u0001"+
		"\u0000\u0000\u0000CD\u0005\u0007\u0000\u0000DE\u0003\n\u0005\u0000EI\u0005"+
		"\u0004\u0000\u0000FG\u0003\u0004\u0002\u0000GH\u0005\u0001\u0000\u0000"+
		"HJ\u0001\u0000\u0000\u0000IF\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MN\u0005\u0005\u0000\u0000Nb\u0001\u0000\u0000\u0000OP\u0005"+
		"\b\u0000\u0000PQ\u0003\n\u0005\u0000QU\u0005\u0004\u0000\u0000RS\u0003"+
		"\u0004\u0002\u0000ST\u0005\u0001\u0000\u0000TV\u0001\u0000\u0000\u0000"+
		"UR\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0005\u0005"+
		"\u0000\u0000Zb\u0001\u0000\u0000\u0000[\\\u0005\t\u0000\u0000\\]\u0003"+
		"\n\u0005\u0000]^\u0005\u0004\u0000\u0000^_\u0005 \u0000\u0000_`\u0005"+
		"\u0005\u0000\u0000`b\u0001\u0000\u0000\u0000a7\u0001\u0000\u0000\u0000"+
		"a=\u0001\u0000\u0000\u0000aC\u0001\u0000\u0000\u0000aO\u0001\u0000\u0000"+
		"\u0000a[\u0001\u0000\u0000\u0000b\t\u0001\u0000\u0000\u0000cf\u0005!\u0000"+
		"\u0000df\u0005\"\u0000\u0000ec\u0001\u0000\u0000\u0000ed\u0001\u0000\u0000"+
		"\u0000f\u000b\u0001\u0000\u0000\u0000gh\u0003\n\u0005\u0000hi\u0005\n"+
		"\u0000\u0000ij\u0005\u000b\u0000\u0000jk\u0003\n\u0005\u0000k{\u0001\u0000"+
		"\u0000\u0000lm\u0003\n\u0005\u0000mn\u0005\n\u0000\u0000no\u0003\u0010"+
		"\b\u0000o{\u0001\u0000\u0000\u0000pq\u0003\n\u0005\u0000qr\u0005\n\u0000"+
		"\u0000rs\u0003\u000e\u0007\u0000s{\u0001\u0000\u0000\u0000tu\u0003\n\u0005"+
		"\u0000uv\u0005\n\u0000\u0000vw\u0005\u001f\u0000\u0000wx\u0005\f\u0000"+
		"\u0000xy\u0003\u0010\b\u0000y{\u0001\u0000\u0000\u0000zg\u0001\u0000\u0000"+
		"\u0000zl\u0001\u0000\u0000\u0000zp\u0001\u0000\u0000\u0000zt\u0001\u0000"+
		"\u0000\u0000{\r\u0001\u0000\u0000\u0000|~\u0005\r\u0000\u0000}\u007f\u0005"+
		"\u001f\u0000\u0000~}\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u008c\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u000e\u0000"+
		"\u0000\u0081\u0082\u0003\u000e\u0007\u0000\u0082\u0083\u0005\u000f\u0000"+
		"\u0000\u0083\u008c\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0010\u0000"+
		"\u0000\u0085\u0086\u0003\u000e\u0007\u0000\u0086\u0087\u0005\u000f\u0000"+
		"\u0000\u0087\u008c\u0001\u0000\u0000\u0000\u0088\u008c\u0005\u001f\u0000"+
		"\u0000\u0089\u008c\u0005#\u0000\u0000\u008a\u008c\u0005\"\u0000\u0000"+
		"\u008b|\u0001\u0000\u0000\u0000\u008b\u0080\u0001\u0000\u0000\u0000\u008b"+
		"\u0084\u0001\u0000\u0000\u0000\u008b\u0088\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c"+
		"\u000f\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0011\u0000\u0000\u008e"+
		"\u0093\u0005\"\u0000\u0000\u008f\u0090\u0005\u0011\u0000\u0000\u0090\u0091"+
		"\u0005\u000b\u0000\u0000\u0091\u0093\u0005!\u0000\u0000\u0092\u008d\u0001"+
		"\u0000\u0000\u0000\u0092\u008f\u0001\u0000\u0000\u0000\u0093\u0011\u0001"+
		"\u0000\u0000\u0000\u0094\u0096\u0005\u0012\u0000\u0000\u0095\u0097\u0003"+
		"\u000e\u0007\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001"+
		"\u0000\u0000\u0000\u0099\u00a1\u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		"\u0013\u0000\u0000\u009b\u009d\u0005\u001f\u0000\u0000\u009c\u009e\u0003"+
		"\u000e\u0007\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001"+
		"\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009a\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u0013\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005\u0014\u0000\u0000\u00a4\u00a5\u0005"+
		"\u0015\u0000\u0000\u00a5\u00a6\u0005\u0016\u0000\u0000\u00a6\u00a7\u0005"+
		"\u001f\u0000\u0000\u00a7\u0015\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005"+
		"\u0017\u0000\u0000\u00a9\u00aa\u0005\t\u0000\u0000\u00aa\u00ab\u0005\u0018"+
		"\u0000\u0000\u00ab\u00ac\u0005\u001f\u0000\u0000\u00ac\u00b4\u0005\u0005"+
		"\u0000\u0000\u00ad\u00ae\u0005\u0017\u0000\u0000\u00ae\u00af\u0005\t\u0000"+
		"\u0000\u00af\u00b0\u0003\n\u0005\u0000\u00b0\u00b1\u0003\u0018\f\u0000"+
		"\u00b1\u00b2\u0005\u0005\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b3\u00a8\u0001\u0000\u0000\u0000\u00b3\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b4\u0017\u0001\u0000\u0000\u0000\u00b5\u00b6\u0003\u001a\r\u0000\u00b6"+
		"\u00b7\u0005\u0001\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0003\u001a\r\u0000\u00be\u0019\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0005#\u0000\u0000\u00c0\u00c1\u0005\u0019\u0000\u0000\u00c1\u00c2\u0005"+
		"\u001f\u0000\u0000\u00c2\u00c3\u0005\u001a\u0000\u0000\u00c3\u00c8\u0005"+
		"#\u0000\u0000\u00c4\u00c5\u0005#\u0000\u0000\u00c5\u00c6\u0005\u0019\u0000"+
		"\u0000\u00c6\u00c8\u0005\u001f\u0000\u0000\u00c7\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c4\u0001\u0000\u0000\u0000\u00c8\u001b\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0007\u0000\u0000\u0000\u00ca\u001d\u0001\u0000\u0000"+
		"\u0000\u0011\"\'1KWaez~\u008b\u0092\u0098\u009f\u00a1\u00b3\u00ba\u00c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}