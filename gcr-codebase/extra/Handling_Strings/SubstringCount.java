import java.util.*;
public class SubstringCount {
	public static int countSubstringOccurrences(String text,String sub){
		int count = 0;
        int index = 0;

        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); 
        }

        return count;
	}
	
    public static void main(String[] args) {
        // Create object of Scanner
        Scanner sc = new Scanner(System.in);
		
		// Take user input
		System.out.println("Enter text:");
		String text = sc.nextLine();
		System.out.println("Enter substring:");
		String sub = sc.nextLine();
		
		// Display result
		System.out.println("Occurrences: " + countSubstringOccurrences(text,sub));
        
    }
}
