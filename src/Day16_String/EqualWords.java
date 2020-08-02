package Day16_String;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
/*

 */

public class EqualWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first word");
        String first = scan.next();
        System.out.println("enter second word");
        String second = scan.next();
        String result = (first.equalsIgnoreCase(second))?"equal":"not equal";
        System.out.println(result);








    }
}
