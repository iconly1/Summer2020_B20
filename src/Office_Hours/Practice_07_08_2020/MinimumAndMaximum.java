package Office_Hours.Practice_07_08_2020;

import java.util.Scanner;

public class MinimumAndMaximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 99999999;
        int max = -99999999;
        for (int i = 0; i< 5; i ++){
            System.out.println("Enter a Number");
            int n = scan.nextInt();
            if (n<min){
                min = n;

            }
            if (n>max) {
                max = n;

            }



        }
        System.out.println(max+" is the maximum number");
        System.out.println(min+" is the minimum number");
    }
}
