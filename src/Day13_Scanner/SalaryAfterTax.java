package Day13_Scanner;
import java.util.Scanner;
public class SalaryAfterTax {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter your annual Salary:");
            int salary = input.nextInt();
        System.out.println("Enter your state tax rate:");
            double StateTaxRate = input.nextDouble();
            double stateTax = salary*StateTaxRate;

        System.out.println("Enter your federal tax rate:");
        double federalTaxRate= input.nextDouble();
        double federalTax= salary*federalTaxRate;

        double salaryAterTax=salary-stateTax-federalTax;
        System.out.println("Your salary: $ "+ salary);
        System.out.println("Your state tax : $ "+stateTax);
        System.out.println("Federal tax: $ "+federalTax);
        System.out.println("Your salary after tax: $ "+salaryAterTax);
    }
}
