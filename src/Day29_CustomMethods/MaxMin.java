package Day29_CustomMethods;

public class MaxMin {
    public static void maxNum(int[]arr){
        int max = arr[0];
        for (int each:arr){
            if (each>max){
                max=each;
            }
        }
        System.out.println("Max: "+max);
    }
    public static void minNum(int[]arr){
        int min = arr[0];
        for (int each:arr){
            if (each<min){
                min=each;
            }
        }
        System.out.println("Min: "+min);
    }

    public static void main(String[] args) {
        int [] numbers ={1,3,5,4,65,4,5,8888,1};
        maxNum(numbers);
    }
}
