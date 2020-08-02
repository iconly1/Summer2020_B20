package Day13_Scanner;

import java.util.Scanner;

public class Nextline_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number: ");
        int buildingNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your street name: ");
        String streetName= scan.nextLine();
        System.out.println(buildingNumber+" "+streetName);
        scan.close();
    }
}
