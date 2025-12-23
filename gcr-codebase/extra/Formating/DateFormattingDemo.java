import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormattingDemo {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        // Different date format patterns
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Current Date in Different Formats:\n");

        System.out.println("dd/MM/yyyy        : " + currentDate.format(format1));
        System.out.println("yyyy-MM-dd        : " + currentDate.format(format2));
        System.out.println("EEE, MMM dd, yyyy : " + currentDate.format(format3));
    }
}
