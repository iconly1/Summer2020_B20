package Office_Hours.Practice_07_06_2020;

import java.util.Scanner;

/*
 2. write a program that can ask the user enter a number for five times and the returns the sum of those five numbers

 */
public class SumOfFiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i<=10; i += 1){//
            //                  ^iterator with the addition and 10 makes it ask 5 times
            System.out.println("Enter a number ");
            int num = scan.nextInt();
            sum += num;
        }
        System.out.println("The sum of numbers is: "+sum);




    }
}
