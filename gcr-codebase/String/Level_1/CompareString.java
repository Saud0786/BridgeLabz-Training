import java.util.Scanner;
public class CompareString{
    // create method for compare string
	public static boolean checkString(String s1,String s2){
	    
        if(s1.length()!= s2.length()){
		  return false;
		}		
		
	    for(int i=0;i<s1.length();i++){
		    if(s1.charAt(i)!= s2.charAt(i)){
			  return false;
			}
		}
		
		return true;
	}

  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      // Get input value for
      System.out.println("Enter two string :");
	  String s1 = sc.nextLine();
	  String s2 = sc.nextLine();
	  
	  // Check String result
	   System.out.println("Compare String using built in method: "+ s1.equals(s2));
	   boolean compare = checkString(s1,s2);
	   System.out.println("Compare to string using method: "+ compare);
  }
}