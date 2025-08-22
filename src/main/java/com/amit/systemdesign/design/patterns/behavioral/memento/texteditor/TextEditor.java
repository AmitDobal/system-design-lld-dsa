package com.amit.systemdesign.design.patterns.behavioral.memento.texteditor;

public class TextEditor {

    private String content;

    public void write(String text){
        this.content = text;
    }

    public String getContent(){
        return this.content;
    }

    public TextEditorMemento save(){
        return new TextEditorMemento(this.content);
    }

    public void restore (TextEditorMemento memento){
        content = memento.getContent();
    }
}
