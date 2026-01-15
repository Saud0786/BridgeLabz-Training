package com.parceltracker;
class DeliveryStageNode {
    String stage;
    DeliveryStageNode next;

    DeliveryStageNode(String stage) {
        this.stage = stage;
        this.next = null;
    }
}
