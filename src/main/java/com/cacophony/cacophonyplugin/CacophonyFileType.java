package com.cacophony.cacophonyplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class CacophonyFileType extends LanguageFileType {

    public static final CacophonyFileType INSTANCE = new CacophonyFileType();

    private CacophonyFileType() {
        super(CacophonyLanguage.INSTANCE);
    }

    @Override
    public @NonNls @NotNull String getName() {
        return "Cacophony File";
    }

    @Override
    public @NlsContexts.Label @NotNull String getDescription() {
        return "Cacophony language File";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "cac";
    }

    @Override
    public Icon getIcon() {
        return CacophonyIcon.ICON;
    }
}
