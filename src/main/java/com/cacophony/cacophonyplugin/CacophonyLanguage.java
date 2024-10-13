package com.cacophony.cacophonyplugin;

import com.intellij.lang.Language;

public class CacophonyLanguage extends Language {

    public static final CacophonyLanguage INSTANCE = new CacophonyLanguage();

    private CacophonyLanguage() {
        super("Cacophony");
    }
}
