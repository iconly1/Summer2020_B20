package Day30_CustomMethods;
import Library.Util;
public class MethodCalls {
    public static void main(String[] args) {
        String str= "aaaaaaaaaabbbbbbbbbbbbcccccccccccccc";
       String e =  Util.removeDup(str);
        System.out.println(e);
    }
}
