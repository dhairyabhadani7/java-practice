package JavaPractice;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1=sc.nextDouble();
        System.out.println("Enter the second number");
        double num2=sc.nextDouble();
        System.out.println("Choose the operators +, -, * and /");
        String operator=sc.next();

        switch (operator) {
            case "+":
                   System.out.println(num1+num2);
                
                break;
            case "-":
                  System.out.println(num1-num2);
                
                break;
            case "*":
                   System.out.println(num1*num2);
                
                break;
            case "/":
                   if(num2!=0){
                       System.out.println(num1/num2);
                   }
                   else{
                    System.out.println("Cannot divide by zero!");

                    sc.close();
                    return;
                   }
                break;
            default:
              System.out.println("Invalid operator selected ");
                sc.close();
                return;
        }
        sc.close();
    }
}
