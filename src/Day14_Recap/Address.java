package Day14_Recap;
import java.util.Scanner;
/*
                    building number ( nextInt() )
                            nextLine()
                    Street address (Assume it has more than one word) ( nextLine() )
                    city name (nextLine() )
                    state name ( next() )
                    zip code ( nextInt() )
                            nextLine()
                    full name of the person ( nextLine() )
 */
public class Address {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter building number ");
        int buildingNum = input.nextInt();

        input.nextLine();
        System.out.println("Enter address: ");
        String address = input.nextLine();

        System.out.println("Enter city: ");
        String city = input.nextLine();

        System.out.println("Enter State name: ");
        String state = input.next();

        System.out.println("Enter zip code: ");
        int zip = input.nextInt();

        input.nextLine();
        System.out.println("Enter Full Name: ");
        String fullName = input.nextLine();

        System.out.println("\nShip To: " + fullName+"\n"+buildingNum+" "+address
        +"\n"+ city+", "+state+" "+zip);



    }
}
