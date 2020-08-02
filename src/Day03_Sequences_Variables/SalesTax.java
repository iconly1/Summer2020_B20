package Day03_Sequences_Variables;

public class SalesTax {
    public static void main(String[] args) {
        float shirts = 40.05f;
        float pants = 70.65f;
        float socks = 10.20f;
        float belt = 22.00f;
        float tax = 0.06f;
        double total  = shirts + pants + socks + belt;
        double totaltax = total * tax;
        double totalowed = total - tax;
        System.out.println(totalowed);
    }








}
