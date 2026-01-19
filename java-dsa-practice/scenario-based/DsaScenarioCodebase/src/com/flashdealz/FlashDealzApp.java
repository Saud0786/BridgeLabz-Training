package com.flashdealz;
import java.util.*;

public class FlashDealzApp {
 
  public static void quickSort(Product products[],int low,int high) {
	  if(low<high) {
		  int pivotIndex = partition(products,low,high);
		  quickSort(products,low,pivotIndex-1);
		  quickSort(products, pivotIndex+1, high);
	  }
  }
  
  public static int partition(Product products[], int low, int high) {

	    Product pivot = products[high];
	    int i = low - 1;

	    for (int j = low; j < high; j++) {
	        if (products[j].discount <= pivot.discount) {
	            i++;
	            Product temp = products[i];
	            products[i] = products[j];
	            products[j] = temp;
	        }
	    }

	    // pivot swap
	    Product temp = products[i + 1];
	    products[i + 1] = products[high];
	    products[high] = temp;

	    return i + 1;
	}

	
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter number of products:");
	  int n = sc.nextInt();
	  
	  Product products[] = new Product[n];
	  
	  for(int i=0;i<n;i++) {
		  System.out.println("Enter Product name:");
		  String productName = sc.next();
		  
		  System.out.println("Enter Product discount:");
		  double discount = sc.nextDouble();
		  
		  products[i] = new Product(productName,discount);
	  }
	  
	  
	  // calling quick sort
	  quickSort(products, 0, n-1);
	  
	  System.out.println(Arrays.toString(products));
	  
	  
  }
}
