import java.util.*;

public class LengthOfLastWord {
    // Method for find last word length
    public static int lengthOfLastWord(String s) {
       String str[]=s.split(" ");
        return str[str.length-1].length();
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // Take input from user
        System.out.print("Enter the haystack string: ");
        String s = sc.nextLine();
		
		// display result
		System.out.print("Last string word length: "+lengthOfLastWord(s));
	}	
}