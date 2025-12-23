import java.util.Scanner;
public class CheckPalindrome{
  
  // Method for reverse String  
  public static String reverseString(String s){
    String rev="";
	for(int i=s.length()-1;i>=0;i--){
	  rev+=s.charAt(i);
	}
	return rev;
  }

  // Method for check palidrome
  public static boolean isPalindrome(String s ){
     String rev = reverseString(s);
     return rev.equals(s);
  }  

  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for
      System.out.println("Enter a text:");
	  String text = sc.nextLine();
	  
	  if(isPalindrome(text)){
	   System.out.println("String is Palindrome.");
	  }else{
	    System.out.println("String is not Palindrome.");
	  }
  }
}