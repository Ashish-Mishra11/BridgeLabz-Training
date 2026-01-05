package com.queues.circulartourproblem;
class Queue {
    private int front, rear, size;
    private PetrolPump[] arr;

    public Queue(int capacity) {
        arr = new PetrolPump[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(PetrolPump pump) {
        arr[++rear] = pump;
        size++;
    }

    public PetrolPump dequeue() {
        PetrolPump temp = arr[front++];
        size--;
        return temp;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
