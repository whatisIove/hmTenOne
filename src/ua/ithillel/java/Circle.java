package ua.ithillel.java;

/**
 * The area and circumference parameters are calculated in the constructor based on the radius and Pi.
 * Values can also be set manually, on the output we get all the information about the circle.
 */

public class Circle {

    private double radius;
    private double circumference;
    private double area;
    private String color;
    private double diameter;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        System.out.println("\nCircle radius is: " + radius);
        area = Math.PI * (radius * radius);
        System.out.println("The area of the circle is: " + area);
        circumference = Math.PI * 2 * radius;
        System.out.println("The circumference is equal to: " + circumference);
        System.out.println("Circle color is: " + color);

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
