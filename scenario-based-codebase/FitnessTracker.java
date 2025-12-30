import java.util.*;

public class FitnessTracker{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in); 
  
     System.out.println("--------Fitness Challenge Tracker----------");
	 
	 
	// Push-ups done each day
	// Zero for rest day
       int[] pushUps = new int[7];

       int total = 0;
       int activeDays = 0;
	   
	// Take user input
	   for(int i=0;i<7;i++){
		   System.out.println("Enter your day "+(i+1) +" push-ups count:");
		   pushUps[i] = sc.nextInt();
	   }
	   
       for (int count : pushUps) {

          // Skip rest days
          if (count == 0) {
              continue;
          }

          total += count;
          activeDays++;
        }

        double average = (activeDays > 0) ? (double) total / activeDays : 0;

        System.out.println("Total push-ups in the week: " + total);
        System.out.println("Average push-ups per active day: " + average);
	 
  }
}

