package models;

import interfaces.Drawable;

public abstract class Figure implements Drawable, Comparable<Figure>{
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return ("This figure has a cirmumference of " + circumference() + " and an area of " + area());
    }
    @Override
    public int compareTo(Figure o) {
        /*
        if (this.area() > o.area()) {
        return 1;
        }
        else if (this.area() < o.area()) {
        return -1;
        }
        else {
        return 0;
        }
        */   
        // Disse gjør det samme
        Double.compare(this.area(), o.area());
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