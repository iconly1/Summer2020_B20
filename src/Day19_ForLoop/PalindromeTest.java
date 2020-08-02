package Day19_ForLoop;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = scan.nextLine();
        String reversedstr = "";
      /*  for (int i = str.length()-1; i>=0; i--){
            reversedstr += str.charAt(i);
        }
        System.out.println(reversedstr);
        System.out.println(str.equals(reversedstr));

       */

        for(int i = str.length()-1; i >= 0; i-- ){
            reversedstr += str.charAt(i);
            reversedstr += str.substring(i, i+1);

        }

        System.out.println(reversedstr);

        System.out.println( str.equalsIgnoreCase(reversedstr) );









    }
}
