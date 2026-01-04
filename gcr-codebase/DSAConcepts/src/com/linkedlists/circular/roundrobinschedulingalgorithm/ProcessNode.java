package com.linkedlists.circular.roundrobinschedulingalgorithm;
public class ProcessNode {
    int processID;
    int burstTime;
    int remainingTime;
    int priority;
    ProcessNode next;

    public ProcessNode(int processID, int burstTime, int priority) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
