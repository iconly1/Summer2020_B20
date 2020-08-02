package Day31_Recap;


public class Methods_Practice2 {
    public static void main(String[] args) {
        String name = "madam";
        String rev = reverse2(name);
        System.out.println("Palindrome is "+name.equals(rev));
    }
    public static void reverse1(String str){
        String expectedResult = "";
        for (int i =str.length()-1; i>=0; i--){
            expectedResult += str.charAt(i);
        }
    }
    public static String reverse2(String str){
        String expectedResult = "";
        for (int i =str.length()-1; i>=0; i--){
            expectedResult += str.charAt(i);

        }
        return expectedResult;
    }
}
