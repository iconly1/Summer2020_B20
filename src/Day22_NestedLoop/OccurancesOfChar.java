package Day22_NestedLoop;

import java.util.Scanner;

/*
  2. Write a program that can asks user to enter one string and one char and then returns the frequency of str2 in str1
            Ex
                 Input: AABAAC
                        A
                 Output: 4
                Input: ABCC
                       C
                Output: 2

 */
public class OccurancesOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string");
        String str = scan.nextLine();
        System.out.println("what character");
        char ch = scan.next().charAt(0);
        int count = 0;
       /* for (int i = 0; i <= str.length() - 1; i++){
            char each = str.charAt(i); // ababc
            if (each == ch){// if true, means ch is occured in str
                count += 1;
            }
        }

        */
        int index = 0;
        while (index<= str.length()-1){
            char each = str.charAt(index); // ababc
            if (each == ch){// if true, means ch is occured in str
                count += 1;
            }
            index++;
        }
        System.out.println(count);


    }
}
