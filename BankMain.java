package JavaPractice;

public class BankMain {
    public static void main(String[] args) {
      BankAccount b1=new BankAccount(1, "Dhairya", 45000);
      BankAccount b2= new BankAccount(2, "Prabal", 100000);
      BankAccount b3= new BankAccount(3, "Abhishek", 230000);

      Customer c1= new Customer("Dhairya",27);
      Customer c2=new Customer("Prabal", 27);

      c1.displayCustomers();
      c2.displayCustomers();

      b1.displayAccountDetails();
      b2.displayAccountDetails();
      b3.displayAccountDetails();

      System.out.println("Total Accounts opened: "+ BankAccount.getTotalAccounts());
    }
}
