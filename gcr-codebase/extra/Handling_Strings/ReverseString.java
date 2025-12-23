import java.util.Scanner;
public class ReverseString{
  
  // Method for reverse String  
  public static void reverseString(String s){
    String rev="";
	for(int i=s.length()-1;i>=0;i--){
	  rev+=s.charAt(i);
	}
	System.out.println("Reverse String: "+rev);
  } 
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for text
      System.out.println("Enter a text:");
	  String s = sc.nextLine();
	  
	  // Method call reverseString
	  reverseString(s);
  }
}