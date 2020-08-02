package Office_Hours.Practice_07_14_2020;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,6,77,9,4};
        for (int b:arr){

            int count = 0;// for the frequency of num.
            for (int each:arr){
                if (each == b){
                    count++;
                }

            }
            if(count==1){
                System.out.println(b);
            }
        }



    }
}
