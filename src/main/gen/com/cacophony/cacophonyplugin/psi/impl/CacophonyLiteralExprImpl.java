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

public class CacophonyLiteralExprImpl extends CacophonyExprImpl implements CacophonyLiteralExpr {

  public CacophonyLiteralExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull CacophonyVisitor visitor) {
    visitor.visitLiteralExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CacophonyVisitor) accept((CacophonyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getBoolean() {
    return findChildByType(BOOLEAN);
  }

  @Override
  @Nullable
  public PsiElement getNumber() {
    return findChildByType(NUMBER);
  }

}
