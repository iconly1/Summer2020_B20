package Day05_ArithmeticOperators;



public class EmployeeInfo {
    /* 1. create a class named EmployeeInfo
                    declare the following variables:
                             firstName
                             lastName
                             gender
                             age
                             companyName
                             jobTitle
                             isFullTime
                             isMarried
                             salary
            write a program that can display the full info of the employee
                    ex:
                             firstName = John
                             lastName = Daniel
                             gender = Male
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50
             output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: Male
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false
*/


    public static void main(String[] args) {

        String firstName = "John";
        String lastName = "Daniel";
        char gender = 'M';
        int age = 35;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 120_000.50;


        System.out.println("Employee' full name is: " + firstName+" "+ lastName );
        System.out.println(firstName+" "+ lastName+"' gender is: "+ gender);
        System.out.println(firstName+" "+ lastName+"' age is: "+ age);
        System.out.println(firstName+" "+ lastName+" works at: "+companyName);
        System.out.println(firstName+" "+ lastName+"' job title is: "+jobTitle );
        System.out.println(firstName+" "+lastName+"' salary is: $"+salary);
        System.out.println(firstName+" "+lastName+" is full time employee: "+isFullTime);
        System.out.println(firstName+" "+lastName+" is married: "+ isMarried);







    }



}
