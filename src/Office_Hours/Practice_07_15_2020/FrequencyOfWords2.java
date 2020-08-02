package Office_Hours.Practice_07_15_2020;

public class FrequencyOfWords2 {
    public static void main(String[] args) {
        String str = "JavajavaJavajavaJava";
        int count = 0;

       /* if (str.contains("java")){
            count++;
            str = str.replaceFirst("java","");//need to repreat this
        }

        */
        while (str.contains("java")) {
            count++;
            str = str.replaceFirst("java", "");
        }
        int upper = 0;
        while (str.contains("Java")) {
            upper++;
            str = str.replaceFirst("Java", "");
        }


        System.out.println("Upper case Java:"+upper);
        System.out.println("Lower case Java:"+count);
    }
}
