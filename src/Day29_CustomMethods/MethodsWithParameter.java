package Day29_CustomMethods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsWithParameter {
    public static void main(String[] args) {
        printHello(10);
        System.out.println("==============");
        yourAge(1956,1920);
    }
    public static void printHello(int numberOfTimes){
        for (int i = 0; i<numberOfTimes; i++){
            System.out.println("Hello World");
        }
    }
    public static void yourAge(int birthYear , int currentYear){
        if (currentYear<birthYear){
            System.out.println("Invalid");
        }else {
            int age = currentYear - birthYear;
            System.out.println("you are " + age + " years old");
        }
    }
}
