public class ProfitLoss{
   public static void main(String args[]){
        
       double costPrice = 129;
       
       double sellingPrice = 191;
     
       // calculate profit in INR
         double profit = sellingPrice - costPrice;
      
       // calculate profit Percentage
          double profitPercentage = (profit/costPrice)*100;

       System.out.println("The Cost Price is INR "+ costPrice + " and Selling Price is INR " + sellingPrice + "\n" + "The Profit is INR "+ profit + " and the Profit Percentage is "+ profitPercentage);
  }
}