package Day09;

public class Maximum {
    public static void main(String[] args) {
        double a = 500;
        double b = 200;
        double c = 1000;

        boolean aIsMax = a>b && a>c;

        boolean bIsmax = b>a && b>c;
        boolean cIsmax = c>b && c>a;
        double max= 0;// we want to assign the maximum number to variable max

        if (aIsMax){
            max=a;
        }
        if (bIsmax){
            max=b;
        }
        if (cIsmax){
            max=c;
        }

        System.out.println(max +" is maximum number");













    }
}
