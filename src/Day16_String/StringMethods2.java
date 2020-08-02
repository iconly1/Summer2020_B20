package Day16_String;

public class StringMethods2 {
    public static void main(String[] args) {
//is empty method
        String name1 = "cybertek";
        System.out.println(name1.isEmpty());
        String name2 = "";
        System.out.println(name2.isEmpty());
// equal()
        String str1 = "Java"; // string pool
        String  str2 = new String("Java");//heap
        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2));//True
        String str5 = "HOWDY";
        String str6 = "howdy";
        System.out.println(str5.equals(str6));// false case sensitive
        //EqualIgnoreCase
        System.out.println(str5.equalsIgnoreCase(str6));

        // contains()
        String str = "I like to learn java programming language";
        System.out.println(str.contains("python"));//false
        System .out.println(!str.contains("python"));//true
        System.out.println(str.contains("java"));//true
        System.out.println(" ");

        // startsWith()
        String s1 = "Ian";
        System.out.println(s1.startsWith("I"));//True
        System.out.println(s1.startsWith("M"));//false
        System.out.println(s1.startsWith("Ia"));//true
        System.out.println(s1.toLowerCase().contains("ia"));//true bypass's case sensitivity
        System.out.println(" ");
        // endsWith()




    }
}
