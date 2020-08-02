package Day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        boolean r1 = list.contains(1);//true

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(5);

       boolean r2 = list.containsAll(list2);//false
        System.out.println(r2);
        System.out.println("===========================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);

       // boolean r3  = list3.containsAll(Arrays.asList(10,20,4));//false
        Integer [] arr = {10,20,4};
        boolean r3  = list3.containsAll(Arrays.asList(arr));
        System.out.println(r3);
        System.out.println("====================================");

        ArrayList<String> group = new ArrayList<>();
        group.addAll(Arrays.asList("Muhtar","Nadir","Asiya","Saim"));
        boolean r4 = group.containsAll(Arrays.asList("Marissa","John"));
        System.out.println(r4);
    }

}
