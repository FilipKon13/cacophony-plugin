// This is a generated file. Not intended for manual editing.
package com.cacophony.cacophonyplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.cacophony.cacophonyplugin.psi.CacophonyTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CacophonyParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    boolean r;
    if (t == EXPR) {
      r = expr(b, l + 1, -1);
    }
    else {
      r = root(b, l + 1);
    }
    return r;
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(AND_EXPR, ASSIGN_EXPR, BREAK_EXPR, CONDITIONAL_EXPR,
      DECLARATION_EXPR, DIV_EXPR, EXPR, FUNCTION_CALL_EXPR,
      FUNCTION_EXPR, IF_ELSE_EXPR, IF_EXPR, LITERAL_EXPR,
      MINUS_EXPR, MUL_EXPR, OR_EXPR, PAREN_EXPR,
      PLUS_EXPR, SELF_OP_EXPR, SIMPLE_REF_EXPR, UNARY_MIN_EXPR,
      UNARY_NOT_EXPR, UNARY_PLUS_EXPR, WHILE_EXPR),
  };

  /* ********************************************************** */
  // expr ';'
  static boolean element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_);
    r = expr(b, l + 1, -1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, CacophonyParser::element_recover);
    return r;
  }

  /* ********************************************************** */
  // !('(' | '+' | '-' | '!' | var_id | number | syntax | keywords | boolean | type_id )
  static boolean element_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !element_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' | '+' | '-' | '!' | var_id | number | syntax | keywords | boolean | type_id
  private static boolean element_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_recover_0")) return false;
    boolean r;
    r = consumeToken(b, "(");
    if (!r) r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    if (!r) r = consumeToken(b, "!");
    if (!r) r = consumeToken(b, VAR_ID);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, SYNTAX);
    if (!r) r = consumeToken(b, KEYWORDS);
    if (!r) r = consumeToken(b, BOOLEAN);
    if (!r) r = consumeToken(b, TYPE_ID);
    return r;
  }

  /* ********************************************************** */
  // var_id
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    if (!nextTokenIs(b, VAR_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VAR_ID);
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // identifier ':' type
  public static boolean param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param")) return false;
    if (!nextTokenIs(b, VAR_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && type(b, l + 1);
    exit_section_(b, m, PARAM, r);
    return r;
  }

  /* ********************************************************** */
  // element *
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    while (true) {
      int c = current_position_(b);
      if (!element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // type_id
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    if (!nextTokenIs(b, TYPE_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE_ID);
    exit_section_(b, m, TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: expr
  // Operator priority table:
  // 0: BINARY(assign_expr)
  // 1: BINARY(self_op_expr)
  // 2: BINARY(conditional_expr)
  // 3: BINARY(plus_expr) BINARY(minus_expr)
  // 4: BINARY(mul_expr) BINARY(div_expr)
  // 5: PREFIX(unary_plus_expr) PREFIX(unary_min_expr) PREFIX(unary_not_expr)
  // 6: BINARY(or_expr) BINARY(and_expr)
  // 7: PREFIX(declaration_expr)
  // 8: ATOM(if_else_expr) ATOM(if_expr) ATOM(while_expr)
  // 9: PREFIX(function_expr)
  // 10: POSTFIX(function_call_expr)
  // 11: ATOM(break_expr)
  // 12: ATOM(simple_ref_expr) ATOM(literal_expr) ATOM(paren_expr)
  public static boolean expr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr")) return false;
    addVariant(b, "<expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expr>");
    r = unary_plus_expr(b, l + 1);
    if (!r) r = unary_min_expr(b, l + 1);
    if (!r) r = unary_not_expr(b, l + 1);
    if (!r) r = declaration_expr(b, l + 1);
    if (!r) r = if_else_expr(b, l + 1);
    if (!r) r = if_expr(b, l + 1);
    if (!r) r = while_expr(b, l + 1);
    if (!r) r = function_expr(b, l + 1);
    if (!r) r = break_expr(b, l + 1);
    if (!r) r = simple_ref_expr(b, l + 1);
    if (!r) r = literal_expr(b, l + 1);
    if (!r) r = paren_expr(b, l + 1);
    p = r;
    r = r && expr_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean expr_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && consumeTokenSmart(b, "=")) {
        r = expr(b, l, -1);
        exit_section_(b, l, m, ASSIGN_EXPR, r, true, null);
      }
      else if (g < 1 && self_op_expr_0(b, l + 1)) {
        r = expr(b, l, 1);
        exit_section_(b, l, m, SELF_OP_EXPR, r, true, null);
      }
      else if (g < 2 && conditional_expr_0(b, l + 1)) {
        r = expr(b, l, 2);
        exit_section_(b, l, m, CONDITIONAL_EXPR, r, true, null);
      }
      else if (g < 3 && consumeTokenSmart(b, "+")) {
        r = expr(b, l, 3);
        exit_section_(b, l, m, PLUS_EXPR, r, true, null);
      }
      else if (g < 3 && consumeTokenSmart(b, "-")) {
        r = expr(b, l, 3);
        exit_section_(b, l, m, MINUS_EXPR, r, true, null);
      }
      else if (g < 4 && consumeTokenSmart(b, "*")) {
        r = expr(b, l, 4);
        exit_section_(b, l, m, MUL_EXPR, r, true, null);
      }
      else if (g < 4 && consumeTokenSmart(b, "/")) {
        r = expr(b, l, 4);
        exit_section_(b, l, m, DIV_EXPR, r, true, null);
      }
      else if (g < 6 && consumeTokenSmart(b, "||")) {
        r = expr(b, l, 6);
        exit_section_(b, l, m, OR_EXPR, r, true, null);
      }
      else if (g < 6 && consumeTokenSmart(b, "&&")) {
        r = expr(b, l, 6);
        exit_section_(b, l, m, AND_EXPR, r, true, null);
      }
      else if (g < 10 && function_call_expr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, FUNCTION_CALL_EXPR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // '+=' | '-=' | '*=' | '/='
  private static boolean self_op_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "self_op_expr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, "+=");
    if (!r) r = consumeTokenSmart(b, "-=");
    if (!r) r = consumeTokenSmart(b, "*=");
    if (!r) r = consumeTokenSmart(b, "/=");
    return r;
  }

  // '<' | '>' | '<=' | '>=' | '==' | '!='
  private static boolean conditional_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_expr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, "<");
    if (!r) r = consumeTokenSmart(b, ">");
    if (!r) r = consumeTokenSmart(b, "<=");
    if (!r) r = consumeTokenSmart(b, ">=");
    if (!r) r = consumeTokenSmart(b, "==");
    if (!r) r = consumeTokenSmart(b, "!=");
    return r;
  }

  public static boolean unary_plus_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_plus_expr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, "+");
    p = r;
    r = p && expr(b, l, 5);
    exit_section_(b, l, m, UNARY_PLUS_EXPR, r, p, null);
    return r || p;
  }

  public static boolean unary_min_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_min_expr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, "-");
    p = r;
    r = p && expr(b, l, 5);
    exit_section_(b, l, m, UNARY_MIN_EXPR, r, p, null);
    return r || p;
  }

  public static boolean unary_not_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_not_expr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, "!");
    p = r;
    r = p && expr(b, l, 5);
    exit_section_(b, l, m, UNARY_NOT_EXPR, r, p, null);
    return r || p;
  }

  public static boolean declaration_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_expr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = declaration_expr_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 7);
    exit_section_(b, l, m, DECLARATION_EXPR, r, p, null);
    return r || p;
  }

  // 'let' identifier (':' type)? '='
  private static boolean declaration_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "let");
    r = r && identifier(b, l + 1);
    r = r && declaration_expr_0_2(b, l + 1);
    r = r && consumeToken(b, "=");
    exit_section_(b, m, null, r);
    return r;
  }

  // (':' type)?
  private static boolean declaration_expr_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_expr_0_2")) return false;
    declaration_expr_0_2_0(b, l + 1);
    return true;
  }

  // ':' type
  private static boolean declaration_expr_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_expr_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, ":");
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'if' expr 'then' expr 'else' expr
  public static boolean if_else_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_else_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_ELSE_EXPR, "<if else expr>");
    r = consumeTokenSmart(b, "if");
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, "then");
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, "else");
    r = r && expr(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'if' expr 'then' expr
  public static boolean if_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_EXPR, "<if expr>");
    r = consumeTokenSmart(b, "if");
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, "then");
    r = r && expr(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'while' expr 'do' expr
  public static boolean while_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHILE_EXPR, "<while expr>");
    r = consumeTokenSmart(b, "while");
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, "do");
    r = r && expr(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  public static boolean function_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_expr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = function_expr_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 9);
    exit_section_(b, l, m, FUNCTION_EXPR, r, p, null);
    return r || p;
  }

  // '[' (param (',' param)*)? ']' '->' type '=>'
  private static boolean function_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "[");
    r = r && function_expr_0_1(b, l + 1);
    r = r && consumeToken(b, "]");
    r = r && consumeToken(b, "->");
    r = r && type(b, l + 1);
    r = r && consumeToken(b, "=>");
    exit_section_(b, m, null, r);
    return r;
  }

  // (param (',' param)*)?
  private static boolean function_expr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_expr_0_1")) return false;
    function_expr_0_1_0(b, l + 1);
    return true;
  }

  // param (',' param)*
  private static boolean function_expr_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_expr_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = param(b, l + 1);
    r = r && function_expr_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' param)*
  private static boolean function_expr_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_expr_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function_expr_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_expr_0_1_0_1", c)) break;
    }
    return true;
  }

  // ',' param
  private static boolean function_expr_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_expr_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, ",");
    r = r && param(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' (expr (',' expr)*)? ']'
  private static boolean function_call_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "[");
    r = r && function_call_expr_0_1(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // (expr (',' expr)*)?
  private static boolean function_call_expr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_expr_0_1")) return false;
    function_call_expr_0_1_0(b, l + 1);
    return true;
  }

  // expr (',' expr)*
  private static boolean function_call_expr_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_expr_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && function_call_expr_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' expr)*
  private static boolean function_call_expr_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_expr_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function_call_expr_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_call_expr_0_1_0_1", c)) break;
    }
    return true;
  }

  // ',' expr
  private static boolean function_call_expr_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_expr_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, ",");
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // control_flow
  public static boolean break_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_expr")) return false;
    if (!nextTokenIsSmart(b, CONTROL_FLOW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, CONTROL_FLOW);
    exit_section_(b, m, BREAK_EXPR, r);
    return r;
  }

  // identifier
  public static boolean simple_ref_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_ref_expr")) return false;
    if (!nextTokenIsSmart(b, VAR_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    exit_section_(b, m, SIMPLE_REF_EXPR, r);
    return r;
  }

  // number | boolean
  public static boolean literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_expr")) return false;
    if (!nextTokenIsSmart(b, BOOLEAN, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_EXPR, "<literal expr>");
    r = consumeTokenSmart(b, NUMBER);
    if (!r) r = consumeTokenSmart(b, BOOLEAN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' (expr (';' expr )*)? ';'? ')'
  public static boolean paren_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAREN_EXPR, "<paren expr>");
    r = consumeTokenSmart(b, "(");
    r = r && paren_expr_1(b, l + 1);
    r = r && paren_expr_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (expr (';' expr )*)?
  private static boolean paren_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expr_1")) return false;
    paren_expr_1_0(b, l + 1);
    return true;
  }

  // expr (';' expr )*
  private static boolean paren_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && paren_expr_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (';' expr )*
  private static boolean paren_expr_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expr_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!paren_expr_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "paren_expr_1_0_1", c)) break;
    }
    return true;
  }

  // ';' expr
  private static boolean paren_expr_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expr_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, ";");
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean paren_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expr_2")) return false;
    consumeTokenSmart(b, ";");
    return true;
  }

}
