package Day28_Recap;

import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {
        int [] arr1D = {1,2,3};
        int [][] arr2d = {{1,2,3} , {4,5,6,7,8} , {9,10,11,12,13}};
        //int [][][] arr3d = {{{}}};



        for (int i = 0; i<=arr2d.length-1; i++){//gets each array from arr2d
          int [] each1DArray = arr2d[i];
           //System.out.println(Arrays.toString(each1DArray));
            for (int j = 0; j<=each1DArray.length-1; j++){// prints elements of each [] single demension array
                int eachNum = each1DArray[j];
                if (eachNum%2==0){
                    System.out.print(eachNum+" ");
                }

            }
        }
        System.out.println("==========================");

        for (int [] each1D : arr2d){
            for (int eachElement : each1D){
                if (eachElement%2!=0){
                    System.out.print(eachElement+" ");
                }


            }
            System.out.println();
        }




















    }


}
