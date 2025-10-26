package JavaPractice;

public class TestAbstraction {
    public static void main(String[] args) {
        
  
    ShapeAbstract circle= new CircleAbstract("Green", 5.0);
    ShapeAbstract rectangle= new RectangleAbstract("purple", 5.0, 4.0);

        circle.displayColor();
        System.out.println("Area of circle: " + circle.calculateArea());

        rectangle.displayColor();
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
  }
}
