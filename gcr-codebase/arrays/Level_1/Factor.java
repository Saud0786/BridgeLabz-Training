import java.util.Scanner;
public class Factor{
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      // take number input
	  System.out.println("Eneter a numbers: ");
	  int number = sc.nextInt();
	  int factors[] = new int[10];
	  
	  // generate multiplication
	  int Index=0;
	  for(int i=1;i<=number;i++){
	     if(number%i==0){
			factors[Index++] = i; 
		 }
	  }
	  
	  // Print Factor of number
	  System.out.println("Print Factor of number: ");
	  for(int i=0;i<10;i++){
		  if(factors[i]==0)continue;
		  System.out.println(factors[i]);
	  }
  }
}