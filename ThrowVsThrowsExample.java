package JavaPractice;

 class InsufficientSalaryException extends Exception{
       InsufficientSalaryException(String message){
            super(message);
       }
}

public class ThrowVsThrowsExample {
    
       static void checkLoanEligibility(double salary) throws InsufficientSalaryException{
          if(salary<50000){
            throw new InsufficientSalaryException("Salary too low for load approval");
          }
          else {
            System.out.println("Loan approved!");
        }
       }
           public static void main(String[] args) {
             try{
                checkLoanEligibility(45000);

             }catch(InsufficientSalaryException e){
                System.out.println("Exception caught: "+e.getMessage());
             }

             System.out.println("Process finished:");
        }
    }

