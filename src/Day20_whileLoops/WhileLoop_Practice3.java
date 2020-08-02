package Day20_whileLoops;

import java.util.Scanner;

public class WhileLoop_Practice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  password = "Cybertek123";

        System.out.println("Enter Password");
        String input = scan.nextLine();
        while (!input.equals(password)){
            System.out.println("Please re-enter your password");
            input= scan.nextLine();
            input+=2;
        }
        System.out.println("Logged in");




    }
}
