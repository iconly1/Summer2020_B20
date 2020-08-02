package Day12;

public class BiggerNumber {
    public static void main(String[] args) {
        double n1=500;
        double n2=600;
        double n3=300;
        boolean n1IsBigger= n1>2 && n1>n3;
        boolean n2IsBigger= n1IsBigger==false && n2>n3;
                              //n2>n1 && n2>n3;
        boolean n3IsBigger=!n1IsBigger&&!n2IsBigger;
                //n1IsBigger ==false && n2IsBigger==false;
      /*  String result="";
        if(n1IsBigger){
            result="n1 is bigger";
        }else if (n2IsBigger){
            result="n2 is bigger";
        }else{
            result="n3 is bigger";
        }
        System.out.println(result);
*/
        String result=(n1IsBigger)? "n1 is bigger" : (n2IsBigger)?"n2 is bigger":"n3 is bigger";

        System.out.println(result);







    }
}
