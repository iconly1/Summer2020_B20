package Day14_Recap;
import java.util.Scanner;
/*
task:
1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )
 */
public class ScannerPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your gender: ");

        String gender = input.next();
        System.out.println("Enter age: ");

        int age = input.nextInt();

        input.nextLine();
        System.out.println("Enter Country: ");
        String country = input.nextLine();

        System.out.println("Enter zipcode: ");
        int zip= input.nextInt();

        input.nextLine();
        System.out.println("Enter Full Name: ");
        String fullName= input.nextLine();

        System.out.println("Enter Company Name");
        String companyName= input.nextLine();

        System.out.println(gender);
        System.out.println(age);
        System.out.println(country);
        System.out.println(zip);
        System.out.println(fullName);
        System.out.println(companyName);

    }
}
