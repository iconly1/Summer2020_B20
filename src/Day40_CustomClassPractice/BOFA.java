package Day40_CustomClassPractice;

public class BOFA {
    public static void main(String[] args) {

        BankAccount Ian = new BankAccount();
        Ian.setAccountInfo("Savings","Ian Coxon","5553573311");
        Ian.getAccountInfo();
        Ian.deposit(100000);
        Ian.checkBalance();
        Ian.withDraw(500000);
        Ian.checkBalance();





    }
}
