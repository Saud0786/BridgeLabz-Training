package com.passwordgenrator;
import java.util.*;

public class Program {
	
  // Code clean up	
  public static String cleanseAndInvert(String word) {
	  int n = word.length();
	  StringBuilder sb = new StringBuilder();
	  
	  if(n<6) {
		  return "";
	  }
	  
	  for(int i=0;i<n;i++) {
		  char ch = Character.toLowerCase(word.charAt(i));
		  if(ch >=97 && ch <=122 ) {
			  continue;
		  }else {
			  return "";
		  }
	  }
	  int index=0;
	  for(int i=n-1;i>=0;i--) {
		  
		  char ch = word.charAt(i);
		  if(ch % 2 ==0) {
			  continue;
		  }else {
			  if(index%2==0) {
				  sb.append(Character.toUpperCase(ch));
			  }else {
				  sb.append(Character.toLowerCase(ch));
			  }
		  }
		  index++;
	  }
	  
	  return sb.toString();
  }
  
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the word:");
	  
	  String word = sc.nextLine();
	  
	  String ans = cleanseAndInvert(word);
	  
	  if(ans.isEmpty()) {
		  System.out.println("Invalid Input");
	  }else {
		  System.out.println("The generated key is -"+ans);
	  }
 }
}
