package Day34_Wrapperclass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WrapperClass_Practice {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        Integer [] arr2 = {1,2,3,4};
        for (Integer element:arr2){
            System.out.println(element);
        }
        Double []arr4 = {1.0,2.0,3.0,4.0,5.0,6.0,7.0};
        for (double each:arr4) {
            System.out.println(arr4);
        }
        char [] arr5 = {65,67,68,69};
        char ch = 79;
        Character ch2 = 79;
        System.out.println(ch2);
        String [] num1 = {"12.5","13.5","14.5","15.5"};
        double [] num2 = new double[num1.length];
        for (int i = 0; i<=num1.length-1; i++){
            num2 [i] = Double.parseDouble(num1[i]);
        }
        System.out.println(Arrays.toString(num2));

    }
}
