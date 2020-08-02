package Day15_String;

public class String_Methods {
    public static void main(String[] args) {
        String name ="Cybertek School is a great place";
       //     index   01234567
       // charAt(index):
        char ch1 = name.charAt(0);
        char ch2 = name.charAt(5);
        System.out.println(ch2);
        System.out.println(ch1);
        //Length
        int l = name.length();
        System.out.println(l);
        //last index : length of string -1
        int lastIndexNumber= name.length()-1;
        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);

    }
}
