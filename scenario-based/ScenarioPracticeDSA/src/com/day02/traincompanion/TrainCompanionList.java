package com.day02.traincompanion;
class TrainCompanionList {
    private CompartmentNode head;
    private CompartmentNode tail;

    public void addCompartment(String name) {
        CompartmentNode node = new CompartmentNode(name);

        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    public void removeCompartment(String name) {
        CompartmentNode temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {

                if (temp.previous != null)
                    temp.previous.next = temp.next;
                else
                    head = temp.next;

                if (temp.next != null)
                    temp.next.previous = temp.previous;
                else
                    tail = temp.previous;

                System.out.println("Compartment removed");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found");
    }

    public void moveForward() {
        CompartmentNode temp = head;
        System.out.print("Forward traversal: ");
        while (temp != null) {
            System.out.print(temp.name + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void moveBackward() {
        CompartmentNode temp = tail;
        System.out.print("Backward traversal: ");
        while (temp != null) {
            System.out.print(temp.name + " ");
            temp = temp.previous;
        }
        System.out.println();
    }

    public void showAdjacent(String name) {
        CompartmentNode temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {
                System.out.println("Current compartment: " + temp.name);
                System.out.println("Previous compartment: " +
                        (temp.previous != null ? temp.previous.name : "None"));
                System.out.println("Next compartment: " +
                        (temp.next != null ? temp.next.name : "None"));
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found");
    }
}
