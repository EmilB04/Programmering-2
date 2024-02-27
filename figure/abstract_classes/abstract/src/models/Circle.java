package models;

public class Circle extends Figure{
    double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }
    @Override
    public double circumference() {
        return (2 * Math.PI * radius);
    }
    @Override
    public double area() {
        return (Math.PI * (radius * radius));
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
