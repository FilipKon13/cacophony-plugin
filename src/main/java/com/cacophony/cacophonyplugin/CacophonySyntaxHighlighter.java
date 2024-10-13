package com.cacophony.cacophonyplugin;

import com.cacophony.cacophonyplugin.psi.CacophonyTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class CacophonySyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("SIMPLE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey IDENTIFIER_BASIC =
            createTextAttributesKey("IDENTIFIER_BASIC", DefaultLanguageHighlighterColors.CONSTANT);
    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey TYPE =
            createTextAttributesKey("TYPE", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);
    public static final TextAttributesKey BOOLEAN =
            createTextAttributesKey("BOOLEAN", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey SYNTAX =
            createTextAttributesKey("SYNTAX", DefaultLanguageHighlighterColors.PARENTHESES);
    static {
        TYPE.getDefaultAttributes().setFontType(Font.BOLD);
    }

    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] IDENTIFIER_BASIC_KEYS = new TextAttributesKey[]{IDENTIFIER_BASIC};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] TYPE_KEYS = new TextAttributesKey[]{TYPE};
    private static final TextAttributesKey[] BOOLEAN_KEYS = new TextAttributesKey[]{BOOLEAN};
    private static final TextAttributesKey[] SYNTAX_KEYS = new TextAttributesKey[]{SYNTAX};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new CacophonyLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(CacophonyTypes.COMMENT)) {
            return COMMENT_KEYS;
        }
        if(tokenType.equals(CacophonyTypes.KEYWORDS) || tokenType.equals(CacophonyTypes.CONTROL_FLOW)) {
            return KEYWORD_KEYS;
        }
        if(tokenType.equals(CacophonyTypes.VAR_ID)) {
            return IDENTIFIER_BASIC_KEYS;
        }
        if(tokenType.equals(CacophonyTypes.NUMBER)) {
            return NUMBER_KEYS;
        }
        if(tokenType.equals(CacophonyTypes.TYPE_ID)) {
            return TYPE_KEYS;
        }
        if(tokenType.equals(CacophonyTypes.BOOLEAN)) {
            return BOOLEAN_KEYS;
        }
        if(tokenType.equals(CacophonyTypes.SYNTAX)) {
            return SYNTAX_KEYS;
        }
        return EMPTY_KEYS;
    }

}
