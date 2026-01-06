package com.stringbuffer;

public class StringConcatenation {
  public static void main(String[] args) {
	
	  String arr[] = {"This","is","a","good","car"};
	  
	  // StringBuffer
	  StringBuffer sb = new StringBuffer();
	  
	  for(String e: arr) {
		  sb.append(e);
	  }
	  
	  
	  // output in string
	  System.out.println(sb.toString());
  }
}
