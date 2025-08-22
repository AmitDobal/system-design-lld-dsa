package com.amit.systemdesign.design.patterns.behavioral.memento.texteditor;

public class TextEditorMain {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        EditorCaretaker caretaker =  new EditorCaretaker();


        textEditor.write("Hello");
        caretaker.saveState(textEditor);

        textEditor.write("Hello Amit!");
        caretaker.saveState(textEditor);

        caretaker.undo(textEditor);
        caretaker.undo(textEditor);
        System.out.println(textEditor.getContent());
    }

}
