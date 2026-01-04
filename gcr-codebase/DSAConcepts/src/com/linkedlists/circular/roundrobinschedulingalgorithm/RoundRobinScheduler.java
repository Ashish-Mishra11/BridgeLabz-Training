package com.linkedlists.circular.roundrobinschedulingalgorithm;
public class RoundRobinScheduler {
    private ProcessNode head = null;
    private ProcessNode tail = null;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // Add process to circular list
    public void addProcess(int processID, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(processID, burstTime, priority);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Remove process by ID
    private void removeProcess(int processID) {
        if (head == null) return;
        ProcessNode current = head;
        ProcessNode prev = tail;

        do {
            if (current.processID == processID) {
                if (current == head) {
                    if (head == tail) { // only one node
                        head = null;
                        tail = null;
                    } else {
                        head = head.next;
                        tail.next = head;
                    }
                } else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                }
                break;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    // Display all processes
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }
        ProcessNode current = head;
        System.out.println("ProcessID\tBurstTime\tRemainingTime\tPriority");
        do {
            System.out.println(current.processID + "\t\t" + current.burstTime + "\t\t" + current.remainingTime + "\t\t" + current.priority);
            current = current.next;
        } while (current != head);
    }

    // Run round robin scheduling
    public void executeScheduling() {
        if (head == null) return;

        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;
        int processCount = 0;

        ProcessNode current = head;

        while (head != null) {
            if (current.remainingTime > 0) {
                int executedTime = Math.min(current.remainingTime, timeQuantum);
                current.remainingTime -= executedTime;

                System.out.println("Process " + current.processID + " executed for " + executedTime + " units.");

                if (current.remainingTime == 0) {
                    int turnAroundTime = current.burstTime; // simplified for demo
                    int waitingTime = turnAroundTime - current.burstTime;
                    totalTurnAroundTime += turnAroundTime;
                    totalWaitingTime += waitingTime;
                    processCount++;

                    System.out.println("Process " + current.processID + " finished execution.");
                    ProcessNode nextNode = current.next;
                    removeProcess(current.processID);
                    current = nextNode;
                    if (head == null) break;
                    continue;
                }
            }
            current = current.next;
        }

        System.out.println("Average Waiting Time: " + (totalWaitingTime / (double) processCount));
        System.out.println("Average Turnaround Time: " + (totalTurnAroundTime / (double) processCount));
    }
}
