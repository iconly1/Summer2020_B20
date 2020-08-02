package Office_Hours.Practice_07_08_2020;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 99999999;//2147483647
            // whatever user enters it will be less than this number
        for (int i = 0; i <5;i++ ){
            System.out.println("Enter a Number");
            int n = scan.nextInt();
            if (n<min){
                min = n;

            }
        }
        System.out.println(min+" is the minimum number");









    }
}
