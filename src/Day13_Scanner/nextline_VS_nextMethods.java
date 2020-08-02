package Day13_Scanner;

import java.util.Scanner;

public class nextline_VS_nextMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();
        scan.nextLine(); // we use it to take out the enter in the scanner
        //so that we can use the nexline() ex. (fullName)
        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Salary: "+salary);
        System.out.println("Full name: "+fullName);









    }





}
