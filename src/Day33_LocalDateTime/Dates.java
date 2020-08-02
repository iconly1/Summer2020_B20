package Day33_LocalDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
        LocalDate DOB = LocalDate.of(1982,02,23);
        System.out.println(DOB);
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate y = LocalDate.of(1982,01,01);
        boolean result = y.isLeapYear();
        System.out.println(result);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year");
        int year = scan.nextInt();
        boolean result2 = LocalDate.of(year,01,01).isLeapYear();
        System.out.println(result2);
        System.out.println("========================");
        System.out.println("Enter birth year, birth month, birth day");
        LocalDate d = LocalDate.of(scan.nextInt(),scan.nextInt(),scan.nextInt());
        System.out.println(d);
        System.out.println(d.isLeapYear());

    }
}
