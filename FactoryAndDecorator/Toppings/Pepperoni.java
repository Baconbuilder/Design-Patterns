package Toppings;

import Decoration.ToppingDecorator;
import Pizzas.Pizza;

public class Pepperoni extends ToppingDecorator {
    Pizza pizza;

    public Pepperoni(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Pepperoni";
    }

    @Override
    public int cost() {
        return 60 + pizza.cost();
    }
}
