package Day09;

public class MediumNumber {
    public static void main(String[] args) {

        double a= 100;
        double b= 200;
        double c= 300;

        boolean aIsmed= (a>b && a<c) || (a>c && a<b);
        boolean bIsmed= (b>c && b<a) || (b<c && b>a);
        boolean cIsmed= !aIsmed && !bIsmed;

        double med = 0;

        if (aIsmed){
            med = a;
        }
        if (bIsmed){
            med= b;
        }
        if (cIsmed){
            med= c;
        }
        System.out.println(med);







































    }

}
