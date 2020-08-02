package Day15_String;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();
       String fullName = firstName.concat(" " .concat(lastName));
        System.out.println("your full name is " .concat(fullName));
        // lower case
        String name1 = "CYBERTEK SCHOOL";
        String nm1 = name1.toLowerCase();
        System.out.println(nm1);
        // toUpperCase
        String name2 = "ian";
        String nm2 = name2.toUpperCase();
        System.out.println(nm2);


    }
}
