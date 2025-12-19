import java.util.Scanner;
public class MeanHeight{
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input Height array
	  double heights[] = new double[11];
	  System.out.println("Enter 11 players heights: ");
	  double sum=0.0;
	  for(int i=0;i<heights.length;i++){
		  heights[i] = sc.nextDouble();
	  }
	  
	  // generate multiplication
	  for(int i=0;i<heights.length;i++){
	     sum+=heights[i];
	  }
	  
	  // print mean of all players height
	  double mean = sum/11;
	  System.out.println("The mean height of the football team is "+ mean);
  }
}