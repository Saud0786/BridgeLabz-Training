import java.util.Scanner;
public class Friends{
  public static void main(String args[]){
	  
	  // Create Scanner object
	  Scanner sc = new Scanner(System.in);
	  
	  // Take age and height of Amar
	  System.out.println("Enter age of Amar :");
	  int aAge = sc.nextInt();
	  System.out.println("Enter height of Amar :");
	  int aHeight = sc.nextInt();
	  System.out.println("Enter age of Akbar :");
	  int bAge = sc.nextInt();
	  System.out.println("Enter height of Akbar :");
	  int bHeight = sc.nextInt();
	  System.out.println("Enter age of Anthony :");
	  int cAge = sc.nextInt();
	  System.out.println("Enter height of Anthony :");
	  int cHeight = sc.nextInt();
	  
	  // find youngest friend
	  if(aAge < bAge && aAge < cAge){
		  System.out.println("Amar is youngest");
	  }else if(bAge < cAge){
		  System.out.println("Akbar is youngest");
	  }else{
		  System.out.println("Anthony is youngest");
	  }
	  
	  // find tallest friend
	  if(aHeight > bHeight && aHeight > cHeight){
		  System.out.println("Amar is tallest");
	  }else if(bHeight > cHeight){
		  System.out.println("Akbar is tallest");
	  }else{
		  System.out.println("Anthony is tallest");
	  }
  }
}
