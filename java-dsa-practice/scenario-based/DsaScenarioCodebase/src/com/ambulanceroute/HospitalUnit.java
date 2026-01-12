package com.ambulanceroute;

// Node data
class HospitalUnit {
    String unitName;
    boolean available;
    HospitalUnit next;

    HospitalUnit(String unitName, boolean available) {
        this.unitName = unitName;
        this.available = available;
        this.next = null;
    }
}