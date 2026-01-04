package com.linkedlists.circular.taskscheduler;
public class TaskCircularLinkedList {

    private TaskNode head;
    private TaskNode current;

    // Add at Beginning
    public void addAtBeginning(int id, String name, int priority, String date) {
        TaskNode newNode = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    // Add at End
    public void addAtEnd(int id, String name, int priority, String date) {
        TaskNode newNode = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Add at Position (1-based)
    public void addAtPosition(int pos, int id, String name, int priority, String date) {
        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            addAtBeginning(id, name, priority, date);
            return;
        }

        TaskNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        TaskNode newNode = new TaskNode(id, name, priority, date);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove by Task ID
    public void removeById(int id) {
        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }

        TaskNode temp = head;
        TaskNode prev = null;

        do {
            if (temp.taskId == id) {

                if (temp == head) {
                    TaskNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }

                System.out.println("Task removed successfully");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task not found");
    }

    // View current task and move to next
    public void viewNextTask() {
        if (current == null) {
            System.out.println("No tasks available");
            return;
        }

        displayTask(current);
        current = current.next;
    }

    // Display all tasks
    public void displayAll() {
        if (head == null) {
            System.out.println("No tasks to display");
            return;
        }

        TaskNode temp = head;
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No task with given priority");
        }
    }

    private void displayTask(TaskNode t) {
        System.out.println(
            "ID: " + t.taskId +
            ", Name: " + t.taskName +
            ", Priority: " + t.priority +
            ", Due Date: " + t.dueDate
        );
    }
}
