package Day16_String;

import java.util.Scanner;
/*
  3. write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than 3 characters, print the string itself
    4. Write a program  for CheckWords:
        Program accepts 3 words and :
            - if they are same length:      print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"

 */


public class Check_Words {
    public static void main(String[] args) {
        //task 3 rep 64 reference
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        // last index number is length -1
        //second last index number is length -2
        //third last index = length - 3
        if (str.length()==0){
            System.out.println("Empty string");

        }else if (str.length()>3){
            System.out.println(str.substring(str.length()-3));
                               // trying to create substring
        }else{
            System.out.println(str);
        }
        // TERNARY
        String result2 = (str.length()==0)?"empty string"
                :(str.length()>3)? str.substring(str.length()-3):str;
        System.out.println(result2);
        System.out.println("===================================================");
        // task 4
        String str1 = "abcd";
        String str2 = "ab";
        String str3 = "abc";
        boolean allSame =str1.length() == str2.length() && str1.length() == str3.length();
        boolean allDifferent = str1.length() != str2.length() && str2.length() != str3.length() && str1.length() != str3.length();
        if(allSame){
            System.out.println("All words are the same length");
        }else if(allDifferent){
            System.out.println("All different length");
        }else{
            System.out.println("Not Same nor Different lengths");
        }




    }
}
