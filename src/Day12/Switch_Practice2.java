package Day12;

public class Switch_Practice2 {
    public static void main(String[] args) {
        String productName="galaxy";
        String companyName="";
        switch (productName){
            case "galaxy":
                companyName="Samsung";
                break;
            case "iphone":
            case "MacBook":
                companyName="Apple";
                break;


        }
        System.out.println(companyName);
    }
}
