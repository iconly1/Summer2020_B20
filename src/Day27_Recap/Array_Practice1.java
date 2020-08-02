package Day27_Recap;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice1 {
    public static void main(String[] args) {
        String [] names = {"Alia","Nurbiye","Ayse"};
        System.out.println(names[1]);
        //System.out.println(names[25]);//nul out of bounds
        System.out.println("============================");
        for (int i = 0; i<=names.length-1;i++){
            //skip names without A
            //names[i].charAt(0)!='A'= is one way if statement
            if (!names[i].startsWith("A")){
                continue;
            }
            System.out.println(names[i]);
        }
       // System.out.println(Arrays.toString( inhabitants[]/[2]));
        System.out.println("==============================");
        int [] numbers = new int[5];
        System.out.println(numbers);
        numbers[3] = 25;//assigning
        numbers[0] = 100;
        int n = 0;



        Arrays.spliterator(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("===============================");
        Scanner scan = new Scanner(System.in);
        System.out.println("How many names do you want to enter?");
        String [] students = new String[scan.nextInt()];
        scan.nextLine();
       for (int i = 0; i<=students.length-1;i++){
           System.out.println("Enter a name");
           students[i] = scan.nextLine();
       }
        System.out.println(students[0]);
















    }
}
