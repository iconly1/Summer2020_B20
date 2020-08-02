package Day24_Arrays;
import java.util.Arrays;
public class String_Methods {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJ";
        char [] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));
        System.out.println("===========================");
        String str1 ="DCEBA";
        String str2 ="ADCBE";
        char [] ch1 = str1.toCharArray();
        char [] ch2 = str1.toCharArray();
        Arrays.sort(ch1);//"ABCDE"
        Arrays.sort(ch2);//"ABCDE"
        boolean r1 = Arrays.equals(ch1,ch2);
        System.out.println(r1);
        System.out.println("===================");
        String sentence = ("I Love Programming Language");
       String [] words = sentence.split(" ");//{ [I] [Love] [Programming] [Language]
        System.out.println(Arrays.toString(words));
        for (int i = words.length-1; i>=0; i--){
            System.out.print(words[i]+" ");
        }

        System.out.println();
        System.out.println("===================");

    String s = "java";
    String[] arr =  s.split("");
        System.out.println(Arrays.toString(arr));//[j,a,v,a] string Array

        char [] c = s.toCharArray();
        System.out.println(Arrays.toString(c));//data type is char Array

    }
}
