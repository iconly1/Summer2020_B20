package Day12;

public class DaysInMonths {
    public static void main(String[] args) {
        int month=6;
        String days="";
        switch (month){
            case 4:
            case 6:
            case 9:
            case 11:
                days="30 Days";
                break;
            case 2:
                days="28 Days";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days="31 Days";
                break;
            default:
                days="Invalid";
        }
        System.out.println(days);












    }
}
