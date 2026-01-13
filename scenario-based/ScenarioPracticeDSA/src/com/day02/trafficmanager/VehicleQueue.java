package com.day02.trafficmanager;
class VehicleQueue {
    private String[] queue;
    private int front;
    private int rear;
    private int capacity;

    VehicleQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = 0;
        rear = -1;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public void enqueue(String vehicle) {
        if (isFull()) {
            System.out.println("Queue overflow");
            return;
        }
        queue[++rear] = vehicle;
        System.out.println("Vehicle added to waiting queue");
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return null;
        }
        return queue[front++];
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Waiting queue empty");
            return;
        }

        System.out.print("Waiting vehicles: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
