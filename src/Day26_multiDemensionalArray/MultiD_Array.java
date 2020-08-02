package Day26_multiDemensionalArray;

import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {
        char [] ch1 = {'a','b'};
        char [] ch2 = {'c','d','e'};
        char [] ch3 = {'f','g','h'};

        char [][] ch2d = {{'a','b'},{'c','d','e'},{'f','g','h'} };
                        //   ^0          ^1             ^2
        System.out.println(ch2d[1][0]+" "+ch2d[2][1]);
        System.out.println("================================");

        int [][] nums = {{1,2,3},{4},{5,6},{7,8,9,10}};
                        // ^0     ^1   ^2     ^3
        for (int i = 0; i<=nums.length-1; i++ ) {

            System.out.println(Arrays.toString(nums[i]));

        }


    }
}
