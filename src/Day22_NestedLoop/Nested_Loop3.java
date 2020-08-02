package Day22_NestedLoop;

public class Nested_Loop3 {
    public static void main(String[] args) {

        int j = 1;
        while(j<=10){
            for (int i = 1; i<=5; i++){
                System.out.print("*");
            }
            System.out.println();
            j++;
        }
        System.out.println("===========================");
        int h = 1;
        while(h<=4){//lines
            for (int i = 1; i<=7; i++){// amount of *******
                System.out.print("*");
            }
            System.out.println();
            h++;
        }
    }
}
