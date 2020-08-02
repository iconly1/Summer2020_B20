package Day33_LocalDateTime;

import java.util.Arrays;

public class SortDescending {
    /*
      Task02:
        1. create a return method that can return an int array in descending order
        2. create a return method that can return a double array in descending order
        3. create a return method that can return a String array in descending order
        4. create a return method that can return a char array in descending order

     */
    public static void main(String[] args) {
        int [] arr = {1,4,3,2,5};
        Arrays.sort(arr);
     //   System.out.println(Arrays.toString(arr));

        int [] arr2 = new int [arr.length];//{5,4,3,2,1}
        /*
        arr2[0]= arr[arr.length-1];
        arr2[1]= arr[3];
        arr2[2]= arr[2];
        arr2[3]= arr[2];
        arr2[arr2.length-1]= arr[0];

         */
        int k = arr.length-1;
        for (int i = 0; i <=arr2.length-1; i++){
            arr2[i] = arr [k];
            k--;
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println("=========================");
        int [] scores = {100,40,38,29,55};
       scores =  sortDescending(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("=====================================");
        double [] n1 = {5.5,6.5,7.7,8.5,9.3,1.5,0.5};
        n1 = sortDescending(n1);
        System.out.println(Arrays.toString(n1));
    }
    public static int [] sortDescending(int [] arr){
        Arrays.sort(arr);
        int [] arr2 = new int [arr.length];//{5,4,3,2,1}
        int k = arr.length-1;
        for (int i = 0; i <=arr2.length-1; i++){
            arr2[i] = arr [k];
            k--;
        }
        return arr2;
    }
    public static double [] sortDescending(double [] arr){
        Arrays.sort(arr);
        double [] arr2 = new double [arr.length];//{5,4,3,2,1}
        int k = arr.length-1;
        for (int i = 0; i <=arr2.length-1; i++){
            arr2[i] = arr [k];
            k--;
        }
        return arr2;
    }
    public static char [] sortDescending(char [] arr){
        Arrays.sort(arr);
        char [] arr2 = new char [arr.length];//{5,4,3,2,1}
        int k = arr.length-1;
        for (int i = 0; i <=arr2.length-1; i++){
            arr2[i] = arr [k];
            k--;
        }
        return arr2;
    }
    public static String [] sortDescending(String [] arr){
        Arrays.sort(arr);
        String  [] arr2 = new String [arr.length];//{5,4,3,2,1}
        int k = arr.length-1;
        for (int i = 0; i <=arr2.length-1; i++){
            arr2[i] = arr [k];
            k--;
        }
        return arr2;
    }
}
