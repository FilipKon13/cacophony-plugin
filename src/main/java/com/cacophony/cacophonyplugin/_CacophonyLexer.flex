package com.cacophony.cacophonyplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.cacophony.cacophonyplugin.psi.CacophonyTypes.*;

%%

%{
  public _CacophonyLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class CacophonyLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

COMMENT=#.*
NUMBER=[0-9]+(\.[0-9]*)?
BOOLEAN=true|false
KEYWORDS=let|if|then|else|while|do
SYNTAX=;|\.|\+|-|\*\*|\*|==|=|"/"|,|\(|\)|\^|\!=|\!|>=|<=|>|<|:|[|]|\|\||&&|->|=>
VAR_ID=[a-z][a-zA-Z_0-9]*
TYPE_ID=[A-Z][a-zA-Z_0-9]*
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")

%%
<YYINITIAL> {
  {WHITE_SPACE}       { return WHITE_SPACE; }


  {COMMENT}           { return COMMENT; }
  {NUMBER}            { return NUMBER; }
  {BOOLEAN}           { return BOOLEAN; }
  {KEYWORDS}          { return KEYWORDS; }
  {SYNTAX}            { return SYNTAX; }
  {VAR_ID}            { return VAR_ID; }
  {TYPE_ID}           { return TYPE_ID; }
  {STRING}            { return STRING; }

}

[^] { return BAD_CHARACTER; }
