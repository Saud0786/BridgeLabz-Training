import java.util.Scanner;

public class BMI {
  public static void main(String[] args) {
     // Scanner object
     Scanner sc = new Scanner(System.in);

     // Take user height and weight
     System.out.println("Enter your height(in meter):");
     int height = sc.nextInt();
     System.out.println("Enter your weight:");
     int weight = sc.nextInt();

     // Calculation BMI
     double BMI = weight / (height*height);
     System.out.println("BMI :"+ BMI);
     if(BMI <= 18.4){
       System.out.println("Underweight");
     }else if(BMI >= 18.5 && BMI <= 24.9 ){
       System.out.println("Normal");
     }else{
       System.out.println("Overweight");
     }
  }
}
