package com.day02.traincompanion;
class CompartmentNode {
    String name;
    CompartmentNode previous;
    CompartmentNode next;

    CompartmentNode(String name) {
        this.name = name;
        this.previous = null;
        this.next = null;
    }
}
