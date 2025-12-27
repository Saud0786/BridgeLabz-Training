package com.constructorandacessmodifers.level1;

public class Product {
   String productName;
   int price;
   static int totalProducts=10;
   
   Product(String productName,int price){
	   this.productName = productName;
	   this.price=price;
   }
   
   void displayProductDetails() {
	   System.out.println("--------Product Details------------");
	   System.out.println("Product Name: "+ productName +"\nPrice "+price);
	   totalProducts++;
   }
   
   void  displayTotalProducts() {
	   System.out.println("\nTotal Products:"+totalProducts);
   }
   
   
   public static void main(String[] args) {
	  Product p = new Product("Vivo",200000);
	  p.displayProductDetails();
	  p.displayTotalProducts();
   }
   
}
