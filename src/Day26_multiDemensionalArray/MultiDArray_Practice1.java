package Day26_multiDemensionalArray;

import java.util.Arrays;

public class MultiDArray_Practice1 {
    public static void main(String[] args) {
        String [] testers = {"Liliia","Odina","Cristina","Elkem"};
        String [] developers = {"Ahmet","Efran","Roza","Sarah"};
        String [] SM ={"Nurmamet"};
        String [] PO ={"Nadir"};
        String [] BA ={"Alex"};
        String [] testers2 = {"Irene","Aslan","Nazar"};
        String [][] scrumTeam = {testers,developers,SM,PO,BA};
    scrumTeam[4][0]="adam";//name change
    scrumTeam [1][2]= "Emine";// name change
    scrumTeam[0]=testers2;  // tester team change
        System.out.println(Arrays.deepToString(scrumTeam));
        System.out.println("===============================");
        for (String[] each:scrumTeam ) {
            for (String name :each) {
                System.out.println(name);
            }
            //System.out.println(Arrays.toString(each));

        }


        System.out.println("===================================");


        int[][] scores = { {10, 20, 30, 45}, {60, 55, 75, 105,20,3}, {93, 48, 125, 135}   };
            // print out numbers that are divisible by 3 or 5
        for (int[] each1DArray:scores) {
            for (int eachElement:each1DArray) {
                if(eachElement %3 == 0 && eachElement % 5 == 0){
                    System.out.println(eachElement);
                }

            }

        }

        System.out.println("===============================================");
        int[][] a1 = { {10, 20, 30, 45}, {60, 55, 75, 105,20,3}, {93, 48, 125, 135}   };
        int[][] a2 = { {10, 20, 30, 45}, {60, 55, 75, 105,20,3}, {93, 48, 125, 135}   };
        int[][] a3 = { {10, 20, 30, 45}, {60, 55, 75, 105,20,3}, {93, 48, 125, 135}   };
int [][][] arr3D = {a1,a2,a3};

    }
}
