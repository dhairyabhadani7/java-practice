package JavaPractice;

public class CreditCardPayment implements Payment {
    public void pay(double amount){
        System.out.println("Paid Rs." + amount + " using Credit Card.");
    }
}
