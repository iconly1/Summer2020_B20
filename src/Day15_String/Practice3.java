package Day15_String;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence = scan.nextLine();
        int lastIndexNum = sentence.length()-1;

        System.out.println(" "+ sentence.charAt(0) + lastIndexNum);


    }
}
