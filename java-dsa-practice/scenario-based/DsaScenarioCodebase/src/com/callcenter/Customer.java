package com.callcenter;

class Customer {
    String id;
    String name;
    boolean isVIP;
    long callTime;

    public Customer(String id, String name, boolean isVIP) {
        this.id = id;
        this.name = name;
        this.isVIP = isVIP;
        this.callTime = System.currentTimeMillis();
    }
}
