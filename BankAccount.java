package JavaPractice;

public class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    private static int totalAccounts=0;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;

        totalAccounts++;
    }

    public void displayAccountDetails(){
        System.out.println("Account Number: "+(this.accountNumber));
        System.out.println("Account Holder name: "+(this.holderName));
        System.out.println("Bank Balance: "+(this.balance));
        System.out.println("---------------------------------------");
    }

    public static int getTotalAccounts(){
        return totalAccounts;
    }

    
}
