package com.day02.texteditor;
import java.util.Stack;

class TextEditor {
    private String content = "";
    private Stack<EditorAction> undoStack = new Stack<>();
    private Stack<EditorAction> redoStack = new Stack<>();

    public void insertText(String text) {
        content = content + text;
        undoStack.push(new EditorAction("insert", text));
        redoStack.clear();
        System.out.println("Text inserted");
    }

    public void deleteText(int length) {
        if (length > content.length()) {
            length = content.length();
        }

        String deleted = content.substring(content.length() - length);
        content = content.substring(0, content.length() - length);
        undoStack.push(new EditorAction("delete", deleted));
        redoStack.clear();
        System.out.println("Text deleted");
    }

    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        EditorAction action = undoStack.pop();

        if (action.type.equals("insert")) {
            content = content.substring(0, content.length() - action.text.length());
        } else if (action.type.equals("delete")) {
            content = content + action.text;
        }

        redoStack.push(action);
        System.out.println("Undo performed");
    }

    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }

        EditorAction action = redoStack.pop();

        if (action.type.equals("insert")) {
            content = content + action.text;
        } else if (action.type.equals("delete")) {
            content = content.substring(0, content.length() - action.text.length());
        }

        undoStack.push(action);
        System.out.println("Redo performed");
    }

    public void showContent() {
        System.out.println("Current text: " + content);
    }
}
