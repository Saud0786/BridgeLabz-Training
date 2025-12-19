import java.util.Scanner;
public class MatrixCopy{
  public static void main(String args[]){
	  // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
      // take rows and columns input
	  System.out.println("Enter a rows: ");
	  int rows = sc.nextInt();
	  System.out.println("Enter a columns: ");
	  int columns = sc.nextInt();
	  int maxtrix[][] = new int[rows][columns];
	  
	  // 1D array for copy 2D array elements
	  int array[] = new int[rows*columns];
	  
	  // input for 2D array
	  System.out.println("Enter a matrix elements: ");
	  for(int row=0;row<rows;row++){
	     for(int col=0;col<columns;col++){
	       maxtrix[row][col] = sc.nextInt();
	    }
	  }
	  
	  // copy elements 2D into 1D
	  int index=0;
	  for(int row=0;row<rows;row++){
	     for(int col=0;col<columns;col++){
	      array[index++] = maxtrix[row][col];
	    }
	  }
	  
	  // print copy elements
	  System.out.println("Print copy elements:");
	  for(int i=0;i<array.length;i++){
	    System.out.println(array[i]);
	  }
  }
}