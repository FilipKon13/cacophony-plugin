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

public class CacophonyDeclarationExprImpl extends CacophonyExprImpl implements CacophonyDeclarationExpr {

  public CacophonyDeclarationExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull CacophonyVisitor visitor) {
    visitor.visitDeclarationExpr(this);
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
  public CacophonyIdentifier getIdentifier() {
    return findNotNullChildByClass(CacophonyIdentifier.class);
  }

  @Override
  @Nullable
  public CacophonyType getType() {
    return findChildByClass(CacophonyType.class);
  }

}
