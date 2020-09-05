package Day31_Recap;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AABBBCCC";
        String expectedResult="";
        String nonDup = Util.removeDup(str);  //ABC

       /*for (int i = 0; i <= nonDup.length()-1; i++){
            char ch1 = nonDup.charAt(i);//ABC
            int count = Util.frequency(str,ch1);//2,3,3
            expectedResult += ""+ch1+count;//A2,B3,C3
        }

        */

        for (char each : nonDup.toCharArray()){
            int count1 = Util.frequency(str,each);
            expectedResult += ""+each+count1;
        }




       /* char ch1 = nonDup.charAt(0);//A
        int count = Util.frequency(str,ch1);//2
        expectedResult += ""+ch1+count;

        char ch2 = nonDup.charAt(1);//A
        int count2 = Util.frequency(str,ch2);//2
        expectedResult += ""+ch2+count2;

        char ch3 = nonDup.charAt(2);//A
        int count3 = Util.frequency(str,ch3);//2
        expectedResult += ""+ch3+count3;

        */

        System.out.println(expectedResult);
        System.out.println("===================");
        String str2= "wwwwwwwwwwwwwwwwweeeeeeeeeeeeeeeeeeeeeeerrrrrrrrrtttttttttttyyyyuuuuu";
        String expectedResult2= frequencyOfChars(str2);
        System.out.println(expectedResult2);
    }
    public static String frequencyOfChars(String str){
        String expectedResult="";
        String nonDup = Util.removeDup(str);
        for (char each : nonDup.toCharArray()){
            int count1 = Util.frequency(str,each);
            expectedResult += ""+each+count1;
        }
        return expectedResult;
    }
}
