package com.cacophony.cacophonyplugin;

import com.intellij.lang.Commenter;
import org.jetbrains.annotations.Nullable;

final class CacophonyCommenter implements Commenter {

    @Override
    public String getLineCommentPrefix() {
        return "# ";
    }

    @Override
    public String getBlockCommentPrefix() {
        return "";
    }

    @Nullable
    @Override
    public String getBlockCommentSuffix() {
        return null;
    }

    @Nullable
    @Override
    public String getCommentedBlockCommentPrefix() {
        return null;
    }

    @Nullable
    @Override
    public String getCommentedBlockCommentSuffix() {
        return null;
    }

}
