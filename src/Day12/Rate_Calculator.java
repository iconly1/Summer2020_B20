package Day12;

/*
3. write a program for the rate calculator
            1. asks the user to enter the salary (as double)
            2. asks the user how many hours does he/she works in a week (as int)
            3. print the hourly rate of the employee
            assume that one year has 52 weeks
            hourRate = salary/ (weeklyHour * 52)

 */
import java.util.Scanner;
public class Rate_Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary = scan.nextDouble();
        System.out.println("How many hours do you work in a week");
        int hours = scan.nextInt();
        int totalhours= hours*52;
        double hourRate= salary / totalhours;
    }
}
