package Factory;

// abstract factory
public abstract class MakeOrder {
    protected abstract Object makeOrder(String option, Object order);

    public Object orderRequestedOrder(String type, Object order) {
        order = makeOrder(type, order);
        return order;
    }
}
