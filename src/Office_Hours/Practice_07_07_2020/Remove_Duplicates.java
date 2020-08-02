package Office_Hours.Practice_07_07_2020;

public class Remove_Duplicates {
    public static void main(String[] args) {
        String str = "nalan";//"nal) you can add scanner to this to use it as scanner
        String result = "";//"nal"
        for (int i = 0; i<=str.length()-1; i++){
           String s =""+ str.charAt(i);//s: n,a,l,a,n
          /* if (result.contains(s)){
               continue;

           */
            if (!result.contains(s)){
           }else{
               result += s;
           }

        }
        System.out.println("=================================");

        int index = str.length()-1;

        while (index>=0){
            String s =""+ str.charAt(index);

            if (!result.contains(s)){
            }else{
                result += s;
            }
            result += str.charAt(index);
            index-=1;
        }
        System.out.println(result);

    }
}
