import java.util.Scanner;

public class CheckValidParentheses {
    
    public static boolean isValid(String s) {
       while(true){
          if(s.contains("()")){
            s = s.replace("()","");
          }else if(s.contains("{}")){
            s = s.replace("{}","");
          }else if(s.contains("[]")){
            s = s.replace("[]","");
          }else{
            return s.isEmpty();
          }
       }
    }
	public static void main(String agrs[]){
	  // Scanner object
	  Scanner sc = new Scanner(System.in);
	  
	  // Take user input
	  System.out.println("Enter a Parentheses String:");
	  String text = sc.next();
	  
	  // Display result
	  System.out.println("Is given Parentheses Valid? "+isValid(text));
	  
	}
}