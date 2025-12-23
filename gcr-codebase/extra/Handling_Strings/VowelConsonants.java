import java.util.Scanner;
public class VowelConsonants{
  public static void countVowelConsonants(String s){
     int countV =0;
	 int countC =0;
	 s=s.toLowerCase();
	 for(char c: s.toCharArray()){
	    if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ){
		  countV++;
		}else{
		  countC++;
		}
	 }
	 System.out.println("Vowel Count:"+countV +"\nConsonant Count: "+ countC);;
  } 
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for
      System.out.println("Enter a text:");
	  String text = sc.nextLine();
	  
	  // Call method and print result
	    countVowelConsonants(text);
  }
}