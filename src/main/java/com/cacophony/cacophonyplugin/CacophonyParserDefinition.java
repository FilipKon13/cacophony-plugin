package com.cacophony.cacophonyplugin;

import com.cacophony.cacophonyplugin.parser.CacophonyParser;
import com.cacophony.cacophonyplugin.psi.CacophonyTokenSets;
import com.cacophony.cacophonyplugin.psi.CacophonyTypes;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

final class CacophonyParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(CacophonyLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new CacophonyLexerAdapter();
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return CacophonyTokenSets.COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return CacophonyTokenSets.STRINGS;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new CacophonyParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new CacophonyFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return CacophonyTypes.Factory.createElement(node);
    }

}
