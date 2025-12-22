import java.util.Scanner;
public class StringLength{
  // Method for calculate length
  public static int findLength(String s){
    int count=0;
	while(true){
	 try{
	  if(s.charAt(count)>0){
	   count++;
	  }
	 }catch(Exception e){
		 break;
	 } 
	}
	return count;
  }

  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input string
      System.out.println("Enter String:");
	  String s = sc.next();
	  
	  int inBuiltLength = s.length();
	  int userDefineLength = findLength(s);
	  System.out.println(inBuiltLength+" "+userDefineLength);
	  
	  // compare both
	  if(inBuiltLength== userDefineLength){
	    System.out.println("Both length same");
	  }else{
	    System.out.println("Both length not same");
	  }
  }
}