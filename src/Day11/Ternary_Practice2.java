package Day11;
//? means if, : else
public class Ternary_Practice2 {
    public static void main(String[] args) {
        int num = 100;
        String result = "";

        if(num > 0){
            result = "Positive";
        } else if(num < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }

        String result2 =  (num > 0) ? "Positive" : (num < 0)  ? "Negative" : "Zero";

        System.out.println(result);
        System.out.println(result2);

        System.out.println("================================================");
        /*
            write a program that can compare two number
                a = 10, b= 20
               output:  b is greater
               a = 30, b = 10;
               output: a is greater
               a = 20; b= 20;
               output: a is equal to b
         */

        double a = -20;
        double b = 20;
        String result4="";
        if (a>b){
            result4="a is greater";
        }else if (b>a){
             result4="b is greater";
        }else{
            result4="they are equal";
        }
        System.out.println(result4);
        String result3="";
        result3 = (a > b) ? "a is greater" :  (b > a)? " b is greater" : "a is equal to b";
        System.out.println(result3);






    }
}
