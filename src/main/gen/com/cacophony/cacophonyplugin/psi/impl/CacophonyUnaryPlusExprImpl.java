// This is a generated file. Not intended for manual editing.
package com.cacophony.cacophonyplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.cacophony.cacophonyplugin.psi.CacophonyTypes.*;
import com.cacophony.cacophonyplugin.psi.*;

public class CacophonyUnaryPlusExprImpl extends CacophonyExprImpl implements CacophonyUnaryPlusExpr {

  public CacophonyUnaryPlusExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull CacophonyVisitor visitor) {
    visitor.visitUnaryPlusExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CacophonyVisitor) accept((CacophonyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CacophonyExpr getExpr() {
    return findChildByClass(CacophonyExpr.class);
  }

}
