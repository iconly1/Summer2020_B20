package Day26_multiDemensionalArray;

import java.util.Arrays;

/*

    2. write a program that can return the number of appearances of “java” and “python” anywhere in the sentence
            ex:
                input: I love Java, Python is cool
                output: 1 Java 1 Python
                input: Java Java Python Python Python
                output: 2 Java 3 Python
Collapse
 */
public class Java_Python {
    public static void main(String[] args) {
    String sentence = "I love Java, javaScript,Rust,  Python is cool";
    String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        int countJava= 0;
        int countPython = 0;

        for (String each:words){
            if (each.toLowerCase().contains("java")){

                countJava++;

            }else if (each.toLowerCase().contains("python")){
                countPython++;
            }
        }

        System.out.println("Java count: "+countJava);
        System.out.println("Python count: "+countPython);





    }
}
