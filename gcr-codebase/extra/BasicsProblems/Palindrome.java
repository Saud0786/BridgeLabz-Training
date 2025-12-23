import java.util.Scanner;
public class Palindrome{
    // Palindrome Checker
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--))
                return false;
        }
        return true;
    }

  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value 
      System.out.println("Enter a text:");
	  String text = sc.next();
	  
	  // print result
	  System.out.println("Text is Palindrome: " +isPalindrome(text));
  }
}