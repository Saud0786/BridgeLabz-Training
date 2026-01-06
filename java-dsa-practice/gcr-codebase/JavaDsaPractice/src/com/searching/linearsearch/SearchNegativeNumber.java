package com.searching.linearsearch;

public class SearchNegativeNumber {
  public static void main(String[] args) {
	int arr[] = {12,34,56,-1,90};
	
	// finding negative number first index
	int index = searchNegative(arr);
	System.out.println("Negative number index: "+ index);
	
}
  public static int searchNegative(int arr[]) {
	// return negative number first index
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
               return i;
			}
		}
		return -1;
  }
}
