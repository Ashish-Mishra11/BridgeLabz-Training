package com.queues.slidingwindowmaximum;
class Deque {
    private int[] arr;
    private int front, rear, size;

    public Deque(int capacity) {
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(int data) {
        arr[++rear] = data;
        size++;
    }

    public void removeLast() {
        rear--;
        size--;
    }

    public void removeFirst() {
        front++;
        size--;
    }

    public int peekFirst() {
        return arr[front];
    }

    public int peekLast() {
        return arr[rear];
    }
}
