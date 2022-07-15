package ua.ithillel.java;

/**
 * Initialization and execution of the program according to three options using only a constructor,
 * an empty constructor and its filling, a test of common values.
 */

public class Main {
    public static void main(String[] args) {

        // using the constructor where the radius and color are specified for automatic calculation
        Circle circle = new Circle(3.5, "Red");
        System.out.println(circle);

        // for empty constructor test
        Circle circle2 = new Circle();
        circle2.setRadius(2.7);
        System.out.println("\nCircle radius is: " + circle2.getRadius());
        double area = Math.PI * (circle2.getRadius() * circle2.getRadius());
        System.out.println("The area of the circle is: " + area);
        double circumference = Math.PI * 2 * circle2.getRadius();
        System.out.println("The circumference is equal to: " + circumference);
        circle2.setColor("Blue");
        System.out.println("Circle color is: " + circle2.getColor() + "\n");

        // test through getters and setters, through specifying the radius in the constructor
        Circle circle3 = new Circle(1.5);
        circle3.setCircumference(5.5);
        circle3.setArea(11.5);
        circle3.setColor("White");
        System.out.println("Circle radius is: " + circle3.getRadius());
        System.out.println("The area of the circle is: " + circle3.getArea());
        System.out.println("The circumference is equal to: " + circle3.getCircumference());
        System.out.println(circle3.getColor());

    }
}