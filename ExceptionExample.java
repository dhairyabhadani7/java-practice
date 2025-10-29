package JavaPractice;

public class ExceptionExample {
    public static void main(String[] args) {
        
        try {
            int a=10;
            int b=0;
            int result= a/b;
            System.out.println("Result: "+result);
        } catch (Exception e) {
            System.out.println("Error cannot divide by zero. ");
        }
        finally{
         System.out.println("Finally block executed - Close the resources.");
        }
        System.out.println("Program ended normally");
    }
}
