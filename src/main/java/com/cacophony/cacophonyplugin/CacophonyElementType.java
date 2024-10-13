package com.cacophony.cacophonyplugin;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CacophonyElementType extends IElementType {

    public CacophonyElementType(@NonNls @NotNull String debugName) {
        super(debugName, CacophonyLanguage.INSTANCE);
    }
}
