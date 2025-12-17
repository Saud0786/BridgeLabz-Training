import java.util.Scanner;

public class TotalPurchasePrice {
   public static void main(String args[]) {

      // Creating variables to store unit price and quantity
      double unitPrice;
      int quantity;

      // Creating Scanner object to take input from user
      Scanner sc = new Scanner(System.in);

      // Taking unit price and quantity from user
      System.out.println("Enter unit price of the item: ");
      unitPrice = sc.nextDouble();
      System.out.println("Enter quantity to be bought: ");
      quantity = sc.nextInt();

      // Calculate total price
      double totalPrice = unitPrice * quantity;

      // Display the result
      System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
   }
}
