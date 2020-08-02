package Day28_Recap;

public class RemoveDuplicates {
    public static void removeDup(String str){//"abab"
        String nonDup = "";//"ab"
        for (String each:str.split("")){
            if (!nonDup.contains(each)){
              nonDup+=each;
            }
        }
        System.out.println(nonDup);
    }

    public static void main(String[] args) {
        String str= "abab";
        removeDup(str);
    }
}
