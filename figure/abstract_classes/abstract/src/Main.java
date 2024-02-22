//import models.Figure;
import models.Rectangle;
import models.Circle;

public class Main {
    public static void main(String[] args) {
        //Figure figure = new Figure("red");
        Rectangle rectangle1 = new Rectangle(5, 10, "blue");
        System.out.println(rectangle1.getColor());

        Circle circle1 = new Circle(5, "yellow");
        System.out.println(circle1);
    }
}
