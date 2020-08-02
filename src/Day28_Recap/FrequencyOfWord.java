package Day28_Recap;
/*
1. write a program return the frequency of a word from a string
            ex:
                str = "JavajavaJAVA";
                word = "java";
                output:
                    3
        do not use same the approach we did in last office hour

 */
public class FrequencyOfWord {
    public static void main(String[] args) {
        String str = "javajava";
        //            01234567

        //substring(0, 4) ==> java
        // substring(1, 5) ==> avaj
        // substring(2, 6) ==> vaja
        // substring(3, 7) ==> ajav
        // substring(4, 8) ==> java

        //substring(i, i+4)

        //"java"
        int count = 0;
        for (int i = 0; i<= str.length()-4;i++){
            String s = str.substring(i,i+4);// if you add 4 you need to - 4^
            if (s.equalsIgnoreCase("java")){
                count++;
            }

        }
        System.out.println(count);
    }
}
