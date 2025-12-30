import java.util.*;

public class TemperatureLogger{
  public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  
	  // Store temperature
      int temperatures[] = new int[7];
	  
	  System.out.println("--------Record temperatures over 7 days-------");
	  
	  int maxTemp=Integer.MIN_VALUE;
	  int totalSum = 0;
	  
	  // Take user input
	  for(int i=0;i<temperatures.length;i++){
	     System.out.println("Enter temperature day "+(i+1));
	     temperatures[i] = sc.nextInt();
		 
		 // sum
		 totalSum+=temperatures[i]; 
		 
		 // max logic
		 if(temperatures[i]>maxTemp){
		     maxTemp = temperatures[i];
		 }
	  }
	  
	  // Average Temperature
	  double avgTemp = totalSum/7;
	  
	  System.out.println("Average Temperature is "+avgTemp);
	  System.out.println("Max temperature is "+maxTemp);
  }
}