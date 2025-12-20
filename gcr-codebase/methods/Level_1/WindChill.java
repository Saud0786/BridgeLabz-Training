import java.util.Scanner;
public class WindChill{
  // create windChill calculation
  public static double calculateWindChill(double temp, double windSpeed){
    return 35.74 + 0.6215  *temp + (0.4275*temp - 35.75) * Math.pow(windSpeed,0.16);
  
  }


  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value for windSpeed, temp
      System.out.println("Enter temp: ");
	  double temp = sc.nextDouble();
	  System.out.println("Enter windSpeed: ");
	  double windSpeed = sc.nextDouble();
	  
	  // calling method for windChill output
	  double windChill = calculateWindChill(temp,windSpeed);
	  System.out.println("WindChill: "+windChill);
  }
}