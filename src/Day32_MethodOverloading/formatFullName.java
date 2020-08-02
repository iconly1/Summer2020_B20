package Day32_MethodOverloading;

import java.util.Scanner;

/*
 1. write a method that can retunr the full name of a person in reugral format
            ex:
                fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"
 */
public class formatFullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String first = scan.nextLine();
        System.out.println("Enter your last name");
        String last =scan.nextLine();

        first = first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
                              //^ convert first char to uppercase  ^ rest in lowercase
        last = last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
                            //^ convert first char to uppercase  ^ rest in lowercase
        System.out.println(first+" "+last);
    }
    public static String Method1(String firstName , String  lastName ){
        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        //^ convert first char to uppercase  ^ rest in lowercase
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        //^ convert first char to uppercase  ^ rest in lowercase
        String fullName = firstName+" "+lastName;
        return fullName;
    }
}
