package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class CombineTwoArray3 {
    public static void main(String[] args) {
        String [] a1 = {"The","dog","loves"};
        String [] a2 = {"to","play","in","the park"};

        String [] a3 = new String[a1.length+a2.length];


        for (int i = 0; i<=a1.length-1; i++){
            a3[i] = a1[i];
        }
        for (int j = 0; j<=a2.length-1; j++){
            a3[j+a1.length] = a2[j];
        }
        System.out.println(Arrays.toString(a3));
    }
}
