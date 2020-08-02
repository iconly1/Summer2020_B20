package Day20_whileLoops;

public class WhileLoop_Practice2 {
    public static void main(String[] args) {
        int num = 10;
        while (num<13){
            System.out.print("name ");
            num++;
        }
        System.out.println("====================================");
        String str = "Cybertek";
        //            01234567
        String result = "";
        /*for (int i = str.length()-1; i>=0; i--){
            result += str.charAt(i);

        }

         */
        int index = str.length()-1;
        while (index>=0){
            result += str.charAt(index);
            index--;
        }
        System.out.print(result);























    }
}
