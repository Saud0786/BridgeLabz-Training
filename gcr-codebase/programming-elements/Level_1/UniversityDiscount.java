public class UniversityDiscount{
   public static void main(String args[]){
      
      double fee = 125000;
      double discountPercentage = 5;
 
      // calculate discount  
      double discount = (fee*0.05);

      // Discounted fee
       double discountedFee = fee - discount;

      System.out.println("The discount amount is INR "+ discount + " and final discounted fee is INR "+discountedFee);
      
  }
}
