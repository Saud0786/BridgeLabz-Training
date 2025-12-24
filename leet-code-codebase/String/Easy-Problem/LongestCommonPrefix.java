import java.util.*;
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int n = strs.length;
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){
                break;
            }else{
                sb.append(first.charAt(i));
            }
        }
        return sb.toString();
    }
	
	public static void main(String args[]){
	   // Scanner object
	   Scanner sc = new Scanner(System.in);
	   
	   // Take input of String
	   System.out.println("Enter a size of array:");
	   int n = sc.nextInt();
	   String strs[] = new String[n];
	   for(int i=0;i<n;i++){
		   strs[i] = sc.next();
	   }
	   
	   // Print result
	   System.out.println("Longest Common Prefix: "+longestCommonPrefix(strs));
	   
	}
}