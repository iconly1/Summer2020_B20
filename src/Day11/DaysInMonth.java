package Day11;
/*
2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:
                28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12
 */

public class DaysInMonth {
    public static void main(String[] args) {
        int month = 2;
        boolean day28= month==2;
        boolean days30= month==4 || month==6 || month==9 || month==11;
        boolean invalid= month <1 || month>12;
        String result="";
        if (day28){
            result= "28 days";
        }else if (days30){
            result="30 days";
        }else if (invalid){
            result="invalid";
        }else{
            result="31 days";
        }
        System.out.println(result);
        String result2="";
        result2 = (day28) ? "28 days" :(days30)? "30 days" : (invalid)? "invalid" : "31 days";
        System.out.println(result2);



    }
}
