package JavaPractice;

public class UPIPayment implements Payment {
    public void pay(double amount){
        System.out.println("Paid Rs." + amount + " using UPI.");
    }
}
