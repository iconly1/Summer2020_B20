package Day16_String;
import java.util.Scanner;//67
/*
   1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

 */
public class Substring_Practice {
    public static void main(String[] args) {
        String str3 = "I like to drink Pepsi";
        String drink = str3.substring(16);
        System.out.println(drink);

        String action = str3.substring(10, 14);
        System.out.println(action);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word:");
        String str1 = scan.nextLine();

        System.out.println("Enter your second word:");
        String str2 = scan.nextLine();

        //String result = str1.substring(1).concat(str2.substring(1));
        String result = str1.substring(1)+str2.substring(1);
        System.out.println(result);






    }
}
