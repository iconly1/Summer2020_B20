package Day31_Recap;

public class Methods_Practice {
    public static void main(String[] args) {
        max(10,5);
        System.out.println(max2(20,5)*6+7);
    }

    public static void max (int a,int b){
        int max = (a>b) ? a:b;
        System.out.println(max);
    }
    public static int max2 (int a,int b){
        int max = (a>b)? a:b;
        return  max;
    }

}
