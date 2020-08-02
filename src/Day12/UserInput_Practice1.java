package Day12;
import java.util.Scanner;
public class UserInput_Practice1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("####Enter Your Number####");
        double num = scan.nextDouble();
        String result=(num%2==0)?"even":"odd";
        System.out.println(result);











    }
}
