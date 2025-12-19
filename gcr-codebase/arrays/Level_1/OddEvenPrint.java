import java.util.Scanner;
public class OddEvenPrint{
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      // take number input
	  System.out.println("Eneter a numbers: ");
	  int number = sc.nextInt();
	  int size = (number/2);
	  int odd[] = new int[size];
	  int even[] = new int[size];
	  
	  
	  // generate multiplication
	  int oddIndex=0;
	  int evenIndex=0;
	  for(int i=1;i<=number;i++){
	     if(i%2==0){
			even[evenIndex++] = i; 
		 }else{
			odd[oddIndex++] = i; 
		 }
	  }
	  
	  // Print even and odd list
	  System.out.println("Print even list: ");
	  for(int i=0;i<size;i++){
		  System.out.println(odd[i]);
	  }
	  System.out.println("Print even list: ");
	  for(int i=0;i<size;i++){
		  System.out.println(even[i]);
	  }
  }
}