package Day25_Practices;
import java.util.Arrays;
public class ShortestString {
    public static void main(String[] args) {
        String [] arr = {"Anam", "Nickolas","Amir","Nurmamet"};
        int minLength = arr[0].length();

        for (int i = 0; i<=arr.length-1; i++){
            int l = arr[i].length();
            if (l<minLength){
                minLength = l;
            }
        }

        System.out.println(minLength);

        for (int i = 0; i<=arr.length-1; i++){
            if (arr[i].length()== minLength){
                System.out.println(arr[i]);
            }
        }




    }
}
