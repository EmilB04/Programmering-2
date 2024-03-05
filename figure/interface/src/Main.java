import java.util.ArrayList;

import models.Circle;
import models.Figure;
import models.Rectangle;


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
        
        System.out.println("-----------------");
        ArrayList<Figure> figureList = new ArrayList<>();
        figureList.add(rectangle1);
        figureList.add(circle1);
        for (Figure figureX: figureList) {
            System.out.println(figureX.toString());
        }
    }
}
