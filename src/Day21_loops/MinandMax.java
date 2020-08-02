package Day21_loops;

import java.util.Scanner;

public class MinandMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -99999999;
        int min = 99999999;
        for (int i = 1; i<=5; i++){
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
        }

        System.out.println("your maximum number is: "+max);
        System.out.println("Your minimum number is: "+min);
    }
}
