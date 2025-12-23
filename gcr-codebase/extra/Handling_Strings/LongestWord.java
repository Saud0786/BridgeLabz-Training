import java.util.Scanner;
public class LongestWord{
  public static String longestWord(String s){
     String word[] = s.split(" ");
     int index=0;
	 int max=0;
     for(int i=0;i<word.length;i++){
	    if(word[i].length()>max){
		   max = word[i].length();
		   index = i;
		}
	 } 	 
	 return word[index];
  } 

  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for
      System.out.println("Enter a text:");
	  String text = sc.nextLine();
	  
	  // Display result
	  String longWord = longestWord(text);
	  System.out.println("Longest word: "+longWord+"\nLongest word length: "+longWord.length());
  }
}