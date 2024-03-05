import models.Circle;
import models.Rectangle;


public class Main {
    public static void main(String[] args) {
        //Figure figure = new Figure("red");
        Rectangle rectangle1 = new Rectangle(5, 10, "blue");
        Circle circle1 = new Circle(5, "yellow");

        System.out.println(rectangle1.getDrawing());
        System.out.println(circle1.getDrawing());
    }
}
