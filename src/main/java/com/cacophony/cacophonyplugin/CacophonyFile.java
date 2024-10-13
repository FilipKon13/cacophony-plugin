package com.cacophony.cacophonyplugin;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class CacophonyFile extends PsiFileBase {

    public CacophonyFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, CacophonyLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return CacophonyFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Cacophony File";
    }

}
