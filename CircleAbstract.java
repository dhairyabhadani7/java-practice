package JavaPractice;

public class CircleAbstract extends ShapeAbstract {
    double radius;
   
    CircleAbstract(String color,double radius){
    super(color);
    this.radius=radius;
    }

     double calculateArea(){
       return Math.PI * radius * radius;
    }
}
