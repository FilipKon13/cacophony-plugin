// This is a generated file. Not intended for manual editing.
package com.cacophony.cacophonyplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.cacophony.cacophonyplugin.CacophonyElementType;
import com.cacophony.cacophonyplugin.CacophonyTokenType;
import com.cacophony.cacophonyplugin.psi.impl.*;

public interface CacophonyTypes {

  IElementType AND_EXPR = new CacophonyElementType("AND_EXPR");
  IElementType ASSIGN_EXPR = new CacophonyElementType("ASSIGN_EXPR");
  IElementType CONDITIONAL_EXPR = new CacophonyElementType("CONDITIONAL_EXPR");
  IElementType DECLARATION_EXPR = new CacophonyElementType("DECLARATION_EXPR");
  IElementType DIV_EXPR = new CacophonyElementType("DIV_EXPR");
  IElementType EXPR = new CacophonyElementType("EXPR");
  IElementType FUNCTION_CALL_EXPR = new CacophonyElementType("FUNCTION_CALL_EXPR");
  IElementType FUNCTION_EXPR = new CacophonyElementType("FUNCTION_EXPR");
  IElementType IDENTIFIER = new CacophonyElementType("IDENTIFIER");
  IElementType IF_ELSE_EXPR = new CacophonyElementType("IF_ELSE_EXPR");
  IElementType IF_EXPR = new CacophonyElementType("IF_EXPR");
  IElementType LITERAL_EXPR = new CacophonyElementType("LITERAL_EXPR");
  IElementType MINUS_EXPR = new CacophonyElementType("MINUS_EXPR");
  IElementType MUL_EXPR = new CacophonyElementType("MUL_EXPR");
  IElementType OR_EXPR = new CacophonyElementType("OR_EXPR");
  IElementType PARAM = new CacophonyElementType("PARAM");
  IElementType PAREN_EXPR = new CacophonyElementType("PAREN_EXPR");
  IElementType PLUS_EXPR = new CacophonyElementType("PLUS_EXPR");
  IElementType SELF_OP_EXPR = new CacophonyElementType("SELF_OP_EXPR");
  IElementType SIMPLE_REF_EXPR = new CacophonyElementType("SIMPLE_REF_EXPR");
  IElementType TYPE = new CacophonyElementType("TYPE");
  IElementType UNARY_MIN_EXPR = new CacophonyElementType("UNARY_MIN_EXPR");
  IElementType UNARY_NOT_EXPR = new CacophonyElementType("UNARY_NOT_EXPR");
  IElementType UNARY_PLUS_EXPR = new CacophonyElementType("UNARY_PLUS_EXPR");
  IElementType WHILE_EXPR = new CacophonyElementType("WHILE_EXPR");

  IElementType BOOLEAN = new CacophonyTokenType("boolean");
  IElementType COMMENT = new CacophonyTokenType("comment");
  IElementType KEYWORDS = new CacophonyTokenType("keywords");
  IElementType NUMBER = new CacophonyTokenType("number");
  IElementType STRING = new CacophonyTokenType("string");
  IElementType SYNTAX = new CacophonyTokenType("syntax");
  IElementType TYPE_ID = new CacophonyTokenType("type_id");
  IElementType VAR_ID = new CacophonyTokenType("var_id");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == AND_EXPR) {
        return new CacophonyAndExprImpl(node);
      }
      else if (type == ASSIGN_EXPR) {
        return new CacophonyAssignExprImpl(node);
      }
      else if (type == CONDITIONAL_EXPR) {
        return new CacophonyConditionalExprImpl(node);
      }
      else if (type == DECLARATION_EXPR) {
        return new CacophonyDeclarationExprImpl(node);
      }
      else if (type == DIV_EXPR) {
        return new CacophonyDivExprImpl(node);
      }
      else if (type == FUNCTION_CALL_EXPR) {
        return new CacophonyFunctionCallExprImpl(node);
      }
      else if (type == FUNCTION_EXPR) {
        return new CacophonyFunctionExprImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new CacophonyIdentifierImpl(node);
      }
      else if (type == IF_ELSE_EXPR) {
        return new CacophonyIfElseExprImpl(node);
      }
      else if (type == IF_EXPR) {
        return new CacophonyIfExprImpl(node);
      }
      else if (type == LITERAL_EXPR) {
        return new CacophonyLiteralExprImpl(node);
      }
      else if (type == MINUS_EXPR) {
        return new CacophonyMinusExprImpl(node);
      }
      else if (type == MUL_EXPR) {
        return new CacophonyMulExprImpl(node);
      }
      else if (type == OR_EXPR) {
        return new CacophonyOrExprImpl(node);
      }
      else if (type == PARAM) {
        return new CacophonyParamImpl(node);
      }
      else if (type == PAREN_EXPR) {
        return new CacophonyParenExprImpl(node);
      }
      else if (type == PLUS_EXPR) {
        return new CacophonyPlusExprImpl(node);
      }
      else if (type == SELF_OP_EXPR) {
        return new CacophonySelfOpExprImpl(node);
      }
      else if (type == SIMPLE_REF_EXPR) {
        return new CacophonySimpleRefExprImpl(node);
      }
      else if (type == TYPE) {
        return new CacophonyTypeImpl(node);
      }
      else if (type == UNARY_MIN_EXPR) {
        return new CacophonyUnaryMinExprImpl(node);
      }
      else if (type == UNARY_NOT_EXPR) {
        return new CacophonyUnaryNotExprImpl(node);
      }
      else if (type == UNARY_PLUS_EXPR) {
        return new CacophonyUnaryPlusExprImpl(node);
      }
      else if (type == WHILE_EXPR) {
        return new CacophonyWhileExprImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
