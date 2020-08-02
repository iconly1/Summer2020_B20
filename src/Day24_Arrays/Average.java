package Day24_Arrays;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9,10};
                 // 0,1,2,3,4,5,6,7,8,9
        int sum = 0;
        for (int i = arr.length-1; i>=0; i --){
            sum += arr[i];
        }                        // explicit casted to double to get decimal.
        double average = sum / (double)arr.length;
        System.out.println("Average number: "+average);

    }
}
