package Pizzas;

public class BigPizza extends Pizza {
    public BigPizza() {
        info = "13 inch pizza";
    }

    @Override
    public int cost() {
        return 400; // 400 NTD
    }
}
