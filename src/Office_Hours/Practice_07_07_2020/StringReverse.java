package Office_Hours.Practice_07_07_2020;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //            0123456
       /* str.charAt(6);
        str.charAt(5);
        str.charAt(4);
        str.charAt(3);
        str.charAt(2);
        str.charAt(1);
        str.charAt(0);
        //02hhctaB
        String result = "";//"02hctaB"

        for (int i = 6; i>=0; i-=1){//i: 6,5,4,3,2,1,0
            str.charAt(i);
         result += str.charAt(i);// look to result ex for breakdown

        */
        String result = "";
       /* for (int i = str.length()-1; i>=0; i-=1){//i: 6,5,4,3,2,1,0
            str.charAt(i);
            result += str.charAt(i);// look to result ex for breakdown

        */
        int index = str.length()-1;
        while (index>=0){
            result += str.charAt(index);
            index-=1;
        }
        System.out.println(result);
    }
}
