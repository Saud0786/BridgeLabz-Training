package com.medwarehouse;

import java.time.LocalDateTime;

public class Medicine {
    String Mname;
    LocalDateTime Expirydate;
    
    Medicine(String Mname,LocalDateTime Expirydate){
    	this.Mname = Mname;
    	this.Expirydate = Expirydate;
    }
    
    public String toString() {
    	return Mname+ "(" +Expirydate +")";
   }
}
