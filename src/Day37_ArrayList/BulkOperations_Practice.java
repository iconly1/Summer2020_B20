package Day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Sayeem");
        students.add("Waqar");
        students.add("Beslan");
        students.add("Dawud");
        students.add("Ramazan");
        students.add("Mehary");

        boolean r1 = students.containsAll(Arrays.asList("Ulku","Busra","Muhtar"));
        System.out.println("=======================================");
        ArrayList<Integer> numbers = new ArrayList<>();
        /*
        Integer [] nums = {30,25,40,15,55,65,75,85,95,100};
        numbers.addAll(Arrays.asList(nums));

         */
        numbers.addAll(Arrays.asList(30,25,40,15,55,65,75,85,95,100));
        System.out.println(numbers);
        System.out.println("=======================");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,1,1,2,2,3,4,5,5,6,7,7,8,10,11,12,13));
        nums.removeAll(Arrays.asList(1,2,3,5,10,11));
        System.out.println(nums);
        System.out.println("===================================");
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.addAll(Arrays.asList(1,1,2,2,3,3,3,4,4,5,5,6,6,7,7,8,8,9,9));
        System.out.println(num1);

        // only keep ellements that are 1,or,2,0r,3,or,9
        num1.retainAll(Arrays.asList(1,2,3,9));// removes all that are not 1,2,3,9
        num1.removeAll(Arrays.asList(1,2,3,9));// removes 1,2,3,9
        System.out.println(num1);
        System.out.println("==================================");
        ArrayList<String> employeeNames = new ArrayList<>();
        employeeNames.addAll(Arrays.asList("Ahmed","Muhtar","Ahmed","Beslan","Ibrahim","Ahmed"));
        employeeNames.removeAll(Arrays.asList("Ahmed"));// retainAll would keep all Ahmed;
        System.out.println(employeeNames);


    }
}
