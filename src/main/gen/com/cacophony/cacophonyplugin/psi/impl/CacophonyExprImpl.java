// This is a generated file. Not intended for manual editing.
package com.cacophony.cacophonyplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.cacophony.cacophonyplugin.psi.CacophonyTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.cacophony.cacophonyplugin.psi.*;

public class CacophonyExprImpl extends ASTWrapperPsiElement implements CacophonyExpr {

  public CacophonyExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CacophonyVisitor visitor) {
    visitor.visitExpr(this);
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
  public PsiElement getControlFlow() {
    return findChildByType(CONTROL_FLOW);
  }

  @Override
  @Nullable
  public PsiElement getKeywords() {
    return findChildByType(KEYWORDS);
  }

  @Override
  @Nullable
  public PsiElement getNumber() {
    return findChildByType(NUMBER);
  }

  @Override
  @Nullable
  public PsiElement getSyntax() {
    return findChildByType(SYNTAX);
  }

  @Override
  @Nullable
  public PsiElement getTypeId() {
    return findChildByType(TYPE_ID);
  }

  @Override
  @Nullable
  public PsiElement getVarId() {
    return findChildByType(VAR_ID);
  }

}
