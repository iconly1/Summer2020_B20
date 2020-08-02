package Day11;

public class Ternary {
    public static void main(String[] args) {
    int num = 100;
    String redult="";
    if(num%2==0){
        redult="even";
    }else{
        redult="odd";
    }
        System.out.println(redult);
        System.out.println("========================================");
       String result2 = (num%2==0) ? "even": "odd";
        //action   if      else
        System.out.println(result2);
        System.out.println("========================================");
        int num1=20;
        int num2=20;
        int max1=0;
        if (num1>num2){
            max1=num1;
        }else{
            max1=num2;
        }
        System.out.println(max1);
        int max2= (num1>num2) ? num1 : num2;
        System.out.println(max2);
        System.out.println("=========================");
        int age=20;
        boolean eligible = false;
        if (age>21){
            eligible=true;
        }else{
            eligible=false;
        }
        System.out.println(eligible);
        boolean eligible2= (age>21)? true : false;
        System.out.println("=========================================");





    }
}
