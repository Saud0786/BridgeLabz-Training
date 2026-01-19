package com.flashdealz;

public class Product {
  String productName;
  double discount;
  
  Product(String productName,double discount){
	  this.productName = productName;
	  this.discount = discount;
  }
  
  public String toString() {
	  return productName + "( " + discount +" )";
  }
}
