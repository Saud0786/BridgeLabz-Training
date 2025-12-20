import java.util.Scanner;
public class StudentsHandshakes{
	
	// create method for handshakes calcualtion
	public static int handshakesCalculation(int numberOfStudents){
		return (numberOfStudents*(numberOfStudents-1))/2;
	}
	
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for 
      System.out.println("Enter numbers of Students: ");
	  int numberOfStudents = sc.nextInt();
	  
      // calling method for calcualtion handshakes
      int handshakes = handshakesCalculation(numberOfStudents);
      System.out.println("The number Of Students handshakes is "+handshakes);	  
  }
}