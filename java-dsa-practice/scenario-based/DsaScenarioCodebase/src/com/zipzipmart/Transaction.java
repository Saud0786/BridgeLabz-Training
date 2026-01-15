package com.zipzipmart;

class Transaction {
	// Format: YYYY-MM-DD
    String date;   
    double amount;

    Transaction(String date, double amount) {
        this.date = date;
        this.amount = amount;
    }
}