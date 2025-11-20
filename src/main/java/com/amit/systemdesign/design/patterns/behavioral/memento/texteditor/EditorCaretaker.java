package com.amit.systemdesign.design.patterns.behavioral.memento.texteditor;

import java.util.Stack;

//Manage mementos (snapshots of the textEditor state)
public class EditorCaretaker {
    private final Stack<TextEditorMemento> history = new Stack<>();

    public void saveState(TextEditor editor) {
        history.push(editor.save());
    }


    public void undo(TextEditor textEditor) {
        if (!history.empty()) {
            history.pop();
            textEditor.restore(history.peek());
        }
    }
}
