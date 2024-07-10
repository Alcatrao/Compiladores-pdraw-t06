// Generated from pdraw.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pdrawParser}.
 */
public interface pdrawListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pdrawParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(pdrawParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(pdrawParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_PenTypeDef}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_PenTypeDef(pdrawParser.Stat_PenTypeDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_PenTypeDef}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_PenTypeDef(pdrawParser.Stat_PenTypeDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_PenAssign}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_PenAssign(pdrawParser.Stat_PenAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_PenAssign}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_PenAssign(pdrawParser.Stat_PenAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_PenAcio}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_PenAcio(pdrawParser.Stat_PenAcioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_PenAcio}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_PenAcio(pdrawParser.Stat_PenAcioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_VarAssign}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_VarAssign(pdrawParser.Stat_VarAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_VarAssign}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_VarAssign(pdrawParser.Stat_VarAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_VarDeclaration}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_VarDeclaration(pdrawParser.Stat_VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_VarDeclaration}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_VarDeclaration(pdrawParser.Stat_VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_Exec}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_Exec(pdrawParser.Stat_ExecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_Exec}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_Exec(pdrawParser.Stat_ExecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_CanvasDef}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_CanvasDef(pdrawParser.Stat_CanvasDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_CanvasDef}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_CanvasDef(pdrawParser.Stat_CanvasDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_Print}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_Print(pdrawParser.Stat_PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_Print}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_Print(pdrawParser.Stat_PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_canvas_color}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_canvas_color(pdrawParser.Stat_canvas_colorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_canvas_color}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_canvas_color(pdrawParser.Stat_canvas_colorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_PenAlter}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_PenAlter(pdrawParser.Stat_PenAlterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_PenAlter}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_PenAlter(pdrawParser.Stat_PenAlterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_Pause}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_Pause(pdrawParser.Stat_PauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_Pause}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_Pause(pdrawParser.Stat_PauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_if}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_if(pdrawParser.Stat_ifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_if}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_if(pdrawParser.Stat_ifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_function_declaration}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_function_declaration(pdrawParser.Stat_function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_function_declaration}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_function_declaration(pdrawParser.Stat_function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_function}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_function(pdrawParser.Stat_functionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_function}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_function(pdrawParser.Stat_functionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_canvas_select}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_canvas_select(pdrawParser.Stat_canvas_selectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_canvas_select}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_canvas_select(pdrawParser.Stat_canvas_selectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_Until}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_Until(pdrawParser.Stat_UntilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_Until}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_Until(pdrawParser.Stat_UntilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_For}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_For(pdrawParser.Stat_ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_For}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_For(pdrawParser.Stat_ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_Expr}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_Expr(pdrawParser.Stat_ExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_Expr}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_Expr(pdrawParser.Stat_ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_Curly}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat_Curly(pdrawParser.Stat_CurlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_Curly}
	 * labeled alternative in {@link pdrawParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat_Curly(pdrawParser.Stat_CurlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code penAttribute_color}
	 * labeled alternative in {@link pdrawParser#penAttribute}.
	 * @param ctx the parse tree
	 */
	void enterPenAttribute_color(pdrawParser.PenAttribute_colorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code penAttribute_color}
	 * labeled alternative in {@link pdrawParser#penAttribute}.
	 * @param ctx the parse tree
	 */
	void exitPenAttribute_color(pdrawParser.PenAttribute_colorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code penAttribute_position}
	 * labeled alternative in {@link pdrawParser#penAttribute}.
	 * @param ctx the parse tree
	 */
	void enterPenAttribute_position(pdrawParser.PenAttribute_positionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code penAttribute_position}
	 * labeled alternative in {@link pdrawParser#penAttribute}.
	 * @param ctx the parse tree
	 */
	void exitPenAttribute_position(pdrawParser.PenAttribute_positionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code penAttribute_orientation}
	 * labeled alternative in {@link pdrawParser#penAttribute}.
	 * @param ctx the parse tree
	 */
	void enterPenAttribute_orientation(pdrawParser.PenAttribute_orientationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code penAttribute_orientation}
	 * labeled alternative in {@link pdrawParser#penAttribute}.
	 * @param ctx the parse tree
	 */
	void exitPenAttribute_orientation(pdrawParser.PenAttribute_orientationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code penAttribute_thickness}
	 * labeled alternative in {@link pdrawParser#penAttribute}.
	 * @param ctx the parse tree
	 */
	void enterPenAttribute_thickness(pdrawParser.PenAttribute_thicknessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code penAttribute_thickness}
	 * labeled alternative in {@link pdrawParser#penAttribute}.
	 * @param ctx the parse tree
	 */
	void exitPenAttribute_thickness(pdrawParser.PenAttribute_thicknessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code penAttribute_pressure}
	 * labeled alternative in {@link pdrawParser#penAttribute}.
	 * @param ctx the parse tree
	 */
	void enterPenAttribute_pressure(pdrawParser.PenAttribute_pressureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code penAttribute_pressure}
	 * labeled alternative in {@link pdrawParser#penAttribute}.
	 * @param ctx the parse tree
	 */
	void exitPenAttribute_pressure(pdrawParser.PenAttribute_pressureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code penOptions_forward}
	 * labeled alternative in {@link pdrawParser#penOptions}.
	 * @param ctx the parse tree
	 */
	void enterPenOptions_forward(pdrawParser.PenOptions_forwardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code penOptions_forward}
	 * labeled alternative in {@link pdrawParser#penOptions}.
	 * @param ctx the parse tree
	 */
	void exitPenOptions_forward(pdrawParser.PenOptions_forwardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code penOptions_backward}
	 * labeled alternative in {@link pdrawParser#penOptions}.
	 * @param ctx the parse tree
	 */
	void enterPenOptions_backward(pdrawParser.PenOptions_backwardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code penOptions_backward}
	 * labeled alternative in {@link pdrawParser#penOptions}.
	 * @param ctx the parse tree
	 */
	void exitPenOptions_backward(pdrawParser.PenOptions_backwardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code penOptions_up}
	 * labeled alternative in {@link pdrawParser#penOptions}.
	 * @param ctx the parse tree
	 */
	void enterPenOptions_up(pdrawParser.PenOptions_upContext ctx);
	/**
	 * Exit a parse tree produced by the {@code penOptions_up}
	 * labeled alternative in {@link pdrawParser#penOptions}.
	 * @param ctx the parse tree
	 */
	void exitPenOptions_up(pdrawParser.PenOptions_upContext ctx);
	/**
	 * Enter a parse tree produced by the {@code penOptions_down}
	 * labeled alternative in {@link pdrawParser#penOptions}.
	 * @param ctx the parse tree
	 */
	void enterPenOptions_down(pdrawParser.PenOptions_downContext ctx);
	/**
	 * Exit a parse tree produced by the {@code penOptions_down}
	 * labeled alternative in {@link pdrawParser#penOptions}.
	 * @param ctx the parse tree
	 */
	void exitPenOptions_down(pdrawParser.PenOptions_downContext ctx);
	/**
	 * Enter a parse tree produced by the {@code penOptions_left}
	 * labeled alternative in {@link pdrawParser#penOptions}.
	 * @param ctx the parse tree
	 */
	void enterPenOptions_left(pdrawParser.PenOptions_leftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code penOptions_left}
	 * labeled alternative in {@link pdrawParser#penOptions}.
	 * @param ctx the parse tree
	 */
	void exitPenOptions_left(pdrawParser.PenOptions_leftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code penOptions_right}
	 * labeled alternative in {@link pdrawParser#penOptions}.
	 * @param ctx the parse tree
	 */
	void enterPenOptions_right(pdrawParser.PenOptions_rightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code penOptions_right}
	 * labeled alternative in {@link pdrawParser#penOptions}.
	 * @param ctx the parse tree
	 */
	void exitPenOptions_right(pdrawParser.PenOptions_rightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code penOptions_pause}
	 * labeled alternative in {@link pdrawParser#penOptions}.
	 * @param ctx the parse tree
	 */
	void enterPenOptions_pause(pdrawParser.PenOptions_pauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code penOptions_pause}
	 * labeled alternative in {@link pdrawParser#penOptions}.
	 * @param ctx the parse tree
	 */
	void exitPenOptions_pause(pdrawParser.PenOptions_pauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#penTypeDef}.
	 * @param ctx the parse tree
	 */
	void enterPenTypeDef(pdrawParser.PenTypeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#penTypeDef}.
	 * @param ctx the parse tree
	 */
	void exitPenTypeDef(pdrawParser.PenTypeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#penAction}.
	 * @param ctx the parse tree
	 */
	void enterPenAction(pdrawParser.PenActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#penAction}.
	 * @param ctx the parse tree
	 */
	void exitPenAction(pdrawParser.PenActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#canvasDef}.
	 * @param ctx the parse tree
	 */
	void enterCanvasDef(pdrawParser.CanvasDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#canvasDef}.
	 * @param ctx the parse tree
	 */
	void exitCanvasDef(pdrawParser.CanvasDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#penAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPenAssignment(pdrawParser.PenAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#penAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPenAssignment(pdrawParser.PenAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignment(pdrawParser.VarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignment(pdrawParser.VarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(pdrawParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(pdrawParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(pdrawParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(pdrawParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#penAlter}.
	 * @param ctx the parse tree
	 */
	void enterPenAlter(pdrawParser.PenAlterContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#penAlter}.
	 * @param ctx the parse tree
	 */
	void exitPenAlter(pdrawParser.PenAlterContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#execution}.
	 * @param ctx the parse tree
	 */
	void enterExecution(pdrawParser.ExecutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#execution}.
	 * @param ctx the parse tree
	 */
	void exitExecution(pdrawParser.ExecutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#pause}.
	 * @param ctx the parse tree
	 */
	void enterPause(pdrawParser.PauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#pause}.
	 * @param ctx the parse tree
	 */
	void exitPause(pdrawParser.PauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(pdrawParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(pdrawParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#canvas_select}.
	 * @param ctx the parse tree
	 */
	void enterCanvas_select(pdrawParser.Canvas_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#canvas_select}.
	 * @param ctx the parse tree
	 */
	void exitCanvas_select(pdrawParser.Canvas_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#canvas_color}.
	 * @param ctx the parse tree
	 */
	void enterCanvas_color(pdrawParser.Canvas_colorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#canvas_color}.
	 * @param ctx the parse tree
	 */
	void exitCanvas_color(pdrawParser.Canvas_colorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(pdrawParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(pdrawParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(pdrawParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(pdrawParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#until}.
	 * @param ctx the parse tree
	 */
	void enterUntil(pdrawParser.UntilContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#until}.
	 * @param ctx the parse tree
	 */
	void exitUntil(pdrawParser.UntilContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(pdrawParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(pdrawParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_stdin}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stdin(pdrawParser.Expr_stdinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_stdin}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stdin(pdrawParser.Expr_stdinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_parenthesis}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_parenthesis(pdrawParser.Expr_parenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_parenthesis}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_parenthesis(pdrawParser.Expr_parenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_bool_and}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_bool_and(pdrawParser.Expr_bool_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_bool_and}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_bool_and(pdrawParser.Expr_bool_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_bool_not}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_bool_not(pdrawParser.Expr_bool_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_bool_not}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_bool_not(pdrawParser.Expr_bool_notContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_mult}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult(pdrawParser.Expr_multContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_mult}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult(pdrawParser.Expr_multContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_var}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_var(pdrawParser.Expr_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_var}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_var(pdrawParser.Expr_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_bool}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_bool(pdrawParser.Expr_boolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_bool}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_bool(pdrawParser.Expr_boolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_bool_comparison}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_bool_comparison(pdrawParser.Expr_bool_comparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_bool_comparison}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_bool_comparison(pdrawParser.Expr_bool_comparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_int}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_int(pdrawParser.Expr_intContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_int}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_int(pdrawParser.Expr_intContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_point}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_point(pdrawParser.Expr_pointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_point}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_point(pdrawParser.Expr_pointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_sum}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_sum(pdrawParser.Expr_sumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_sum}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_sum(pdrawParser.Expr_sumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_real}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_real(pdrawParser.Expr_realContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_real}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_real(pdrawParser.Expr_realContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_string}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_string(pdrawParser.Expr_stringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_string}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_string(pdrawParser.Expr_stringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_bool_or_xor}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_bool_or_xor(pdrawParser.Expr_bool_or_xorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_bool_or_xor}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_bool_or_xor(pdrawParser.Expr_bool_or_xorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_conversion}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_conversion(pdrawParser.Expr_conversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_conversion}
	 * labeled alternative in {@link pdrawParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_conversion(pdrawParser.Expr_conversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdrawParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPoint(pdrawParser.PointContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdrawParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPoint(pdrawParser.PointContext ctx);
}