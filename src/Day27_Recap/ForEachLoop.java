package Day27_Recap;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        for (int i = 0; i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");


        }
        System.out.println();
        System.out.println("=======================================");
        for (int each:arr) {
            System.out.print(each+" ");

        }
        System.out.println();
       for (int i = arr.length-1; i>=0;i--){//reverse
           System.out.print(arr[i] + " ");
       }
        System.out.println();
        System.out.println("===================================");
        int [] scores = {10,20,30,40,50,60,70,80,90,100,110};
        for (int each : scores){
            if (each % 3 == 0){
                continue;
            }
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("======================================");
        String [] names = {"AB","A","ABC","AB","ABCD"};
        for (String each : names){
            if (!each.contains("C")){
                continue;
            }
            System.out.println(each);
        }
        System.out.println();
        System.out.println("============================================");

        int [] score = {80,75,65,110,90,45,56,78};

        int max = score [0];
        int min = score [0];
        for (int each : score) {
            if (each>max){
                max = each;
            }
            if (each<min){
                min = each;
            }

        }
        System.out.println("max number is: "+max);
        System.out.println("Min number is: "+min);
    }
}
