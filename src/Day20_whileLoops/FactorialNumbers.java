package Day20_whileLoops;
/*
  4. Write a program that can return the factorial number of any given number
        Ex:
            input: 5
            output: 120
            because: 5! = 5 * 4 * 3 * 2* 1 = 120
 */
import java.util.Scanner;

public class FactorialNumbers {
    public static void main(String[] args) {
        double result = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number for factorial number");
        for (double i = scan.nextDouble(); i >=1; i -= 1 ){
            result *= i;
        }
        System.out.println("Your Factorial number is : "+result);












    }
}
