package Day22_NestedLoop;

import java.util.Scanner;

/*
1. Write a program that asks user to enter his/her username and password until user enters  correctly.
                there are only three attempts
                after three attempts:  lock the account

 */

public class Credentials {
    public static void main(String[] args) {
         /*
    username: cyber
    password: tek123
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter user name");
        String u = scan.next();

        System.out.println("Eneter your password");
        String p = scan.next();
        int attempt = 1;
       while (!(u.equals("cyber") && p.equals("tek123") ) ){
           if (attempt>2){
               System.out.println("your account is locked");
           System.exit(0);
           }
           System.out.println("invalid user name or password, Please re-enter");
           System.out.println("Enter user name");
            u = scan.next();
           System.out.println("Enter your password");
            p = scan.next();
            attempt++;
       }




    }
}
