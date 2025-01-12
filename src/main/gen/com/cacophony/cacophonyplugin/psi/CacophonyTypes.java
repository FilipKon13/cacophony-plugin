// This is a generated file. Not intended for manual editing.
package com.cacophony.cacophonyplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.cacophony.cacophonyplugin.CacophonyElementType;
import com.cacophony.cacophonyplugin.CacophonyTokenType;
import com.cacophony.cacophonyplugin.psi.impl.*;

public interface CacophonyTypes {

  IElementType EXPR = new CacophonyElementType("EXPR");

  IElementType BOOLEAN = new CacophonyTokenType("boolean");
  IElementType COMMENT = new CacophonyTokenType("comment");
  IElementType CONTROL_FLOW = new CacophonyTokenType("control_flow");
  IElementType KEYWORDS = new CacophonyTokenType("keywords");
  IElementType NUMBER = new CacophonyTokenType("number");
  IElementType STRING = new CacophonyTokenType("string");
  IElementType SYNTAX = new CacophonyTokenType("syntax");
  IElementType TYPE_ID = new CacophonyTokenType("type_id");
  IElementType VAR_ID = new CacophonyTokenType("var_id");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == EXPR) {
        return new CacophonyExprImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
