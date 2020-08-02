package Office_Hours.Practice_07_06_2020;

public class Quizz {
    public static void main(String[] args) {
        String str = " ";
        str.trim();//"" have to assign to make it work
        System.out.println(str.isEmpty());

        System.out.println("===============");
        String ta = "A";
        ta=ta.concat("B");//A B
        String tb ="C";
        ta= ta+tb;//ABC
        ta.replace('c','D');//"ABD" but it wasnt assigned
        ta= ta+tb;//ABCC added C again
        System.out.println(ta);//ABCC

        System.out.println("============================");

        String s1 = "abc";
        String s2 = "abc";

        System.out.println("s1 == s2 is :" + s1 == s2);
        //
        System.out.println("=========================================");



    }
}
