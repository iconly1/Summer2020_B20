package Day19_ForLoop;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "Cyber";//"rebyC"
        System.out.println("Enter word");
        String str2 = scan.nextLine();
        //String result = ""+str.charAt(str.length()-1) + str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        String result = "";
       // for (int i = 4; i >= 0; i--){
         //   result += str.charAt(i);
        //}
        //System.out.println(result);

        for (int i = str2.length()-1; i >= 0; i--) {
            result += str2.charAt(i);
        }
        System.out.println(result);


    }
}
