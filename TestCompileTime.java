package JavaPractice;

public class TestCompileTime {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum 2 integers: " +calc.add(2,5));
        System.out.println("Sum 2 doubles: "  +calc.add(40.0, 67.5));
        System.out.println("Sum 3 integers: " +calc.add(23,53,7));
    }
}
