package day45_Constructor;

public class Sum {
    public Sum(int a, int b){
        System.out.println(a+" + "+ b +" = "+(a+b));
    }

    public Sum(double a, double b){
        System.out.println(a+" + "+ b +" = "+(a+b));
    }

    public Sum(String [] args){
        new Sum(10,20);
        new Sum(10.5,20.5);
        new Sum(10.5,30);
    }
}
