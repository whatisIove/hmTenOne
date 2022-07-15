package ua.ithillel.java;

/**
 * Filling content in the constructor and displaying an assortment of pizzas.
 */

public class Pizzeria {

    public String[] assortment;

    public static void main(String[] args) {

        System.out.println("\nWelcome to the pizzeria, our pizzas that we offer:\n");

        Pizza[] assortment = new Pizza[4];
        assortment[0] = new Pizza("Pepperoni", "sausage pepperoni, mozzarella, " +
                "freshly ground pepper", 20, 150);
        assortment[1] = new Pizza("Margherita", "tomato sauce, mozzarella and oregano",
                25, 180);
        assortment[2] = new Pizza("Marinara", "tomato sauce, garlic and basil",
                27.5, 184.50);
        assortment[3] = new Pizza("Carbonara", "tomato sauce, mozzarella, parmesan, eggs, bacon",
                22.5, 140);

        for (int i = 0; i < assortment.length; i++) {
            System.out.println(assortment[i]);
        }
    }
}
