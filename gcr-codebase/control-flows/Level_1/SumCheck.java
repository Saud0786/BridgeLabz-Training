import java.util.Scanner;
public class SumCheck{
  public static void main(String args[]){
	    // Create a Scanner Object
         Scanner sc = new Scanner(System.in);

        // Take user input for number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check whether it is a natural number
        if (number <= 0) {
            System.out.println("Please enter a valid natural number.");
        } else {
            // Sum using while loop
            int sumWhile = 0;
            int i = 1;
            while (i <= number) {
                sumWhile += i;
                i++;
            }

            // Sum using formula
            int sumFormula = number*(number + 1)/2;
			
			if(sumWhile==sumFormula){
			   System.out.println("Both result is same :"+ sumFormula);
			}else{
			   System.out.println("Not same");
			}
			
		}	
  }
}