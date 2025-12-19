import java.util.Scanner;
public class ValidStudentsVoters{
  public static void main(String args[]){
	     // Create a Scanner Object
         Scanner sc = new Scanner(System.in);
	  
	     // Declare the elements of array(1D)
	     int ages[] = new int[10];
	  
         //  Get input value for list of students
	     System.out.println("Enter ten Students Age: ");
	     for(int i=0;i<ages.length;i++){
		  ages[i] = sc.nextInt();
		 }
		 
	    // Display valid voters
         for(int i=0;i<ages.length;i++){
		   if(ages[i]<0){
		    System.out.println("Invalid age.");
		   }else if(ages[i]>=18){
		     System.out.println("The student with the age " + ages[i] + " can vote.");
		   }else{
		     System.out.println("The student with the age " + ages[i] + " cannot vote.");
		   }
		 }	  
  }
}