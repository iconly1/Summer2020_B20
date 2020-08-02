package Day24_Arrays;
import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
    int[] arr = {1,2,3};// have to convert to string to make it readable
        System.out.println(Arrays.toString(arr));

    String s1 = Arrays.toString(arr); //is another way
        System.out.println(s1);
        String [] names ={"Muhtar", "Saim", "Nadir", "Asyia", "Kuzzat"};

        System.out.println(names);// have to convert to string to make it readable
        System.out.println(Arrays.toString(names));
        System.out.println("======================");

        int [] nums = {5,4,6,5,4,3,10};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);// [3,4,4,5,5,6,10]
        System.out.println(Arrays.toString(nums));
        System.out.println("Maximum number: "+nums[nums.length-1]);//gives maximum number
        System.out.println("Minimum number: "+nums[0]);
        System.out.println("=============");
        String students [] = {"Mehdi", "Elkem","Meee", "Trump"};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        System.out.println("==============");
        int [] arr1 = {1,2,3};
        int [] arr2 = {1,2,3};
        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);
        int [] arr3 = {2,1,3};
        Arrays.sort(arr2);
        Arrays.sort(arr3); // have to sort or you will get false.
        boolean r2 = Arrays.equals(arr3,arr2);
        System.out.println(r2);
        int [] arr4 = {1,1,2,3};
        int [] arr5 ={1,2,3};
        boolean r3 = Arrays.equals(arr4,arr5); // wont equal because array are different
        System.out.println(r3);
    }
}
