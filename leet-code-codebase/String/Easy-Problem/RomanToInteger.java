import java.util.*;
public class RomanToInteger {
	// Method for convert roman To Int
    public static int romanToInt(String s) {
	    s = s.toUpperCase(); 
        int n = s.length();
        int sum = 0;
        for(int i=0;i<n;i++){
            if((i+1)<n && getVal(s.charAt(i)) < getVal(s.charAt(i+1))){
                sum-= getVal(s.charAt(i));
            }else{
                sum+= getVal(s.charAt(i));
            }
        }
        return sum;
    }
	// Method for get character value
    public static int getVal(char ch){
         switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
         }
    }
	
	public static void main(String args[]){
	   // Scanner object
	   Scanner sc = new Scanner(System.in);
	   
	   // Take input of String
	   System.out.println("Enter a roman num:");
	   String s = sc.nextLine();
	   
	   // Print result
	   System.out.println("Roman To Integer: "+romanToInt(s));
	   
	}
}