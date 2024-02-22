import models.Figure;
import models.Rectangle;

public class Main {
    public static void main(String[] args) {
        //Figure figure = new Figure("red");
        Rectangle rectangle1 = new Rectangle(5, 10, "blue");
        System.out.println(rectangle1.getColor());
    }
}
