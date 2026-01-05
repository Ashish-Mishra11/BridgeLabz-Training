package com.stacks.stockspanproblem;
class Stack {
    private int[] arr;
    private int top;

    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    public void push(int data) {
        arr[++top] = data;
    }

    public int pop() {
        return arr[top--];
    }

    public int peek() {
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
