package Day24_Arrays;

public class Uniques2 {
    public static void main(String[] args) {
        //frequency = number of occurrence
        String str = "aabcc"; // or scanner

        String expectedResult = "";

        for (int j = 0; j<=str.length()-1;j++) {


            char ch1 = str.charAt(j);//a
            int count = 0;//1+1
            for (int i = 0; i <= str.length() - 1; i++) {
                char each = str.charAt(i);  //a a b c c
                if (ch1 == each) {
                    count += 1;
                }
            }
            if (count == 1) {
                expectedResult += ch1;
            }
        }
        System.out.println(expectedResult);
    }
}
