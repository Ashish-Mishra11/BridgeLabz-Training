package com.stacks.queueusingstacks;
class QueueUsingStacks {
    private Stack s1;
    private Stack s2;

    public QueueUsingStacks(int size) {
        s1 = new Stack(size);
        s2 = new Stack(size);
    }

    // Enqueue operation
    public void enqueue(int data) {
        s1.push(data);
        System.out.println(data + " enqueued");
    }

    // Dequeue operation
    public int dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    // Peek front element
    public int peek() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }
}
