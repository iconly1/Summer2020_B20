package Day11;
/*
90~100==A
80~89==b
70~79==c
60~69==d
0~60==F
 */
public class NestedIf {
    public static void main(String[] args) {
       int score=0;
       String result="";
        if (score>=0 && score <= 100){
           if (score>=90){
              result="A";
           }else if (score>=80){
              result="B";
           }else if (score>=70){
              result="C";
           }else if (score>=60) {
               result = "D";
           }else{
               result = "F";
           }
        }else{
            result= "Invalid";
        }
        System.out.println(result);
        System.out.println("====================================================================================");

        /*
        Precondition of loan: minimum salary of 30k
            sub condition: of minimum job history of 2 year job history
         */

        double salary= 33500;
        int jobHistory=1;
        String answer="";

        if (salary>=30_000){
            if (jobHistory>=2){
                answer="You Qualify!!!";
            }else{
                answer="You must have 2 years of job history";
            }
        }else{
            answer = "You do not Qualify";
        }
        System.out.println(answer);




















    }
}
