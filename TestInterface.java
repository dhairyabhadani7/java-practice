package JavaPractice;

public class TestInterface {
    public static void main(String[] args) {
        
  
    Payment creditCard=new CreditCardPayment();
    Payment upi= new UPIPayment();

    creditCard.pay(2310.07);
    upi.pay(4324.93);
      }
}
