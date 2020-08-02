package Office_Hours.Practice_07_21_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Desc2 {
    public static void main(String[] args) {
        int[]arr = {98,97,100,200,55,68,111,2151,151,151,222,35,4,8,4,997,4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int [] descArr = new int[arr.length];
        int k= arr.length-1;
        for (int each:arr ) {
                 descArr[k] = each;
                 k--;
        }
        System.out.println(Arrays.toString(descArr));
    }
}
