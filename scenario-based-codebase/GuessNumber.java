import java.util.*;

public class GuessNumber{
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  // generate random number
	  int genrate =(int) (Math.random()*100);
	  int count=5;
	  do{
		 System.out.println("Guess number between 1 to 100");
		 int num = sc.nextInt(); 
		 if(genrate>num){
			System.out.println("To Low"); 
			count--;
			System.out.println(count+" attempt left.");		
		 }else if(genrate<num){
			 System.out.println("To High");
			 count--;
			 System.out.println(count+" attempt left.");
		 }else{
			 System.out.println("Congratulation! You won the game."); 
			 break;
		 } 
	  }while(count!=0);
	  System.out.println("Sorry, The number was "+generate);
	  
 }	  
}