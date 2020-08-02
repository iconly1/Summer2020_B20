package Day16_String;

import java.util.Scanner;

public class FirstLastCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = scan.next();
        scan.close();
        char firstchar = word.charAt(0);
        char lastchar = word.charAt(word.length()-1);
        //System.out.println(firstchar==lastchar);
        if (firstchar==lastchar){
            System.out.println("True");

        }else{
            System.out.println("False");
        }


    }
}
