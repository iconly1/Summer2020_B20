package Day13_Scanner;

public class Browsers {
    public static void main(String[] args) {
      String browserName= "safari";
      //boolean, long, double, float will not compile in switch
        switch(browserName){
            case "chrome":
                System.out.println("Opening Chrome Browser");
            break;
            case "firefox":
                System.out.println("Opening Firefox Browser");
            break;
            case "opera":
                System.out.println("Opening Opera Browser");
            break;
            case "safari":
                System.out.println("Opening Safari Browser");
            break;
            case "Edge":
                System.out.println("Opening Edge Browser");
            break;
            default:
                System.out.println("Invalid Browser Name");




        }
    }
}
