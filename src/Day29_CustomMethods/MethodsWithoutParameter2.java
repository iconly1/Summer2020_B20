package Day29_CustomMethods;
/*
Access-modifier specifiers return-type name(){
statements

}
 */

public class MethodsWithoutParameter2 {
    /*
    step 1 print hello 5 times
    step 2 print my school name
    step 3 print hello 5 times

     */
    public static void printHello5X(){
        for (int i = 10; i >=6; i --){
            System.out.println("Hello World");
        }
    }
    public static void even100(){
        for (int j = 1; j <=100; j++) {
            if(j%2==0){
                int even=0;
                even=j;
                System.out.println(even);
            }
        }
    }
    public static void odd100(){
        for (int h = 1; h <=100; h++) {
            if(h%2!=0){
                int odd=0;
                odd=h;
                System.out.println(odd);
            }
        }
    }

    public static void main(String[] args) {
        printHello5X();
        System.out.println("Cybertek");
        printHello5X();
        System.out.println("IAN");
        System.out.println("==========");
        even100();
        System.out.println("==========");
        odd100();
    }
}
