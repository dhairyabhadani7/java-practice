package JavaPractice;

 class InsufficientBalanceException extends Exception{
     InsufficientBalanceException(String message){
    super(message);
  }
}

class BankAccountCheck{
    private double balance;
     BankAccountCheck(double balance){
        this.balance=balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException{
          if(balance<amount){
            throw new InsufficientBalanceException("Withdrawal failed insufficient balance! ");
          }
          else{
            balance-=amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
          }
    }

}

public class CustomExceptionExample {
    public static void main(String[] args) {
        BankAccountCheck account = new BankAccountCheck(50000);
        try{
            account.withdraw(55000);

        }
        catch(InsufficientBalanceException e){
            System.out.println("Exception caught:"+e.getMessage());
        }
        System.out.println("Transaction process completed.");
    }
}
