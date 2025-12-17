import java.util.Scanner;
public class HeightConvertion {

    public static void main(String[] args) {
        
       double height;


      // Creating Scanner object to take input from user
      Scanner sc = new Scanner(System.in);
       
      // taking input height
      System.out.println("Enter height: ");
      height = sc.nextDouble();
      double heightInFeet = height/30.48; 
      double heightInInches = height*2.54;

      // Display height in feet and inches
      System.out.println("Your Height in cm is "+height+ " while in feet is "+heightInFeet +" and inches is "+heightInInches);
      


    }
}