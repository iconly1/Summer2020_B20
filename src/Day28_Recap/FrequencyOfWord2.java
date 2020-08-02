package Day28_Recap;

import java.util.Scanner;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String str = "catcatcatdogdogdog";
        int count = 0;

        for (int i = 0; i<=str.length()-3;i++){
          // String s = str.substring(i,i+3); or just use it in if
           if (str.substring(i,i+3).equalsIgnoreCase("cat")){
               count++;
           }

        }
        System.out.println(count);
        System.out.println("===============================");
        Scanner scan = new Scanner(System.in);
        String str2 = scan.nextLine(); //"catcatcatdogdogdog";
        String word = scan.nextLine();
        int count2 = 0;

        for (int i = 0; i<=str2.length()-word.length();i++){
            // String s = str2.substring(i,i+3); or just use it in if
            if (str.substring(i,i+word.length()).equalsIgnoreCase("cat")){
                count++;
            }

        }
        System.out.println(count2);

    }
}
