package Day19_ForLoop;

public class BreakSatement {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            System.out.println("Hello");
            break;// without break would have printed 5 times

        }
        System.out.println("======================");

        for (char ch= 'A'; ch <='H'; ch++){
            System.out.print(ch+" "); //= ABC because it checks the condition after it prints
            if (ch=='C'){
                break;
            }
           // System.out.println(ch+" "); = AB
        }
        System.out.println();
        System.out.println("=================");

        for (int i = 10; i<=50; i+=10){
            System.out.print(i+" ");
            if (i==30){
            break;
            }

        }
        System.out.println();
        for (int x= 1000; x>=100; x-=100){
            System.out.print(x+" ");//1000 900 800 700 600 500
            if (x == 500){
                break;
            }
            //System.out.print(x+" ");//1000 900 800 700 600
        }



    }
}
