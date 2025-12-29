import java.util.*;

public class SmartParking{
	
	// class variable for proper update
    static int currOccupied=0;
	static int parkingCapacity=10;
	
  // Method for parking track	
  public static void parking(){
	  
	  if(parkingCapacity>currOccupied){
		   System.out.println("Parking successful.");
		   currOccupied++;
	  }
	  return;
	  
  } 
  
   // Method for check Occupancy
   public static void showOccupancy(){
	  
	  if(parkingCapacity==currOccupied){
		   System.err.println("Parking Full.");
	  }else{
		   System.out.println("Paking slot "+(parkingCapacity-currOccupied)+" is available.");
	  }
	  return;
	  
  } 
	
  public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
	 
	 while(true){
	    System.out.println("Enter your choise:");
		System.out.println("1. Parking \n2.Show Occupancy \n3.Exit ");
		int parkingCapacity = 5;
		int currOccupied = 0;
		
		// Take user input
		int n = sc.nextInt();
		
		switch(n){
			case 1: parking();
			        break;
			case 2: showOccupancy();
                    break;
            case 3: System.out.println("Please lock your vehicle. \nExit....");
			       return;					
		}
	 } 
	 
  
  }
}