import java.util.*;

public class Shopkeeper{
	    // Constants for discount rates
        static final double DISCOUNT_20 = 0.20;
        static final double DISCOUNT_10 = 0.10;
        static final double DISCOUNT_5  = 0.05;
	
   public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	   
        double totalBill = 0.0;

        // Input number of items
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        // Input item prices using for-loop
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = sc.nextDouble();
            totalBill += price;
        }

        double discount = 0.0;

        // Discount logic
        if (totalBill >= 5000) {
            discount = totalBill * DISCOUNT_20;
        } else if (totalBill >= 3000) {
            discount = totalBill * DISCOUNT_10;
        } else if (totalBill >= 1000) {
            discount = totalBill * DISCOUNT_5;
        } else {
            discount = 0.0;
        }

        double finalAmount = totalBill - discount;

        // Display result
        System.out.println("\nTotal Bill: " + totalBill);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount to Pay: " + finalAmount);
  }

} 
