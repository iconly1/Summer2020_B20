package Day21_loops;

import java.util.Scanner;
/*
  1. write a program that asks user to enter 5 numbers and retuns the maximum number

 */
public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int max = -2147483648;
        for (int i = 10; i <= 50; i +=10){
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if(num > max){
                //if the next user number is greater than the previous one it will be assigned to the max.
                max = num;
            }
        }
        System.out.println("The maximum number is: "+max);
    }
}
