package Day12;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        System.out.println("Enter your number");
           //int num1= input.nextInt();
           //long num2=input.nextLong();
        double num3=input.nextDouble();
        System.out.println("You entered "+num3);
    }
}
