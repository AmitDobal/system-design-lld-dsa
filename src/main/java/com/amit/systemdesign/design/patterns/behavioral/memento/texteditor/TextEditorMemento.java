package com.amit.systemdesign.design.patterns.behavioral.memento.texteditor;

public class TextEditorMemento {

    private final String content;

    public TextEditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}
