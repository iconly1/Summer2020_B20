package Day33_LocalDateTime;

import java.util.Arrays;

/*
 Task01:
        1. create a method that can calculate the addition of two integers
        2. create a method that can calculate the addition of two decimals
        3. create a method that can calculate the multiplication of two integers
        4. create a method that can calculate the multiplication of two decimals

 */
public class Calculate {
    public static int addition(int a, int b){
return a+b;
    }
    public static double addition(double a, double b){
        return a+b;
    }
    public static double addition(double a,int b){
        return a+b;
    }
    public static int multiplication(int a,int b){
        return a*b;
    }
    public static double multiplication(double a,double b){
        return a*b;
    }

    public static void main(String[] args) {
        int a = 10;
        double b = 20;
        System.out.println(addition(a,b));
        float num1 = 10;
        float num2 = 9;
        System.out.println(addition((int)num1,(int)num2));
        System.out.println(addition(90,5.5));// goes to decimal
        System.out.println(addition(.5,2));
        int [] arr1 = {4,3,2,1};
        Arrays.sort(arr1);
        char [] arr2 = {'C','B','A'};
        Arrays.sort(arr2);
        long sum1 = 10;
        long sum2 = 200;
        System.out.println(multiplication(sum1,sum2));
        System.out.println(multiplication((int)sum1,(int)sum2));
    }
}

