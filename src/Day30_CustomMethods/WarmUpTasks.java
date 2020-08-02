package Day30_CustomMethods;

import java.util.Arrays;

/*
wamrmup tasks:
    1. create a function that can print out the maximum number between two numbers
    2. create a function that can print out the array of integers in descending order
    3. create a function that can print out the combination of two integer arrays
    4.
        step1: create a function that can check if the given integer is positive, negative or zero
        step2: Use the above method to  write a program that can check every single elements of an array of Integers
        MUST use for each loop
 */
public class WarmUpTasks {
    public static void main(String[] args) {
        maxNum(8,8);
        int[] arr1D = {1,2,3,4,5,6,7,8,9,10};
        int [] arr2D = {11,12,13,14,15,16,17,18,19,20,21,22,23};
        printDesc(arr1D);
        combine2Arrays(arr1D,arr2D);
        PosNegZero(0);
        System.out.println("=====================================");
        for (int each:arr1D) {
            PosNegZero(each);
        }

    }
    //Task 01:
    public static void maxNum(int a ,int b){
   //
        if (a==b){
            System.out.println("Equal");
            return;
        }
        if (a>=b){
            System.out.println(a+" is maximum");
        }else{
            System.out.println(b+" is maximum");
        }
    }

    //Task 02:
    public static void printDesc(int[]arr){
        Arrays.sort(arr);
        for (int i=arr.length-1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //Task 03:{1,2,3} {4,5,6} ==>{1,2,3,4,5,6}
    public static void combine2Arrays(int [] arr1,int [] arr2){
        int [] arr3 = new int[arr1.length+arr2.length];
        int i = 0;
        for (int each:arr1){
            arr3[i]=each;
            i++;
        }
        for (int each:arr2){
            arr3[i]=each;
            i++;
        }
        System.out.println(Arrays.toString(arr3));
    }
    //Task 04:
    public static void PosNegZero(int num){
        if (num>0){
            System.out.println(num+" is positive");
        }else if (num<0){
            System.out.println(num+" is negative");
        }else{
            System.out.println(num+" is zero");
        }
    }














}
