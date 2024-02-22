package models;

public class Rectangle extends Figure {
    private double length;
    private double width;    
    
    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    public double circumference() {
        return (length + width);
    }
    @Override
    public double area() {
        return (length * width);
    }

    public double getLength() {
        return length;
    }
    public void setlength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

}
