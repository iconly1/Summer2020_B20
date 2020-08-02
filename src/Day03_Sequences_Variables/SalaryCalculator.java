package Day03_Sequences_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        int salary = 100000;
                double tax = 0.28;
        double totaltax = salary * tax;
        double SalaryCalculator = salary - totaltax;
        System.out.println(SalaryCalculator);
    }
}
