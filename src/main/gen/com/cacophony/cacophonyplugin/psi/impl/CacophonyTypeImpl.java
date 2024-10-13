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

public class CacophonyTypeImpl extends ASTWrapperPsiElement implements CacophonyType {

  public CacophonyTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CacophonyVisitor visitor) {
    visitor.visitType(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CacophonyVisitor) accept((CacophonyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getTypeId() {
    return findNotNullChildByType(TYPE_ID);
  }

}
