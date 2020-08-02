package Day24_Arrays;
import java.util.Arrays;
public class Practice {
    public static void main(String[] args) {
        String names = "John Cindy Joe Mike Sarah Larua Steve";
        String [] words = names.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println();
        for (String each :words){
            System.out.print(each+" ");
        }

    }
}
