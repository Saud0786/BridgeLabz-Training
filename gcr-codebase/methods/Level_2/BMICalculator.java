import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and populate 3rd column of array
    public static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];      
            double heightCm = data[i][1];   

            // Convert height from cm to meters
            double heightMeter = heightCm / 100;

            // BMI formula
            double bmi = weight / (heightMeter * heightMeter);

            data[i][2] = bmi; 
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {

            double bmi = data[i][2];

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
         // Create object of Scanner
        Scanner sc = new Scanner(System.in);

        // Array of weight, height(cm), BMI
        double[][] bmiData = new double[10][3];

        // Input weight and height
        for (int i = 0; i < bmiData.length; i++) {
            System.out.println("Enter details of Person " + (i + 1));

            System.out.print("Weight (kg): ");
            bmiData[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            bmiData[i][1] = sc.nextDouble();
        }

        // Calculate BMI And all result
        calculateBMI(bmiData);
        String[] bmiStatus = determineBMIStatus(bmiData);

        // Display Result
        System.out.println("Person\tWeight\tHeight\tBMI\t\tStatus");

        for (int i = 0; i < bmiData.length; i++) {
            System.out.printf(
                "%d\t%.1f\t%.1f\t%.2f\t%s%n",
                (i + 1),
                bmiData[i][0],
                bmiData[i][1],
                bmiData[i][2],
                bmiStatus[i]
            );
        }
    }
}
