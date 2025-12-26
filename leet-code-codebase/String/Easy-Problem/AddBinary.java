import java.util.Scanner;

public class AddBinary {

    // static method to add two binary strings
    public static String addBinary(String a, String b) {
        int s1 = a.length() - 1;
        int s2 = b.length() - 1;
        int c = 0, base = 2;

        StringBuilder res = new StringBuilder();

        while (s1 >= 0 || s2 >= 0) {
            int t1 = 0, t2 = 0, sum;

            if (s1 >= 0)
                t1 = a.charAt(s1--) - '0';

            if (s2 >= 0)
                t2 = b.charAt(s2--) - '0';

            sum = t1 + t2 + c;

            if (sum >= base) {
                c = 1;
                sum = sum - base;
            } else {
                c = 0;
            }

            res.append(sum);
        }

        if (c == 1)
            res.append(c);

        return res.reverse().toString();
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first binary number: ");
        String a = sc.nextLine();

        System.out.print("Enter second binary number: ");
        String b = sc.nextLine();

        String result = addBinary(a, b);

        // Display result
        System.out.println("Binary Sum: " + result);
    }
}
