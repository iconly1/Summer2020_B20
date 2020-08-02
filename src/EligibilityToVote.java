public class EligibilityToVote {
    /*
    age, citizen , name
     */
    public static void vote(String name, int age ,boolean citizen, String candidateName){
        if (age>= 18 && citizen == true){
            System.out.println(name+" is eligible to vote "+candidateName);
        }else{
            System.out.println(name+" is not elidgible to vote");
        }
    }
    public static void alcoholEligibility(boolean hasId,int age){
        if (hasId==true && age>=21){
            System.out.println("You are eligible ");
        }else{
            System.out.println("not eligible");
        }
}
    public static void calculator(double num1, char operator , double num2){
        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Invalid");
                break;
        }

    }
    public static void main(String[] args) {
        vote("Ian",38,true,"Trump");
        calculator(5,'+',5);
    }
}
