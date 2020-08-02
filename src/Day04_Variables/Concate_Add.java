package Day04_Variables;

public class Concate_Add {
    //addition: number + Number
    public static void main(String[] args) {
        System.out.println(12 + 13);// number + number.
        System.out.println('A' + 2); // 67 because it is char + 2
        System.out.println('A' + 'B');// 131 because it is 2 chars added acsII
        // Concatenation: Append
        System.out.println("12" + 13); // 1213 because 12 it in "" which makes 12 a string
        System.out.println("A" + 2); // A2 because the A is in "" makes it a string
        System.out.println("Gender: " + 'M'); // Gender: M because it is concantenaion it wont add
        System.out.println("tax: " + 3.5 + '%');//Tax: 3.5% because of concantination
        System.out.println(3.5 +'%'+"Tax" );// will return the addition because it has a number and a char then string 40.5 tax
        System.out.println(40.5 + "Tax");// 40.5 Tax concatenated


    }
}
