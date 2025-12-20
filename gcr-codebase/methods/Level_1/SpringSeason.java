import java.util.Scanner;
public class SpringSeason{
  // create method to check spring season
  public static void CheckSeason(int month,int day){
        if ((month == 3 && day >= 20&& day  <= 31) ||
            (month == 4 && day >= 1 && day <= 30) ||
            (month == 5 && day >= 1 && day <= 31) ||
            (month == 6 && day >= 1 && day <= 20)){
		   System.out.println("Its a Spring Season.");
	   }else{
		   System.out.println("Not a Spring Season.");
	   }
  }

  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for day and month
      System.out.println("Enter month:");
	  int month = sc.nextInt();
	  System.out.println("Enter day:");
	  int day = sc.nextInt();
	  
	  // print result
	  CheckSeason(month,day);
	  
  }
}