package Pizzas;

public class SmallPizza extends Pizza {
    public SmallPizza() {
        info = "9 inch pizza";
    }

    @Override
    public int cost() {
        return 300; // 300 NTD
    }
}
