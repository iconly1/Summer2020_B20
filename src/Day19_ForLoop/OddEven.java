package Day19_ForLoop;
/*
    1. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
    2. write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5

 */
public class OddEven {
    public static void main(String[] args) {
    for (int i = 1; i<=99; i+=2){
                    //^need equal or will not include 99 at the end.
       if (i%5==0 && i %3==0) {
           System.out.print(i + " ");
       }

    }
        System.out.println();
        System.out.println("hello");

        for (int i= 0; i<=100;i++){// pre condition: i must be odd. sub cond: must be divisible by 3&5 thats why use nested.
           if (i%2!=0) {
               if (i%5==0 && i %3==0) {
                   System.out.print(i + " ");
               }
           }


        }
        System.out.println("=================================");
        //task 2
        for (int i =0; i<=100; i+=2 ){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 0; i<=100; i++){
            if (i%2==0){//pre condition number must be even
                if (i%3==0 && i%5==0){//sub condition must be / by 3 & 5. nested is cool
                    System.out.print(i+" ");
                }
            }
        }
        System.out.println();
        System.out.println("this is cool");



    }
}
