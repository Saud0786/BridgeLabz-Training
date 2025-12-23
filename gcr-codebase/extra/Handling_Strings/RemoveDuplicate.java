import java.util.Scanner;
public class RemoveDuplicate{

  // Method to find unique characters and make string then return
    public static String removeDuplicate(String text) {
        String rDuplicate ="";
		int uniqueCount = 0;
		char[] temp = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // Check if character already exists
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == ch) {
                    isUnique = false;
                    break;
                }
            }
            
			if(isUnique){
			  temp[uniqueCount++] = ch;
			  rDuplicate +=ch;
			}
            
        }
		return rDuplicate;
	}	


  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for
      System.out.println("Enter a text:");
	  String text = sc.nextLine();
	  
	  // Call method for remove duplicate
	  String rDuplicate= removeDuplicate(text);
	  
	  // Display result
	  System.out.println("String without duplicates: "+rDuplicate);
	  
  }
}