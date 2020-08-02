package Day25_Practices;

public class CombineTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5};

        int size = arr1.length+arr2.length;

        int[] arr3 = new int[size];
        arr3[0] = arr1[0];

        int index = 0;
        for (int each:arr1){
            arr3[index]=each;
            index +=1;
        }
        System.out.println(index);
        for (int each : arr2){
            index++;
        }
        System.out.println(index);
    }
}
