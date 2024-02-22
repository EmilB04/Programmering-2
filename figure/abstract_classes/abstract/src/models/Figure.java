package models;

public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    // Abstrakte metoder - metoder som ikke har en implementasjon
    public abstract double circumference();
    public abstract double area();


    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}