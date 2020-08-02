package Day14_Recap;
import java.util.Scanner;
public class Great {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double score = input.nextDouble();

        input.close();//Closes scanner

        String result = "";

        if(score>=0 && score <= 100){
            if(score >=90){
                result = "Excelent";
            } else if(score>=80){
                result = "Great";
            }else if(score>=70){
                result = "Passed";
            }else if(score>=60){
                result = "Failed";
            }
        }else{
            result = "Invalid entry";
        }

    System.out.println(result);
    }
}
