package Day06_ComparisonOperators;

public class RelationalOperators {
    public static void main(String[] args) {

       boolean r1 = 10 > 9;
        System.out.println(r1);
       boolean r2 = 100<9000;
        System.out.println(r2);
        boolean r3 =87>=85;
        System.out.println(r3);
        boolean r4 = 877 >= 878;
        System.out.println(r4);
        boolean r5 = 200 <= 300;
        System.out.println(r5);
        boolean r6 = 900 == 800;
        System.out.println(r6);

        boolean r7= true == false;
        System.out.println(r7);
        boolean r8 = "Muhtar" == "good guy";//different characters
        System.out.println(r8);
        boolean r9= "muhtar"=="MUHTAR";//false java case sensitive
        System.out.println(r9);

        boolean r11 = "Muhtar" != "Bad Guy";
        System.out.println(r11);
        boolean r12 = true !=false;
        System.out.println(r12);
        boolean result1 = 'A'== 65;
        System.out.println(result1);
        boolean result2 = 100==100.0;//$100= $100.0
        System.out.println(result2);
        boolean result3 = 10 == (int)10.999999;//true because of casting.
        System.out.println(result3);

        int number = 101;
        boolean even = number%2 == 0;
        boolean odd = number%2 !=0;
        System.out.println(even);
        System.out.println(odd);
        int x =1000;
     System.out.println();


    }
}
