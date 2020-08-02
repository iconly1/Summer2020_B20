package Day19_ForLoop;
/*
   3. write a program that can calculate the sum of all the even numbers between 1 ~ 100
    4. write a program that can calculate the sum of all the odd numbers between 1 ~ 100

 */
public class SumofEvenOdd {
    public static void main(String[] args) {
        //3rd task
    int sumOfEven = 0;
       /* for (int i = 0; i <= 100; i+=2 ){
        sumOfEven+=i;
        }
        System.out.println(sumOfEven);*/
        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0){
                sumOfEven +=i;
            }
        }


        System.out.println(sumOfEven);
        System.out.println("==========================================");
        int sumOfOdd = 0;
        /*for (int i = 1; i<=99; i+=2 ){
            sumOfOdd += i;
        }

        System.out.println(sumOfOdd);
         */

        for (int i = 0; i<=100; i++){
            if (i%2 != 0) {
                sumOfOdd += i;
            }
        }
        System.out.println(sumOfOdd);
    }
}
