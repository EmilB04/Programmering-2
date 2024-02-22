//import models.Figure;
import models.Rectangle;
import models.Circle;

public class Main {
    public static void main(String[] args) {
        //Figure figure = new Figure("red");
        Rectangle rectangle1 = new Rectangle(5, 10, "blue");
        Circle circle1 = new Circle(5, "yellow");

        System.out.println("-----------------");
        System.out.println(rectangle1.circumference());
        System.out.println(rectangle1.area());

        System.out.println("-----------------");
        System.out.println(circle1.circumference());
        System.out.println(circle1.area());
        
    }
}
