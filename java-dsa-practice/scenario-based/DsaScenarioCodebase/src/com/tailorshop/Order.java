package com.tailorshop;

import java.time.LocalDateTime;

public class Order {
    String name;
    LocalDateTime date;
    
    Order(String name,LocalDateTime date){
    	this.name = name;
    	this.date = date;
    }
    
    public String toString() {
    	return name+ "(" +date +")";
    }
}
