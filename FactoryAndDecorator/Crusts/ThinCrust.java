package Crusts;

import Decoration.CrustDecorator;
import Pizzas.Pizza;

public class ThinCrust extends CrustDecorator {
    Pizza pizza;

    public ThinCrust(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with thin crust";
    }

    @Override
    public int cost() {
        return 0 + pizza.cost(); // thin crust doesn't cost extra money
    }
}
