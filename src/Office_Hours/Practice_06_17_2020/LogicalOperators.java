package Office_Hours.Practice_06_17_2020;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean r1= !true != true;// !=does not equal
        System.out.println(r1);

        boolean r2 = !r1;
        System.out.println(r2);
        System.out.println(!!!!!false);
        System.out.println(!!!!!!true);
        System.out.println("=============================================");
            //: ||
        boolean result1 = 9>10 || "Java"== "Java" || 'A'=='a';
                         //false    True               false
                              // as long as 1 is true in or || logic it will be true
        //: &&
        boolean result2 = "Java" != "Python" && "Muhtar" == "Good Guy";//
                                   //True               false
                        // && logic all things are false unless you they are true






























    }
}
