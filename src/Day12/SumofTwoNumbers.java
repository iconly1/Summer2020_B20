package Day12;

import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("####Enter Your Number####");
        int a = scan.nextInt();
        System.out.println("####Enter Your Second Number####");
        int b= scan.nextInt();
        int result = a+b;
        System.out.println("Sum of two numbers are: "+result);

    }
}
