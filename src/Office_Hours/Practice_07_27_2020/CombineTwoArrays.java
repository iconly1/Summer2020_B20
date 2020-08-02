package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {
        char[] a1 = {'A','B','C'};
        char[] a2 = {'D','E','F'};

        char [] a3 = new char[a1.length+a2.length];
        int count = 0;
        for (char ele:a1) {
            a3[count] = ele;
            count++;
        }
        for (char ele:a2) {
          a3[count] = ele;
          count++;
        }
        System.out.println(Arrays.toString(a3));

    }
}
