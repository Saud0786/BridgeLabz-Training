import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println(names[names.length]); 
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {

        try {
            System.out.println(names[names.length]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled Successfull ArrayIndexOutOfBoundsException");
        } 
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];

        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        // First call: generate exception
		System.out.print("Generate Exception: ");
		try{
        generateException(names);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.print("Exception occured. ");
		}

        // handle exception
		System.out.print("Handled Exception: ");
        handleException(names);
    }
}
