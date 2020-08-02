package Day20_whileLoops;
import java.util.Scanner;
/*
3. write a program that can remove the duplicates from any given String
            Ex:
                input: abcabcaabb
                output: abc
 */

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter characters: ");
        String str = scan.nextLine();
        //            0123
        String result = "";//if input was abab would = "ab"
        for (int i = 0; i<=str.length()-1;i++){
           // String s = ""+str.charAt(i);// a,a,b,b
            String s = str.substring(i, i+1);
            if (!result.contains(s)){// if the character is already in result it will not(!) add it.
                result += s;
            }
        }
        System.out.println(result);











    }
}
