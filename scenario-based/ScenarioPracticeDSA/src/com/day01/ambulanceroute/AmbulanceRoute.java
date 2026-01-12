package com.day01.ambulanceroute;
class AmbulanceRoute {

    HospitalUnit head;

    void addUnit(String name) {
        HospitalUnit newUnit = new HospitalUnit(name);

        if (head == null) {
            head = newUnit;
            head.next = head;
            return;
        }

        HospitalUnit temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newUnit;
        newUnit.next = head;
    }

    void markUnavailable(String name) {
        if (head == null) return;

        HospitalUnit temp = head;
        do {
            if (temp.name.equals(name)) {
                temp.available = false;
                System.out.println(name + " marked unavailable");
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Unit not found");
    }

    void removeUnit(String name) {
        if (head == null) return;

        HospitalUnit curr = head;
        HospitalUnit prev = null;

        do {
            if (curr.name.equals(name)) {

                if (curr == head && curr.next == head) {
                    head = null;
                }

                else if (curr == head) {
                    prev = head;
                    while (prev.next != head) {
                        prev = prev.next;
                    }
                    head = head.next;
                    prev.next = head;
                }

                else {
                    prev.next = curr.next;
                }

                System.out.println(name + " removed for maintenance");
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Unit not found");
    }

    void routePatient() {
        if (head == null) {
            System.out.println("No units available");
            return;
        }

        HospitalUnit temp = head;
        do {
            if (temp.available) {
                System.out.println("Patient routed to " + temp.name);
                head = temp.next;
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("All units busy");
    }

    void displayUnits() {
        if (head == null) {
            System.out.println("No hospital units");
            return;
        }

        HospitalUnit temp = head;
        do {
            System.out.println(temp.name + " Available " + temp.available);
            temp = temp.next;
        } while (temp != head);
    }
}
