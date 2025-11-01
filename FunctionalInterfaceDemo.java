package JavaPractice;

@FunctionalInterface
 interface Greeting{
    void sayHello(String name);
 }

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Greeting greeting = (name)->System.out.println("Hello: "+name);
        greeting.sayHello("Dhairya");
        greeting.sayHello("Prabal");

        //Built in Functional Interface
        // 1. Predicate takes input and returns Boolean (Ex. filter())
        // 2. Function takes Input T and return output R (Ex. map())
        // 3. Consumer takes input but returns void(Ex. forEach(), andThen()) 
        // 4. Supplier takes no input and return output(Ex. get())

    }
}
