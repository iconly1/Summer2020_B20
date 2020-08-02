package Day11;

public class NestedIf_Practice2 {
    public static void main(String[] args) {
        int day = 1;
        boolean validNumber = day >= 1 &&  day <=7;
        String result = "";
        if (validNumber){
          result=  (day==7) ? "Sunday": (day==6)? "Saturday": (day==5)? "Friday"
                  :(day==4)? "Thursday":(day==3)? "Wednesday": (day==2)? "Tuesday":"Monday";

        }else{
            result = "Invalid";
        }
        System.out.println(result);






    }
}
