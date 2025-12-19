import java.util.Scanner;
public class TallestYoungest{
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
	  //  Get input value for
	  int ages[] = new int[3];
	  int height[] = new int[3];
	  
      
	  for(int i=0;i<3;i++){
	    System.out.println("Enter Ages of "+ (i+1) + " friends:");
	    ages[i]=sc.nextInt();
		System.out.println("Enter Height of "+ (i+1) + " friends:");
		height[i]=sc.nextInt();
	  }
	  
	  int youngestFriend = Integer.MAX_VALUE;
	  int indexYoungest = 0;
	  int tallestFriend = 0;
	  int indexTallest =0;
	  
	  for(int i=0;i<3;i++){
	     if(ages[i]<youngestFriend){
		    youngestFriend=ages[i];
			indexYoungest=i;
		 }
		 if(height[i]>tallestFriend){
		   tallestFriend = height[i];
		   indexTallest = i;
		 }
	  }
	  
	  // set youngestFriend
	  String youngest="";
	  if(indexYoungest==1){
	     youngest = "Amar";
	  }else if(indexYoungest==2){
	     youngest = "Akbar";
	  }else{
	     youngest = "Anthony"; 
	  }
	  
	  // set tallestFriend
	   String tallest="";
	  if(indexTallest==1){
	      tallest = "Amar";
	  }else if(indexTallest==2){
	      tallest = "Akbar";
	  }else{
	      tallest = "Anthony";
	  }
	  
	  
	  // print youngest and tallest
	  
	  System.out.println("Youngest Friend is "+ youngest + " and ages "+youngestFriend);
	  System.out.println("Tallest Friend is "+ tallest +" and height "+ tallestFriend);
	  
  }
}