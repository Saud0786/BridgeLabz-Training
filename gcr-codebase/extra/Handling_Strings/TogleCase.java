import java.util.Scanner;
public class TogleCase{
	// Create method for togleString
	public static String togleString(String s){
		String togal = "";
		for(int i=0;i<s.length();i++){
		     char ch = s.charAt(i);
			if(ch>=65 && ch<=90){
			   togal+=Character.toLowerCase(ch);
			}else{
			   togal+=Character.toUpperCase(ch);
			}
		}
		return togal;
	} 
	
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for
      System.out.println("Enter a text:");
	  String text = sc.nextLine();
	  
	  String togleText= togleString(text);
	  System.out.println("Togle Text: "+togleText);
  }
}