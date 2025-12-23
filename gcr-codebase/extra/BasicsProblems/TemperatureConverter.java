import java.util.Scanner;
public class TemperatureConverter{
   
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      //  Get input value 
      System.out.println("Enter Temperature in celsius:");
	  double tempC = sc.nextDouble();
	  System.out.println("Enter Temperature in fahrenheit:");
	  double tempF = sc.nextDouble();
	  
	  // Display result
	  System.out.println("Celsius To Fahrenheit: "+ celsiusToFahrenheit(tempC));
	  System.out.println("Fahrenheit To Celsius: "+ fahrenheitToCelsius(tempF));
  }
}