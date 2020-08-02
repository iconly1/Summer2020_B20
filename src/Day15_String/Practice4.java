package Day15_String;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next().toUpperCase();
        System.out.println("Enter your last name");
        String lastName= input.next().toUpperCase();
        String fullName = firstName + " "+ lastName;
        fullName = fullName.toUpperCase();
        System.out.println(fullName);
    }
}
