package Day10_IfStatements;

public class CharacterIdentify {
    public static void main(String[] args) {
        char character = '@';
        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 172);
        boolean isDigit= (character >= 48 && character <= 57);
        boolean specialchar= isAlphabetic== false && isDigit == false;
        //
      String alphabet="";
       if (isAlphabetic){
           //System.out.println(character+ " is Alphabetic ");
           alphabet=(character+ " is Alphabetic ");
       }else{
           //System.out.println(character+" is not Alphabetic");
           alphabet=(character+" is not Alphabetic");
       }
        System.out.println(alphabet);

       String digit= "";
        if (isDigit==true){
            digit = character+" is a digit";
        }else{
            System.out.println(character+" is not a digit");
        }
        System.out.println(digit);
        String specialcharacter= "";
        if (specialchar==true){
            specialcharacter= character+ "is a special character";
        }else{
            specialcharacter = character+" is not a special character";
        }
        System.out.println(specialcharacter);

























    }
}
