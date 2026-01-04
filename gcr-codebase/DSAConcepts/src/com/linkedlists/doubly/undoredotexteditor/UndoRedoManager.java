package com.linkedlists.doubly.undoredotexteditor;
public class UndoRedoManager {

    private TextStateNode head;
    private TextStateNode tail;
    private TextStateNode current;
    private int size;
    private final int MAX_HISTORY = 10;

    // Add new text state
    public void addState(String text) {
        TextStateNode newNode = new TextStateNode(text);

        // If undo was used, remove redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
            size = calculateSize();
        }

        if (head == null) {
            head = tail = current = newNode;
            size = 1;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            current = newNode;
            size++;
        }

        // Limit history size
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo operation
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("No more undo available");
        }
    }

    // Redo operation
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("No more redo available");
        }
    }

    // Display current text
    public void displayCurrentState() {
        if (current == null) {
            System.out.println("Editor is empty");
        } else {
            System.out.println("Current Text: " + current.content);
        }
    }

    // Utility method
    private int calculateSize() {
        int count = 0;
        TextStateNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
