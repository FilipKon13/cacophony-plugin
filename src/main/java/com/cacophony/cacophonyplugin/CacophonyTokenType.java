package com.cacophony.cacophonyplugin;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CacophonyTokenType extends IElementType {

    public CacophonyTokenType(@NonNls @NotNull String debugName) {
        super(debugName, CacophonyLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "CacophonyTokenType." + super.toString();
    }
}
