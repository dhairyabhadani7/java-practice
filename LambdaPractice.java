package JavaPractice;

 interface MathOperation {
   int operate(int a, int b);
    
}

@FunctionalInterface
interface Printer {
    void printMessage(String message);
}

public class LambdaPractice {
    public static void main(String[] args) {
        MathOperation add =(a,b)-> a+b;
        MathOperation sub=(a,b)->a-b;
        MathOperation mul=(a,b)->a*b;

        System.out.println("Addition: " + add.operate(5, 3));
        System.out.println("Subtraction: " + sub.operate(10, 4));
        System.out.println("Multiplication: " + mul.operate(6, 7));

        Printer printer=(msg)->System.out.println("Message: "+msg);
        printer.printMessage("Lambdas are awesome");
    }
}
