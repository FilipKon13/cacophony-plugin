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

public class CacophonyDivExprImpl extends CacophonyExprImpl implements CacophonyDivExpr {

  public CacophonyDivExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull CacophonyVisitor visitor) {
    visitor.visitDivExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CacophonyVisitor) accept((CacophonyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CacophonyExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CacophonyExpr.class);
  }

}
