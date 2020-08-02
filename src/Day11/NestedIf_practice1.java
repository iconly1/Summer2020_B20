package Day11;

/*
        Precondition of loan: minimum salary of 30k
            sub condition: of minimum job history of 2 year job history
  */

public class NestedIf_practice1 {
    public static void main(String[] args) {
        double salary = 12000;
        int jobHistory = 5;
        if (salary>=30_000){
            if (jobHistory >= 2){
                System.out.println("You are qualified");
            }else{
                System.out.println("You do not have enough Job history");
            }
        }else{
            System.out.println("You Must ear at least $30k");
        }










    }
}
