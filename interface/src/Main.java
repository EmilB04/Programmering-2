import java.util.ArrayList;
import java.util.Collections;

import interfaces.Drawable;
import models.Circle;
import models.Figure;
import models.Rectangle;


public class Main {
    public static void main(String[] args) {
        //Figure figure = new Figure("red");
        Rectangle rectangle1 = new Rectangle(5, 10, "blue");
        Circle circle1 = new Circle(5, "yellow");

        System.out.println(rectangle1.getDrawing());
        System.out.println(circle1.getDrawing());

        //--------------------------------------------
        // Polymorphism
        Drawable drawable = new Circle(4.65, "white");
        System.out.println(drawable.getDrawing());

        ArrayList<Drawable> drawables = new ArrayList<>();
        drawables.add(rectangle1);
        drawables.add(circle1);

        for (Drawable drawable1 : drawables) {
            System.out.println(drawable1.getDrawing());
        }

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(circle1);
        figures.add(rectangle1);

        System.out.println("\n");
        for (Figure figureX : figures) {
            if (figureX instanceof Rectangle) {
                System.out.println("Rectangle: " + figureX.area());
            }
            else {
                System.out.println("Circle: " + figureX.area());
            }
        }

        Collections.sort(figures);

        System.out.println("\n-----Sorted list-----");
        for (Figure figureX : figures) {
            if (figureX instanceof Rectangle) {
                System.out.println("Rectangle: " + figureX.area());
            } else {
                System.out.println("Circle: " + figureX.area());
            }
        }
    }
}
