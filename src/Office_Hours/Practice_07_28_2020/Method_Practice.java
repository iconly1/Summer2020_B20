package Office_Hours.Practice_07_28_2020;

import java.util.ArrayList;

public class Method_Practice {
    public static void main(String[] args) {
        String str = "dawoo";
        System.out.println( reversStr(str));
        isPalindrome("Ian");
        System.out.println("=====================================");
        String [] names = {"Juan","Ian","Lilil","Todo","bob","Dad","Mom"};
        ArrayList <String> nameList = new ArrayList<>();

        for (String ele:names) {
            System.out.println( reversStr(ele));
            isPalindrome(ele);
            nameList.add(ele);
        }
        System.out.println(nameList);
    }
    public static String reversStr(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }


        return result;

    }
    public static void  isPalindrome(String str){
        String  reversStr = reversStr(str);
        boolean palindrome = str.equalsIgnoreCase(reversStr);

        System.out.println((palindrome)?str+" Is Palindrome":str+" Is not Palindrome");

    }
}
