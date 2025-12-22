import java.util.Scanner;
public class SplitString{
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
  
  public static char[] splitWord(int size,String s){
    char arr[] = new char[size];
	for(int i=0;i<size;i++){
	  arr[i] = s.charAt(i);
	}
	return arr;
  }
  
  public static boolean compareArray(char a[], char b[]){
       if(a.length != b.length){
	     return false;
	   }
	   for(int i=0;i<a.length;i++){
	     if(a[i]!=b[i]){
		   return false;
		 }
	   }
	   return false;
  }

  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input string
      System.out.println("Enter String:");
	  String s = sc.next();

	  int userDefineLength = findLength(s);
	  char splitWord[] = s.toCharArray();
	  char userDefineSplit[] = splitWord(userDefineLength,s);
 	  boolean isSame = compareArray(splitWord,userDefineSplit);
	  
	  // compare both
	  if(isSame){
	    System.out.println("Both word same");
	  }else{
	    System.out.println("Both word not same");
	  }
  }
}