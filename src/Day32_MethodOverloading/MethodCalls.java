package Day32_MethodOverloading;

import java.util.Arrays;

public class MethodCalls {
    public static void main(String[] args) {
        String firstName = "elKEm";
        String lastName = "emEt";
        String fullName = Util.formatFullName(firstName,lastName);
        String unique = Util.uniques(fullName.toLowerCase());
        String reverseName = Util.reverse(fullName);
        System.out.println(fullName);
        System.out.println(unique);
        System.out.println(reverseName.lastIndexOf(reverseName));
        System.out.println("====================================");

        int [] a = {200,400,500,200,1000,50,40,30,400,60,78};
        int n = 2500;
        a = Util.addElement(a,n);
        System.out.println(Arrays.toString(a));
    }
}
