package Day06_ComparisonOperators;
/*
 task03:
            create a class called Swap,
            and write a program that can swap two
            variables' values wihtout using temporary variable
                    Ex:
                        int a =10;
                        int b= 15;
                    output:
                        System.out.println(a); ===> 15
                        System.out.println(b); ===> 10


 */
public class Swap2 {
    public static void main(String[] args) {

    int a = 10;
    int b = 15;
    a = a + b;//=25
    b = a - b;//=10 a=25
    a = a - b;// 25-10= 15
        System.out.println("b="+b);
        System.out.println("a="+a);






    }
}
