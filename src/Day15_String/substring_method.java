package Day15_String;

public class substring_method {
    public static void main(String[] args) {
        String sentence = "java is fun";
        // substring(begining index, to ending)
        String word1 = sentence.substring(0 , 4);
        String word2 = sentence.substring(8,11);
        System.out.println(word1);
        System.out.println(word2);
        System.out.println("==================================================");
        String sentence2 = " I like movies and tv series";
        String word3 = sentence2.substring(7,14);
        System.out.println(word3);
        System.out.println("========================================");
        String firstName = "MUHTAR";
       String firstCharacter = firstName.substring(0,1);
        String rest = firstName.substring(1,firstName.length());
        firstName= firstCharacter+rest.toLowerCase();
        System.out.println(firstName);
        System.out.println("====================================================");
        String firstName1 = "cANDACe";
        String firstCharacter2 = firstName1.substring(0,1);
        String rest1 = firstName1.substring(1,7);
        firstName1= firstCharacter2.toUpperCase()+rest1.toLowerCase();
        System.out.println(firstName1);
        System.out.println("==================================================");
        String lastName = "lOwLaNada";
        String firstchar = lastName.substring(0,1);//s
        String remaining = lastName.substring(1);//chool
        lastName = firstchar.toUpperCase()+remaining.toLowerCase();
        System.out.println(lastName);
        System.out.println("==================================================");

        String s = "I like Game of Thrones";
        String series = s.substring(7);
        System.out.println(series);
        System.out.println("==================================================");
        String s2 = "I like Java Programming Language";
        String language = s2.substring(7);
        System.out.println(language);


    }
}
