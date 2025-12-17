import java.util.Scanner;
public class Add
{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter first num: " ); 
     int num1 = sc.nextInt(); 
     System.out.println("Enter Second num: " ); 
     int num2 = sc.nextInt(); 
     int sum = num1+num2;
     System.out.println("Sum of two num: "+ sum ); 
  }

}
