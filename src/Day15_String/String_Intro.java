package Day15_String;

import java.util.Scanner;
public class String_Intro {
    public static void main(String[] args) {
        String name = "Cybertek";
        String name2 = new String("Cybertek");
        Scanner input = new Scanner(System.in);
        String s1 = "cat";
        String s2 = "cat";
        System.out.println(s1==s2);

        String d1 = "Dog";//String litteral(in string pool)
        String d2 = "dog";
        System.out.println(d1==d2);//case sensitive

       String t1 = new String("Tiger");
       String t2 = new String("Tiger");// not the same. In different location and are 2 different objects (in Heap)
        System.out.println(t1==t2);
        System.out.println("================================================");

        String c1 = "Cybertek";//string pool
        String c2 = new String("Cybertek");//Heap
        String c3 = new String("Cybertek");//Heap
        String c4 = "Cybertek";//String pool
        String c5 = "cybertek";//String Pool






    }
}
