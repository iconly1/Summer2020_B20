import java.util.Scanner;

public class rep {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int length = word.length();

        if (length == 10) {
            System.out.println("" + word.charAt(0) + word.charAt(1) + word.charAt(2) + word.charAt(3) + word.charAt(4)
                    + word.charAt(0) + word.charAt(1) + word.charAt(2) + word.charAt(3) + word.charAt(4));
        } else if (length == 9) {
            System.out.println("" + word.charAt(0) + word.charAt(1) + word.charAt(2) + word.charAt(3)
                    + word.charAt(0) + word.charAt(1) + word.charAt(2) + word.charAt(3));
        } else if (length == 8) {
            System.out.println("" + word.charAt(0) + word.charAt(1) + word.charAt(2) + word.charAt(3)
                    + word.charAt(0) + word.charAt(1) + word.charAt(2) + word.charAt(3));
        } else if (length == 7) {
            System.out.println("" + word.charAt(0) + word.charAt(1) + word.charAt(2)
                    + word.charAt(0) + word.charAt(1) + word.charAt(2));
        } else if (length == 6) {
            System.out.println("" + word.charAt(0) + word.charAt(1) + word.charAt(2) + word.charAt(3)
                    + word.charAt(0) + word.charAt(1) + word.charAt(2) + word.charAt(3));
        } else if (length == 5) {
            System.out.println("" + word.charAt(0) + word.charAt(1)
                    + word.charAt(0) + word.charAt(1));
        } else if (length == 4) {
            System.out.println("" + word.charAt(0) + word.charAt(1) + word.charAt(0) + word.charAt(1));
        } else if (length == 3) {
            System.out.println("" + word.charAt(0) + word.charAt(1) + word.charAt(0));
        } else if (length == 2) {
            System.out.println("" + word.charAt(0));
        } else {
            System.out.println("" + word.charAt(0));
        }




    }
    public static int[] mergR ( int[] a, int[] b){
        int count = 0;
        int[] c = new int[a.length - 1 + b.length - 1];
        for (int i = 0; i <= a.length-1; i++) {
            c[i] += a[i];
            count++;
        }
        for (int i = count; i <= b.length-1; i++) {
            c[i] += b[i];
        }
        return c;
    }

}

