package Day33_LocalDateTime;

import java.text.DecimalFormat;


public class FormatDecimals {
    public static void main(String[] args) {
        DecimalFormat m = new DecimalFormat("0.00");
        double a = 22/8.0;
        System.out.println(a);
        System.out.println(m.format(a));
        System.out.println(m.format(5.555646544656512));
    }

}
