package Day30_CustomMethods;

import java.util.Arrays;

public class ReturnMethods3 {
    public static void max(int [] arr){//just printable
        Arrays.sort(arr);
        int max = arr.length-1;
    }
    public static int max2(int [] arr){ //usable
        Arrays.sort(arr);
        int max = arr.length-1;
        return max;
    }
}
