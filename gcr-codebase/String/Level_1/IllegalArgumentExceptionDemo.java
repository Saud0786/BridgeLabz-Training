import java.util.Scanner;
import java.lang.Thread;
public class IllegalArgumentExceptionDemo {

    // Method to generate Runtime Exception
    public static void generateException() {
		
        // implementing Runnable interface
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                try {
                    // Try to make the thread sleep for -10
                    Thread.sleep(-10);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(
                    "Welcome To GeeksforGeeks!");
            }
        });
        t1.setName("Test Thread");
        t1.start();
    }

    // Method to handle IllegalArgumentException
    public static void handleException() {
		
        // Create thread using Runnable
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                try {
                    // Try to make the thread sleep for 10
                    Thread.sleep(10);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("IllegalArgumentException handled");
            }
        });
        t1.setName("Test Thread");
        t1.start();
    }

    public static void main(String[] args) {
        
        System.out.println("Generate Exception:");		
        generateException();
		try{
		Thread.sleep(2000);
		} catch (Exception e){
		
		}
		System.out.println("Handle Exception:");	
		handleException();
		
    }
}
