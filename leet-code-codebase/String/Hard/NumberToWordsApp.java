import java.util.Scanner;

public class NumberToWordsApp {

    static String[] belowTen = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };
    static String[] belowTwenty = {
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
        "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    static String[] belowHundred = {
        "", "Ten", "Twenty", "Thirty", "Forty",
        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String numberToWords(int n) {
        if (n == 0) {
            return "Zero";
        }
        if (n < 10) {
            return belowTen[n];
        }
        if (n < 20) {
            return belowTwenty[n - 10];
        }
        if (n < 100) {
            return belowHundred[n / 10] +
                   (n % 10 != 0 ? " " + belowTen[n % 10] : "");
        }
        if (n < 1000) {
            return belowTen[n / 100] + " Hundred" +
                   (n % 100 != 0 ? " " + numberToWords(n % 100) : "");
        }
        if (n < 1_000_000) {
            return numberToWords(n / 1000) + " Thousand" +
                   (n % 1000 != 0 ? " " + numberToWords(n % 1000) : "");
        }
        if (n < 1_000_000_000) {
            return numberToWords(n / 1_000_000) + " Million" +
                   (n % 1_000_000 != 0 ? " " + numberToWords(n % 1_000_000) : "");
        }
        return numberToWords(n / 1_000_000_000) + " Billion" +
               (n % 1_000_000_000 != 0 ? " " + numberToWords(n % 1_000_000_000) : "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(numberToWords(n));

        sc.close();
    }
}
