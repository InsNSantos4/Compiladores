// Generated from /home/rubens/github-classroom/qlang-q07/src/primary_grammar/Qlang.g4 by ANTLR 4.13.1
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
		T__17=18, T__18=19, T__19=20, T__20=21, ID=22, STRING=23, WS=24, COMMENT=25;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_question = 2, RULE_questionType = 3, 
		RULE_questionBlock = 4, RULE_holeQuestionBlock = 5, RULE_codeQuestionBlock = 6, 
		RULE_holePrintStatement = 7, RULE_printStatement = 8, RULE_usesStatement = 9, 
		RULE_anwser = 10, RULE_assign = 11, RULE_execute = 12, RULE_export = 13, 
		RULE_declare = 14, RULE_var = 15, RULE_questionID = 16, RULE_type = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "question", "questionType", "questionBlock", "holeQuestionBlock", 
			"codeQuestionBlock", "holePrintStatement", "printStatement", "usesStatement", 
			"anwser", "assign", "execute", "export", "declare", "var", "questionID", 
			"type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'is'", "'end'", "'hole'", "'open'", "'code-hole'", "'code-open'", 
			"' ans->'", "'print'", "'println'", "'uses code from'", "':='", "'new'", 
			"'execute'", "'export'", "'result'", "'to'", "':'", "'.'", "'question'", 
			"'fraction'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "ID", "STRING", 
			"WS", "COMMENT"
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

	public QlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(QlangParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4243696L) != 0)) {
				{
				{
				setState(36);
				stmt();
				setState(37);
				match(T__0);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportStmtContext extends StmtContext {
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public ExportStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuestionStmtContext extends StmtContext {
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public QuestionStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStmtContext extends StmtContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AssignStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclareStmtContext extends StmtContext {
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public DeclareStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteStmtContext extends StmtContext {
		public ExecuteContext execute() {
			return getRuleContext(ExecuteContext.class,0);
		}
		public ExecuteStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new QuestionStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				question();
				}
				break;
			case 2:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				assign();
				}
				break;
			case 3:
				_localctx = new ExecuteStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				execute();
				}
				break;
			case 4:
				_localctx = new ExportStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				export();
				}
				break;
			case 5:
				_localctx = new DeclareStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				declare();
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
	public static class QuestionContext extends ParserRuleContext {
		public QuestionTypeContext questionType() {
			return getRuleContext(QuestionTypeContext.class,0);
		}
		public QuestionIDContext questionID() {
			return getRuleContext(QuestionIDContext.class,0);
		}
		public HoleQuestionBlockContext holeQuestionBlock() {
			return getRuleContext(HoleQuestionBlockContext.class,0);
		}
		public QuestionBlockContext questionBlock() {
			return getRuleContext(QuestionBlockContext.class,0);
		}
		public CodeQuestionBlockContext codeQuestionBlock() {
			return getRuleContext(CodeQuestionBlockContext.class,0);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			questionType();
			setState(54);
			questionID(0);
			setState(55);
			match(T__1);
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(56);
				holeQuestionBlock();
				}
				break;
			case 2:
				{
				setState(57);
				questionBlock();
				}
				break;
			case 3:
				{
				setState(58);
				codeQuestionBlock();
				}
				break;
			}
			setState(61);
			match(T__2);
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
	public static class QuestionTypeContext extends ParserRuleContext {
		public QuestionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionType; }
	}

	public final QuestionTypeContext questionType() throws RecognitionException {
		QuestionTypeContext _localctx = new QuestionTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_questionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionBlockContext extends ParserRuleContext {
		public List<PrintStatementContext> printStatement() {
			return getRuleContexts(PrintStatementContext.class);
		}
		public PrintStatementContext printStatement(int i) {
			return getRuleContext(PrintStatementContext.class,i);
		}
		public QuestionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionBlock; }
	}

	public final QuestionBlockContext questionBlock() throws RecognitionException {
		QuestionBlockContext _localctx = new QuestionBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_questionBlock);
		int _la;
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				printStatement();
				setState(66);
				match(T__0);
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(67);
					printStatement();
					setState(68);
					match(T__0);
					}
					}
					setState(72); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__8 || _la==T__9 );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				printStatement();
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
	public static class HoleQuestionBlockContext extends ParserRuleContext {
		public HolePrintStatementContext holePrintStatement() {
			return getRuleContext(HolePrintStatementContext.class,0);
		}
		public List<PrintStatementContext> printStatement() {
			return getRuleContexts(PrintStatementContext.class);
		}
		public PrintStatementContext printStatement(int i) {
			return getRuleContext(PrintStatementContext.class,i);
		}
		public HoleQuestionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_holeQuestionBlock; }
	}

	public final HoleQuestionBlockContext holeQuestionBlock() throws RecognitionException {
		HoleQuestionBlockContext _localctx = new HoleQuestionBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_holeQuestionBlock);
		try {
			int _alt;
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(77);
						printStatement();
						setState(78);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(82); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(84);
				holePrintStatement();
				setState(85);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				holePrintStatement();
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
	public static class CodeQuestionBlockContext extends ParserRuleContext {
		public UsesStatementContext usesStatement() {
			return getRuleContext(UsesStatementContext.class,0);
		}
		public List<PrintStatementContext> printStatement() {
			return getRuleContexts(PrintStatementContext.class);
		}
		public PrintStatementContext printStatement(int i) {
			return getRuleContext(PrintStatementContext.class,i);
		}
		public CodeQuestionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeQuestionBlock; }
	}

	public final CodeQuestionBlockContext codeQuestionBlock() throws RecognitionException {
		CodeQuestionBlockContext _localctx = new CodeQuestionBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_codeQuestionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				{
				setState(90);
				printStatement();
				setState(91);
				match(T__0);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			usesStatement();
			setState(99);
			match(T__0);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				{
				setState(100);
				printStatement();
				setState(101);
				match(T__0);
				}
				}
				setState(107);
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
	public static class HolePrintStatementContext extends ParserRuleContext {
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public AnwserContext anwser() {
			return getRuleContext(AnwserContext.class,0);
		}
		public TerminalNode STRING() { return getToken(QlangParser.STRING, 0); }
		public HolePrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_holePrintStatement; }
	}

	public final HolePrintStatementContext holePrintStatement() throws RecognitionException {
		HolePrintStatementContext _localctx = new HolePrintStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_holePrintStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			printStatement();
			setState(109);
			match(T__7);
			setState(110);
			anwser();
			setState(111);
			match(STRING);
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
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(QlangParser.STRING, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(114);
			match(STRING);
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
	public static class UsesStatementContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(QlangParser.STRING, 0); }
		public UsesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usesStatement; }
	}

	public final UsesStatementContext usesStatement() throws RecognitionException {
		UsesStatementContext _localctx = new UsesStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_usesStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__10);
			setState(117);
			match(STRING);
			setState(118);
			match(T__2);
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
	public static class AnwserContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(QlangParser.STRING, 0); }
		public AnwserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anwser; }
	}

	public final AnwserContext anwser() throws RecognitionException {
		AnwserContext _localctx = new AnwserContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_anwser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(STRING);
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
	public static class AssignContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public QuestionIDContext questionID() {
			return getRuleContext(QuestionIDContext.class,0);
		}
		public ExecuteContext execute() {
			return getRuleContext(ExecuteContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			var();
			setState(123);
			match(T__11);
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				setState(124);
				match(T__12);
				setState(125);
				questionID(0);
				}
				break;
			case T__13:
				{
				setState(126);
				execute();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ExecuteContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_execute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__13);
			setState(130);
			var();
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
		public TerminalNode STRING() { return getToken(QlangParser.STRING, 0); }
		public ExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export; }
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__14);
			setState(133);
			match(T__15);
			setState(134);
			match(T__16);
			setState(135);
			match(STRING);
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
	public static class DeclareContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			var();
			setState(138);
			match(T__17);
			setState(139);
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
	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QlangParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
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
	public static class QuestionIDContext extends ParserRuleContext {
		public QuestionIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionID; }
	 
		public QuestionIDContext() { }
		public void copyFrom(QuestionIDContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IDtypeContext extends QuestionIDContext {
		public TerminalNode ID() { return getToken(QlangParser.ID, 0); }
		public IDtypeContext(QuestionIDContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtypeContext extends QuestionIDContext {
		public List<QuestionIDContext> questionID() {
			return getRuleContexts(QuestionIDContext.class);
		}
		public QuestionIDContext questionID(int i) {
			return getRuleContext(QuestionIDContext.class,i);
		}
		public SubtypeContext(QuestionIDContext ctx) { copyFrom(ctx); }
	}

	public final QuestionIDContext questionID() throws RecognitionException {
		return questionID(0);
	}

	private QuestionIDContext questionID(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QuestionIDContext _localctx = new QuestionIDContext(_ctx, _parentState);
		QuestionIDContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_questionID, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new IDtypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(144);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SubtypeContext(new QuestionIDContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_questionID);
					setState(146);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(147);
					match(T__18);
					setState(148);
					questionID(3);
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__20) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return questionID_sempred((QuestionIDContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean questionID_sempred(QuestionIDContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u009d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u00014\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004G\b\u0004\u000b\u0004\f\u0004H\u0001\u0004"+
		"\u0003\u0004L\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005"+
		"Q\b\u0005\u000b\u0005\f\u0005R\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005Y\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006^\b\u0006\n\u0006\f\u0006a\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006h\b\u0006\n\u0006\f\u0006k\t"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0080"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0096\b\u0010\n\u0010\f\u0010\u0099\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0000\u0001 \u0012\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\u0003\u0001"+
		"\u0000\u0004\u0007\u0001\u0000\t\n\u0001\u0000\u0014\u0015\u0099\u0000"+
		")\u0001\u0000\u0000\u0000\u00023\u0001\u0000\u0000\u0000\u00045\u0001"+
		"\u0000\u0000\u0000\u0006?\u0001\u0000\u0000\u0000\bK\u0001\u0000\u0000"+
		"\u0000\nX\u0001\u0000\u0000\u0000\f_\u0001\u0000\u0000\u0000\u000el\u0001"+
		"\u0000\u0000\u0000\u0010q\u0001\u0000\u0000\u0000\u0012t\u0001\u0000\u0000"+
		"\u0000\u0014x\u0001\u0000\u0000\u0000\u0016z\u0001\u0000\u0000\u0000\u0018"+
		"\u0081\u0001\u0000\u0000\u0000\u001a\u0084\u0001\u0000\u0000\u0000\u001c"+
		"\u0089\u0001\u0000\u0000\u0000\u001e\u008d\u0001\u0000\u0000\u0000 \u008f"+
		"\u0001\u0000\u0000\u0000\"\u009a\u0001\u0000\u0000\u0000$%\u0003\u0002"+
		"\u0001\u0000%&\u0005\u0001\u0000\u0000&(\u0001\u0000\u0000\u0000\'$\u0001"+
		"\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000"+
		"\u0000,-\u0005\u0000\u0000\u0001-\u0001\u0001\u0000\u0000\u0000.4\u0003"+
		"\u0004\u0002\u0000/4\u0003\u0016\u000b\u000004\u0003\u0018\f\u000014\u0003"+
		"\u001a\r\u000024\u0003\u001c\u000e\u00003.\u0001\u0000\u0000\u00003/\u0001"+
		"\u0000\u0000\u000030\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"32\u0001\u0000\u0000\u00004\u0003\u0001\u0000\u0000\u000056\u0003\u0006"+
		"\u0003\u000067\u0003 \u0010\u00007;\u0005\u0002\u0000\u00008<\u0003\n"+
		"\u0005\u00009<\u0003\b\u0004\u0000:<\u0003\f\u0006\u0000;8\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=>\u0005\u0003\u0000\u0000>\u0005\u0001\u0000\u0000"+
		"\u0000?@\u0007\u0000\u0000\u0000@\u0007\u0001\u0000\u0000\u0000AB\u0003"+
		"\u0010\b\u0000BF\u0005\u0001\u0000\u0000CD\u0003\u0010\b\u0000DE\u0005"+
		"\u0001\u0000\u0000EG\u0001\u0000\u0000\u0000FC\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000IL\u0001\u0000\u0000\u0000JL\u0003\u0010\b\u0000KA\u0001\u0000\u0000"+
		"\u0000KJ\u0001\u0000\u0000\u0000L\t\u0001\u0000\u0000\u0000MN\u0003\u0010"+
		"\b\u0000NO\u0005\u0001\u0000\u0000OQ\u0001\u0000\u0000\u0000PM\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0003\u000e\u0007\u0000"+
		"UV\u0005\u0001\u0000\u0000VY\u0001\u0000\u0000\u0000WY\u0003\u000e\u0007"+
		"\u0000XP\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000Y\u000b\u0001"+
		"\u0000\u0000\u0000Z[\u0003\u0010\b\u0000[\\\u0005\u0001\u0000\u0000\\"+
		"^\u0001\u0000\u0000\u0000]Z\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0003\u0012\t\u0000ci\u0005\u0001"+
		"\u0000\u0000de\u0003\u0010\b\u0000ef\u0005\u0001\u0000\u0000fh\u0001\u0000"+
		"\u0000\u0000gd\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\r\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000lm\u0003\u0010\b\u0000mn\u0005\b\u0000\u0000"+
		"no\u0003\u0014\n\u0000op\u0005\u0017\u0000\u0000p\u000f\u0001\u0000\u0000"+
		"\u0000qr\u0007\u0001\u0000\u0000rs\u0005\u0017\u0000\u0000s\u0011\u0001"+
		"\u0000\u0000\u0000tu\u0005\u000b\u0000\u0000uv\u0005\u0017\u0000\u0000"+
		"vw\u0005\u0003\u0000\u0000w\u0013\u0001\u0000\u0000\u0000xy\u0005\u0017"+
		"\u0000\u0000y\u0015\u0001\u0000\u0000\u0000z{\u0003\u001e\u000f\u0000"+
		"{\u007f\u0005\f\u0000\u0000|}\u0005\r\u0000\u0000}\u0080\u0003 \u0010"+
		"\u0000~\u0080\u0003\u0018\f\u0000\u007f|\u0001\u0000\u0000\u0000\u007f"+
		"~\u0001\u0000\u0000\u0000\u0080\u0017\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005\u000e\u0000\u0000\u0082\u0083\u0003\u001e\u000f\u0000\u0083\u0019"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u000f\u0000\u0000\u0085\u0086"+
		"\u0005\u0010\u0000\u0000\u0086\u0087\u0005\u0011\u0000\u0000\u0087\u0088"+
		"\u0005\u0017\u0000\u0000\u0088\u001b\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0003\u001e\u000f\u0000\u008a\u008b\u0005\u0012\u0000\u0000\u008b\u008c"+
		"\u0003\"\u0011\u0000\u008c\u001d\u0001\u0000\u0000\u0000\u008d\u008e\u0005"+
		"\u0016\u0000\u0000\u008e\u001f\u0001\u0000\u0000\u0000\u008f\u0090\u0006"+
		"\u0010\uffff\uffff\u0000\u0090\u0091\u0005\u0016\u0000\u0000\u0091\u0097"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\n\u0002\u0000\u0000\u0093\u0094\u0005"+
		"\u0013\u0000\u0000\u0094\u0096\u0003 \u0010\u0003\u0095\u0092\u0001\u0000"+
		"\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098!\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0007\u0002\u0000"+
		"\u0000\u009b#\u0001\u0000\u0000\u0000\u000b)3;HKRX_i\u007f\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}