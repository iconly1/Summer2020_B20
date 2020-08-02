package Day06_ComparisonOperators;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class implicit_explicit {
    public static void main(String[] args) {
        short s1 = 100;
        long l1 = s1;// implicit casting: automatically done

        long l2 = (long)s1; // manually casting. But never needed.

        int I1 = 300;
        double d1 = I1;//300
        double d2 = (double)I1;//manual casting
        System.out.println();
        System.out.println("========================");
        double D1 = 400.555;
        int D2 = (int)D1;/* manually changing a larger primitive to a smaller one is the
        // only way you can do this because it is impossible to convert larger primative
        to smaller unless you manually do it.
        */
        System.out.println(D2);
        long L1 = 4400;
        short sh1 = (short)L1;
        System.out.println(sh1);
        int n1 = 1000;
        byte b1 = (byte)n1;
        System.out.println(b1);//-24 because number is to big for byte
        double m1 = 34.5;
        float f1 = (float)m1;
        System.out.println(f1);

        long r1 = -500;
        int p1 = (int)r1;
        System.out.println(p1);





    }

}
