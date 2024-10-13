// This is a generated file. Not intended for manual editing.
package com.cacophony.cacophonyplugin.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class CacophonyVisitor extends PsiElementVisitor {

  public void visitAndExpr(@NotNull CacophonyAndExpr o) {
    visitExpr(o);
  }

  public void visitAssignExpr(@NotNull CacophonyAssignExpr o) {
    visitExpr(o);
  }

  public void visitConditionalExpr(@NotNull CacophonyConditionalExpr o) {
    visitExpr(o);
  }

  public void visitDeclarationExpr(@NotNull CacophonyDeclarationExpr o) {
    visitExpr(o);
  }

  public void visitDivExpr(@NotNull CacophonyDivExpr o) {
    visitExpr(o);
  }

  public void visitExpr(@NotNull CacophonyExpr o) {
    visitPsiElement(o);
  }

  public void visitFunctionCallExpr(@NotNull CacophonyFunctionCallExpr o) {
    visitExpr(o);
  }

  public void visitFunctionExpr(@NotNull CacophonyFunctionExpr o) {
    visitExpr(o);
  }

  public void visitIdentifier(@NotNull CacophonyIdentifier o) {
    visitPsiElement(o);
  }

  public void visitIfElseExpr(@NotNull CacophonyIfElseExpr o) {
    visitExpr(o);
  }

  public void visitIfExpr(@NotNull CacophonyIfExpr o) {
    visitExpr(o);
  }

  public void visitLiteralExpr(@NotNull CacophonyLiteralExpr o) {
    visitExpr(o);
  }

  public void visitMinusExpr(@NotNull CacophonyMinusExpr o) {
    visitExpr(o);
  }

  public void visitMulExpr(@NotNull CacophonyMulExpr o) {
    visitExpr(o);
  }

  public void visitOrExpr(@NotNull CacophonyOrExpr o) {
    visitExpr(o);
  }

  public void visitParam(@NotNull CacophonyParam o) {
    visitPsiElement(o);
  }

  public void visitParenExpr(@NotNull CacophonyParenExpr o) {
    visitExpr(o);
  }

  public void visitPlusExpr(@NotNull CacophonyPlusExpr o) {
    visitExpr(o);
  }

  public void visitSelfOpExpr(@NotNull CacophonySelfOpExpr o) {
    visitExpr(o);
  }

  public void visitSimpleRefExpr(@NotNull CacophonySimpleRefExpr o) {
    visitExpr(o);
  }

  public void visitType(@NotNull CacophonyType o) {
    visitPsiElement(o);
  }

  public void visitUnaryMinExpr(@NotNull CacophonyUnaryMinExpr o) {
    visitExpr(o);
  }

  public void visitUnaryNotExpr(@NotNull CacophonyUnaryNotExpr o) {
    visitExpr(o);
  }

  public void visitUnaryPlusExpr(@NotNull CacophonyUnaryPlusExpr o) {
    visitExpr(o);
  }

  public void visitWhileExpr(@NotNull CacophonyWhileExpr o) {
    visitExpr(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
