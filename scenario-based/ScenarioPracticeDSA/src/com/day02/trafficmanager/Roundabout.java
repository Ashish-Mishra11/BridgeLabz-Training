package com.day02.trafficmanager;
class Roundabout {
    private VehicleNode tail;

    public void addVehicle(String number) {
        VehicleNode node = new VehicleNode(number);

        if (tail == null) {
            tail = node;
            node.next = node;
        } else {
            node.next = tail.next;
            tail.next = node;
            tail = node;
        }
        System.out.println("Vehicle entered roundabout");
    }

    public void removeVehicle() {
        if (tail == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        VehicleNode head = tail.next;

        if (head == tail) {
            tail = null;
        } else {
            tail.next = head.next;
        }
        System.out.println("Vehicle exited roundabout");
    }

    public void displayRoundabout() {
        if (tail == null) {
            System.out.println("Roundabout empty");
            return;
        }

        VehicleNode temp = tail.next;
        System.out.print("Roundabout vehicles: ");

        do {
            System.out.print(temp.vehicleNumber + " ");
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println();
    }

    public boolean isEmpty() {
        return tail == null;
    }
}
