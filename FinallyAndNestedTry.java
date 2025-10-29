package JavaPractice;

public class FinallyAndNestedTry {
    public static void main(String[] args) {
        System.out.println("=== Payroll Processing ===");

        try {
            System.out.println("Opening payroll file...");

            try {
                int total = 100 / 0; // inner exception
            } 
            catch (ArithmeticException e) {
                System.out.println("Inner Catch: Division by zero error - " + e.getMessage());
            }

            System.out.println("Continuing payroll calculations...");
        } 
        catch (Exception e) {
            System.out.println("Outer Catch: General exception caught");
        } 
        finally {
            System.out.println("Finally: Closing payroll file...");
        }

        System.out.println("Payroll process complete.");
    }
}
