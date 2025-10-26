package JavaPractice;

public class RectangleAbstract extends ShapeAbstract {
    double length,width;
    RectangleAbstract(String color, double length, double width){
        super(color);
        this.length=length;
        this.width=width;
    }

    double calculateArea(){
        return length*width;
    }
    
}
