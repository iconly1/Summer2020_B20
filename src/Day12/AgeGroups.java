package Day12;

public class AgeGroups {
    public static void main(String[] args) {
        /*
        write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED IF
         */
        int age=20;
        String ageGroup="";
        if (age>0 && age<=150){
            if (/*age>0 && */age<21){//dont need to add because it is already awnsered above
                ageGroup="Teenager";
            }else if (/* age >=21&& */ age<=55){
                ageGroup="adult";
            }else{
                ageGroup="senior";
            }

        }else{
            ageGroup="Invalid";
        }
        System.out.println(ageGroup);









    }
}
