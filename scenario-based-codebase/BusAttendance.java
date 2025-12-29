import java.util.*;

public class BusAttendance{
  public static void main(String []args){
      Scanner sc = new Scanner(System.in);
	  String names[] = {"Rahul","Aman","Naman","Akash","Ashif","Saud","Karan","Atif","Samshad","Shatyam"};
      int countP=0;
      int countA=0;
      // Ask for attendance
	  for(int i=0;i<names.length;i++){
        System.out.println("Is "+names[i]+" Present or Absent?");
        String s = sc.next();
		s=s.toLowerCase();
        if(s.equals("present") || s.equals("yes")){
			countP++;
		}else{
			countA++;
		}   	    
	  }
	  
	  // Print present and absent count
	  System.out.println("Total Present Students: " + countP + "\nTotal Absent Students: "+countA);
  }
}