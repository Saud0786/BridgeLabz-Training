public class EmployeeBonusCalculator {

    // Method to generate salary and years of service
    public static double[][] generateEmployeeData(int employees) {

        double[][] data = new double[employees][2];

        for (int i = 0; i < employees; i++) {
			// Salary
            data[i][0] = (int) (Math.random() * 90000) + 10000;

            // Years of service
            data[i][1] = (int) (Math.random() * 10) + 1;
        }

        return data;
    }

    // Method to calculate bonus and new salary [oldSalary, years, bonus, newSalary]
    public static double[][] calculateBonus(double[][] data) {

        double[][] result = new double[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double salary = data[i][0];
            int years = (int) data[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double newSalary = salary + bonus;

            result[i][0] = salary;
            result[i][1] = years;
            result[i][2] = bonus;
            result[i][3] = newSalary;
        }

        return result;
    }

    // Method to calculate totals and display result
    public static void displaySummary(double[][] result) {

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.println("\nEmployee Bonus Report (Zara)");
        System.out.println("Emp\tOldSalary\tYears\tBonus\t\tNewSalary");

        for (int i = 0; i < result.length; i++) {

            totalOldSalary += result[i][0];
            totalBonus += result[i][2];
            totalNewSalary += result[i][3];

            System.out.printf(
                "%d\t%.0f\t\t%.0f\t%.2f\t\t%.2f%n",
                (i + 1),
                result[i][0],
                result[i][1],
                result[i][2],
                result[i][3]
            );
        }

        System.out.printf("TOTAL\t%.0f\t\t\t%.2f\t%.2f",
                totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {

        int employees = 10;

        double[][] employeeData = generateEmployeeData(employees);
        double[][] bonusResult = calculateBonus(employeeData);

        displaySummary(bonusResult);
    }
}
