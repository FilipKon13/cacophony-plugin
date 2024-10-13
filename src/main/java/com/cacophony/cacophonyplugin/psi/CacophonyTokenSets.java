package com.cacophony.cacophonyplugin.psi;

import com.intellij.psi.tree.TokenSet;

public interface CacophonyTokenSets {

//    TokenSet IDENTIFIERS = TokenSet.create(CacophonyTypes.KEY);

    TokenSet COMMENTS = TokenSet.create(CacophonyTypes.COMMENT);
    TokenSet STRINGS = TokenSet.create(CacophonyTypes.STRING);

}
