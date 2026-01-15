package com.parceltracker;
class ParcelDeliveryChain {
    private DeliveryStageNode head;

    // Add Stage
    void addStage(String stage) {
        DeliveryStageNode newNode = new DeliveryStageNode(stage);

        if (head == null) {
            head = newNode;
            return;
        }

        DeliveryStageNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // track parcel
    void trackParcel() {
        DeliveryStageNode current = head;

        if (current == null) {
            System.out.println("No delivery stages found.");
            return;
        }

        while (current != null) {
            System.out.print(current.stage + " -> ");
            current = current.next;
        }
        System.out.println("END");
    }

    // add check point
    void addCheckpoint(String afterStage, String newStage) {
        DeliveryStageNode current = head;

        while (current != null && !current.stage.equals(afterStage)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Stage not found: " + afterStage);
            return;
        }

        DeliveryStageNode newNode = new DeliveryStageNode(newStage);
        newNode.next = current.next;
        current.next = newNode;
    }

    // detect parcel loss
    void detectParcelLoss() {
        DeliveryStageNode current = head;

        while (current != null) {
            if (current.next == null && !current.stage.equals("Delivered")) {
                System.out.println(" Parcel lost after stage: " + current.stage);
                return;
            }
            current = current.next;
        }

        System.out.println("Parcel delivered successfully.");
    }
}
