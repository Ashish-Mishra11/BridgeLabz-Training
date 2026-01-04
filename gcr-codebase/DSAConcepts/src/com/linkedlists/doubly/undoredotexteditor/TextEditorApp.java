package com.linkedlists.doubly.undoredotexteditor;
import java.util.Scanner;

public class TextEditorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UndoRedoManager editor = new UndoRedoManager();
        int choice;

        do {
            System.out.println("\n--- Text Editor Undo/Redo ---");
            System.out.println("1. Type / Add Text");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Display Current Text");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter text: ");
                    String text = sc.nextLine();
                    editor.addState(text);
                    break;

                case 2:
                    editor.undo();
                    editor.displayCurrentState();
                    break;

                case 3:
                    editor.redo();
                    editor.displayCurrentState();
                    break;

                case 4:
                    editor.displayCurrentState();
                    break;

                case 0:
                    System.out.println("Exiting Editor...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}
