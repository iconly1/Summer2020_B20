package Day13_Scanner;
import java.util.Scanner;
public class next_practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your First Name: ");
        String firstName = scan.next();

        System.out.println("Enter your last name: ");
        String lastName = scan.next();

        String fullname= firstName+" "+lastName;
        System.out.println("Full name is: "+fullname);



    }
}
