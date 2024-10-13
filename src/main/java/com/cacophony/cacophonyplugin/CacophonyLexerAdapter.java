package com.cacophony.cacophonyplugin;

import com.intellij.lexer.FlexAdapter;

public class CacophonyLexerAdapter extends FlexAdapter {

    public CacophonyLexerAdapter() {
        super(new CacophonyLexer(null));
    }

}