package Day29_CustomMethods;

public class Method_practice {
    public static void even100(){
        for (int i = 0; i <=100; i+=2) {

                System.out.print(i +" ");

        }
        System.out.println();
    }
    public static void odd100(){
        for (int i = 1; i <=100; i+=2) {

                System.out.print(i + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        even100();
        System.out.println("===============");
        odd100();
    }
}
