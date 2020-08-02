package Day03_Sequences_Variables;

public class Print_VS_Println {
    public static void main(String[] args) {
        System.out.print("A");/* will combine the following because
        it does not append a new line */
        System.out.print("B");
        System.out.print("C");
        System.out.println("===================");
        System.out.println("A");// prints a new line because it is println
        System.out.println("B");
        System.out.println("C");
    }
}
