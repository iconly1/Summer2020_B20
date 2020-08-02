package Day29_CustomMethods;

import Office_Hours.Practice_07_07_2020.StringReverse;

import java.util.Arrays;
import java.util.Scanner;

/*
1.  Write a program that can print out the unique values from a String Array
            Ex:
                if arr -> {"A", "A", "B", "C", "C"}
                output: B
                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C
            MUST use for each loop
 */
public class Uniques {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "B", "C", "D", "E", "F"};

        for( String a: arr){ // gets each of the element

            int count = 0;
            for( String each: arr ){ // gets the frequency of the element
                if( a.equals(each) ){
                    count++;
                }
            }

            if(count == 1){ // unique
                System.out.print(a+" ");
            }

        }








    }

}