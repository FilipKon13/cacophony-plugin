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

public class CacophonyFunctionExprImpl extends CacophonyExprImpl implements CacophonyFunctionExpr {

  public CacophonyFunctionExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull CacophonyVisitor visitor) {
    visitor.visitFunctionExpr(this);
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

  @Override
  @NotNull
  public List<CacophonyParam> getParamList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CacophonyParam.class);
  }

  @Override
  @NotNull
  public CacophonyType getType() {
    return findNotNullChildByClass(CacophonyType.class);
  }

}
