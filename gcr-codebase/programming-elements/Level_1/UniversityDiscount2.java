import java.util.Scanner;
public class UniversityDiscount2{
   public static void main(String args[]){
      //Creating variables to store fee,discountPercentage
      double fee, discountPercentage;
      
      // Creating Scanner object to take input from user
      Scanner sc = new Scanner(System.in);

      // Taking user fee,discountPercentage
      System.out.println("Enter fee amount: ");
       fee = sc.nextDouble();
       discountPercentage = sc.nextDouble();
      
      // calculate discount  
      double discount = (fee*0.05);
      double discountedFee = fee - discount;

      System.out.println("The discount amount is INR "+ discount + " and final discounted fee is INR "+discountedFee);
      
  }
}