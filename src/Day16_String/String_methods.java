package Day16_String;

import java.util.Scanner;

public class String_methods {
    public static void main(String[] args) {
        String email = "cybertek@gmail.com";
        email = email.replace("gmail", "yahoo");
        System.out.println(email);
        System.out.println("  ");
        String word = "java";
        word =  word.replace("a", "e");
        System.out.println(word);
        System.out.println("    ");

        String sentence = "I like to learn Java, Java is cool, Java is fun.";
        System.out.println(sentence);
        sentence = sentence.replace("a, Java", "a, C#");// replacement had to be unique
        System.out.println(sentence);
        sentence= sentence.replace("l, Java", "l, Python");// so compiler knows which one needs replaced
        System.out.println(sentence);
        System.out.println("       ");
        String s1 = "I like to stay in Cybertek, Cybertek is nice place";//MIT
        System.out.println(s1);
        s1= s1.replace("Cybertek", "MIT");
        System.out.println(s1);
        s1= s1.replace("MIT","Cybertek");
        System.out.println(s1);
        System.out.println("  ");

        String s2 = "I like to LeaRn Java we aRe enjoying Java";
        System.out.println(s2);
        s2= s2.replace('R', 'r');
        System.out.println(s2);
        String s3 = "I like to drink tea and tea";
                s3= s3.replaceFirst("tea", "cola");
        System.out.println(s3);
        System.out.println("           ");
        String s4 = "I like to watch Game of thrones, and Walking dead.";
        System.out.println(s4);
        s4= s4.replace(", and Walking dead", ".");
        System.out.println(s4);
        System.out.println("===================");
        //Index of()
        String s5 = "I like to stay in cybertek, we are learning java";
        int r1 = s5.indexOf("r");
        int r2 = s5.indexOf("re");//better to add characters after r so it gives it unique
            //     ^^^^^^^^^
        //example: int r2 = s5.indexOf("ar")+1; {if you dont do charecters after you will have to do this
        int r3  = s5.indexOf("rn");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println("");
        //lastIndexOf
        String s6 = "Java is a programming language, and Java is fun";
        int i1 = s6.indexOf("J");
        //int i1 = s6.indexOf(" J")+1;
        //int i1 = s6.indexOf("Java is fun");
        int i2 = s6.lastIndexOf("J");
                System.out.println(i1);
        System.out.println(i2);

        String s7 = "Java";
                int a1 = s7.indexOf("A"); // returns as -1 due to it not existing
        System.out.println(a1);
        String s8 = "Java";
        double a = s8.indexOf("a");
        char ch = s8.charAt((int)a);// always do INT cannot read decimal or will have to cast it.
        String v = s3.toLowerCase();
    }
}
