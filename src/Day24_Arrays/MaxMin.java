package Day24_Arrays;

import java.util.Scanner;

/*
2. write a program that asks user how many numbers he wants to enter, and get all the user inputs and store them into an array variable, and then write the program that can return maximum and minimum numbers

 */
public class MaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int n = scan.nextInt();
        int [] arr = new int[n];//[1,2,3,4,5]
        for (int i = 0; i < n; i++ ) {
            System.out.println("Enter number :");

            int num = scan.nextInt();
            arr[i] = num;// or to make it shorter you can just do arr[i].scan.nextInt();
            // i: 0,1,2,3,4

        }
        int max = arr[0];
        int min = arr[0];
    for (int i = 0; i <= arr.length-1; i++){
            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("Your maximum number is: "+max);
        System.out.println("Your minimum number is: "+min);
    }




}
