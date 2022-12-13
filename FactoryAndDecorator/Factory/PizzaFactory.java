package Factory;

import Pizzas.*;
import Crusts.*;
import Toppings.*;

//concrete
public class PizzaFactory extends MakeOrder {

    @Override
    protected Object makeOrder(String option, Object order) {
        if (option.equals("small")) {
            order = new SmallPizza();
        } else if (option.equals("big")) {
            order = new BigPizza();
        } else if (option.equals("CheeseCrust")) {
            order = new CheeseCrust((Pizza) order);
        } else if (option.equals("ThickCrust")) {
            order = new ThickCrust((Pizza) order);
        } else if (option.equals("ThinCrust")) {
            order = new ThinCrust((Pizza) order);
        } else if (option.equals("Bacon")) {
            order = new Bacon((Pizza) order);
        } else if (option.equals("Mushrooms")) {
            order = new Mushrooms((Pizza) order);
        } else if (option.equals("Onions")) {
            order = new Onions((Pizza) order);
        } else if (option.equals("Pepperoni")) {
            order = new Pepperoni((Pizza) order);
        } else if (option.equals("Sausage")) {
            order = new Sausage((Pizza) order);
        }
        return (Pizza) order;

    }
}