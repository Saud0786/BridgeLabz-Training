import java.util.Scanner;
public class GradeCalculation{
  public static void main(String args[]){  
	  // Create Scanner object
	  Scanner sc = new Scanner(System.in);
	  
	  // Take marks input for three subjects
	  System.out.println("Enter Physics marks : ");
	  int physics = sc.nextInt();  
	  System.out.println("Enter Chemistry marks : ");
	  int chemistry = sc.nextInt();
	  System.out.println("Enter Maths marks : ");
	  int maths = sc.nextInt();
	  
	  // calculate total and percentage
	  int total = physics + chemistry + maths;
	  double percentage = total / 3.0;
	  
	  // print average percentage
	  System.out.println("Average Percentage is :" + percentage);
	  
	  // check grade and remarks
	   if(percentage >= 80){
		   System.out.println("Grade : A");
		    System.out.println("Remarks : Level 4, above agency-normalized standards");
	   } else if(percentage >= 70){
		   System.out.println("Grade : B");
		   System.out.println("Remarks : Level 3, at agency-normalized standards");
	   }else if(percentage >= 60){
		  System.out.println("Grade : C");
		  System.out.println("Remarks : Level 2, below but approaching agency-normalized standards");
	  } else if(percentage >= 50){
		  System.out.println("Grade : D");
		  System.out.println("Remarks : Level 1, well below agency-normalized standards");
	  } else if(percentage >= 40){
		  System.out.println("Grade : E");
		  System.out.println("Remarks : Level 1, too below agency-normalized standards");
	  }else{
		  System.out.println("Grade : R");
		  System.out.println("Remarks : Remedial standards");
	   }
  }
}
