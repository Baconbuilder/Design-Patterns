package Toppings;

import Decoration.ToppingDecorator;
import Pizzas.Pizza;

public class Sausage extends ToppingDecorator {
    Pizza pizza;

    public Sausage(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Sausage";
    }

    @Override
    public int cost() {
        return 50 + pizza.cost();
    }
}
