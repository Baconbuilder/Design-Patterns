package Toppings;

import Decoration.ToppingDecorator;
import Pizzas.Pizza;

public class Onions extends ToppingDecorator {
    Pizza pizza;

    public Onions(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Onions";
    }

    @Override
    public int cost() {
        return 30 + pizza.cost();
    }
}
