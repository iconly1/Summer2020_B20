package Day21_loops;
/*
 3. write a program that can divide two numbers without using / & % operators and retuns the devision and remainder
            ex:
                input:  10
                        3
                0utput: 3 with a remainder of 1
 */

public class DivideTwoNumbers {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        if (b==0){
            System.out.println("Invalid input");
            System.exit(0);//forcefully terminate program
        }
        int count = 0;
        while (a>=b){
            a -= b;
            count++; // the iterator counts how many times it was subtracted

        }

        System.out.println(count+" with a remander of "+a);

    }
}
