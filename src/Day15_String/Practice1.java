package Day15_String;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your frirst name: ");
        String firstName = input.next();
        char ch1 = firstName.charAt(0);


        System.out.println("Enter your last name: ");
        String lastName = input.next();
        char ch2 = lastName.charAt(0);

        System.out.println("Your initals are: " + ch1 +"."+ch2+".");
        System.out.println("=====================================================");

        //Length
        int l = firstName.length();
        System.out.println(l);


    }
}
