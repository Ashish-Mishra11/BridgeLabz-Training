package com.day09.tailorshop;
class Order {
    int orderId;
    int deadline;

    Order(int orderId, int deadline) {
        this.orderId = orderId;
        this.deadline = deadline;
    }

    void display() {
        System.out.println("Order ID: " + orderId + " Deadline: " + deadline);
    }
}
