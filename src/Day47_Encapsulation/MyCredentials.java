package Day47_Encapsulation;

public class MyCredentials {
    public static void main(String[] args) {
        Credentials obj = new Credentials("Mike",34);
        obj.setUserName("Cybertek");
        obj.setPassWord("CyberTek12345");
        System.out.println(obj.getUserName());
        System.out.println(obj.getPassWord());
        System.out.println(obj.companyName);
    }
}
