package Office_Hours.Practice_07_01_2020;

import java.util.Scanner;

/*
1. Ask user to enter two words. Then add them together and print. But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight

 */
public class CombineTwoStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st word");
        String str1= scan.nextLine();
        //            012
        System.out.println("Enter 2nd word");

        String str2= scan.nextLine();
        /*first approach
        char ch1 = str1.charAt(str1.length()-1);
        char ch2 = str2.charAt(0);
        if (ch1==ch2){
            System.out.println(str1+str2.substring(1));//we are excluding the first charecter of the second string

        }else{
            System.out.println(str1+str2);
        }*/
       /* // second approach
        String s1 = str1.substring(str1.length()-1);
        //substring(2,3) ==>e
        String s2 = str2.substring(0,1);
        //if we dont do it like this and put just 0 it will print till the end
        // have to give a stopping point.
        if (s1.equals(s2)){
            System.out.println(str1+str2.substring(1));
            //                            ^ prints from second charecter to the end

        }else{
            System.out.println(str1+str2);
        }
*/
        // third:
        String t1 ="" + str1.charAt( str1.length() -1 ); // last char from str1
        String t2= "" +  str2.charAt(0); //first char from str2

        if( t1.equals(t2)  ){
            System.out.println(str1 + str2.substring(1));  // excluding the first character of the second string
        }else{
            System.out.println(str1 +str2);
        }

    }
}
