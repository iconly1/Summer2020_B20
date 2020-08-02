package Day19_ForLoop;

public class OddEven2 {
    public static void main(String[] args) {
        for (int i = 1; i<=50;i++){
            if (i % 2 == 0){//i % 2 == 0 will skip all even. i % 2 !=0 skips odd prints even
                continue;
            }
            System.out.println(i+" ");
        }
    }
}
