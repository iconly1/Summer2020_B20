package Day23_Arrays;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while (true) {


            Scanner input = new Scanner(System.in);
            System.out.println("Enter two numbers");
            double num1 = input.nextInt();
            double num2 = input.nextInt();
            System.out.println("Enter math operator");
            char o = input.next().charAt(0);
/*
            double result = (o == '+') ? num1 + num2 : (o == '-') ? num1 - num2 : (o == '*') ? num1 * num2
                    : (o=='/') ? num1 / num2 : (o == '%') ? num1 % num2 : 0;


 */
            switch (o){
                case '+':
                    System.out.println(num1+num2);
                    break;
                case '-':
                    System.out.println(num1-num2);
                    break;
                case '*':
                    System.out.println(num1*num2);
                    break;
                case '/':
                    System.out.println(num1/num2);
                    break;
                case '%':
                    System.out.println(num1%num2);
                    break;
                default:
                    System.out.println("Invalid operator");
            }
           // System.out.println(result);
            System.out.println("Do you want to continue?");
            String a = input.next().toLowerCase();
            while (!(a.equals("yes") || a.equals("no"))){
                //changed from if to while because it only asked once with improper answer
                //nested loop was needed.
                System.out.println("Invalid answer please enter yes or no");
                System.out.println("Do you want to continue?");
                a = input.next().toLowerCase();
            }
            if (a.equals("no")){
                break;
            }

        }

        System.out.println("Thank you for using calculator");
        System.exit(0);
    }
}
