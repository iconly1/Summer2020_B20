package Day21_loops;

import java.util.Scanner;
/*
 2. write a program that asks user to enter 5 numbers and returns the minimum number

 */
public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 999999999;
        for (int i = 1; i <= 5; i ++){
            System.out.println("Enter a number");
            int num = scan.nextInt();//example 50,10,5,4,3
            if(num < min){
                //if the next user number is lower than the previous one it will be assigned to the min.
                min = num;
            }
        }
        System.out.print("The minimum number is: "+min);
    }
}


