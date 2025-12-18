package com.amit.all.systemdesign.design.patterns.behavioral.command.texteditor;

public class BoldCommand implements Command {

    private final TextEditor textEditor;

    public BoldCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.boldText();
    }
}
