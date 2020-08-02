package Day23_Arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

            String [] month = {"January","February","March","April","May","June","July","August",
                    "September","October","November","December"};
            Scanner scan = new Scanner(System.in);

            for (int i =0; i<=1; i++){
                System.out.println("Enter month number");
                int nm = scan.nextInt();
                if (nm > 0 && nm <= 12) {
                    System.out.println("The month name is "+month[nm-1]);
                }else{
                    System.out.println("Invalid");
                }
                break;
            }

    }
}
