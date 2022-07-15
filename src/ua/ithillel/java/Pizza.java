package ua.ithillel.java;

/**
 * The name of the pizza name fields, its composition, price. A constructor that takes as parameters the name,
 * composition, price, and diameter of the pizza. Inside the constructor is an object of class Circle that
 * takes a diameter and is also output.
 */

public class Pizza {

    private String name; //название пиццы.
    private String composition; // состав пиццы.
    private double cost; // цена.
    private Circle basis; // поле типа Circle.

    public Pizza(String name, String composition, double diameter, double cost) {
        this.name = name;
        this.composition = composition;
        this.basis = new Circle(diameter);
        this.cost = cost;
        System.out.println("\nPizza name: " + name);
        System.out.println("Composition: " + composition);
        System.out.println("Diameter: " + diameter);
        System.out.println("Cost: " + cost + "\n");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Circle getBasis() {
        return basis;
    }

    public void setBasis(Circle basis) {
        this.basis = basis;
    }
}
