package Day13_Scanner;
import java.util.Scanner;
public class ScannerMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Car has 4 doors");
        boolean result = scan.nextBoolean();
        System.out.println(result);
    }
}
