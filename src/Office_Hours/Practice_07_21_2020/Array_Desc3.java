package Office_Hours.Practice_07_21_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Desc3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int size = scan.nextInt();//ex. 5
        int [] arr = new int[size];
        for (int i = 0; i<=arr.length-1; i++){// or i < size or i<=size-1
            System.out.println("Enter number");
            arr[i]= scan.nextInt();

        }
        Arrays.sort(arr);
        int [] descArr = new int[arr.length];
        int k= arr.length-1;
        for (int each:arr ) {
            descArr[k] = each;
            k--;
        }

        System.out.println(Arrays.toString(descArr));
    }
}
