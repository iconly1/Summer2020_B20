package Day20_whileLoops;

public class Branching_Statements {
    public static void main(String[] args) {
        char ch = 'A';
        while (ch<='E'){
            if (ch =='C'){
                ch++;
                continue;
            }
            System.out.print(ch);
            ch++;
        }
    }
}
