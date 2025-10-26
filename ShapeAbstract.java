package JavaPractice;

public abstract class ShapeAbstract {
    String color;

     ShapeAbstract(String color){
         this.color =color;
    }

     abstract double calculateArea();

     void displayColor() {
        System.out.println("Shape color: " + color);
    }
}
