package com.smartcheckout;
import java.util.Map;

class Customer {
    String name;
    Map<String, Integer> items; 

    // Customer constructor
    Customer(String name,Map<String,Integer>items){
    	this.name = name;
    	this.items = items;
    }
}
