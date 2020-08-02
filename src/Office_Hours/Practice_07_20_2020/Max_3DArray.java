package Office_Hours.Practice_07_20_2020;

public class Max_3DArray {
    public static void main(String[] args) {
        int[][] arr2D = {   {11,2,3} , {4,5,6,7}, {8,9,10,11,12} , {13,14,15,20,16,} };
        int[][] arrc2D = {   {21,22,32} , {42,52,62,27}, {82,91,101,111,112} };
        int[][][] arr3D = {arr2D,arrc2D};
        int max = arr3D [0][0][0];
        int min = arr3D [0][0][0];
        for (int [][] each2D :arr3D) {
        for (int[]each1D:each2D){
            for (int eachElement:each1D) {
                if (eachElement>max){
                    max=eachElement;
                }
            }
        }
        }
        for (int [][] each2D :arr3D) {
            for (int[]each1D:each2D){
                for (int eachElement:each1D) {
                    if (eachElement<min){
                        min=eachElement;
                    }
                }
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
