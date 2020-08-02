package Day16_String;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you employeed?");
        String answer = scan.next();// secondary wa to do it .toLowerCase

        if (answer.equalsIgnoreCase("yes")){
          //^^^^^Primary way to do this is
            System.out.println("Employed");

        }else{
            System.out.println("Not Employed");
        }
    }
}
