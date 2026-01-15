package com.day03.parceltracker;
class ParcelChain {

    StageNode head;

    void addStage(String stage) {

        StageNode newNode = new StageNode(stage);

        if (head == null) {
            head = newNode;
            return;
        }

        StageNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void addCheckpoint(String afterStage, String newStage) {

        if (head == null) {
            System.out.println("Parcel not found");
            return;
        }

        StageNode temp = head;

        while (temp != null) {
            if (temp.stage.equals(afterStage)) {
                StageNode newNode = new StageNode(newStage);
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }

        System.out.println("Stage not found");
    }

    void trackParcel() {

        if (head == null) {
            System.out.println("Parcel missing");
            return;
        }

        StageNode temp = head;
        System.out.println("Parcel tracking");

        while (temp != null) {
            System.out.println(temp.stage);
            temp = temp.next;
        }
    }
}
