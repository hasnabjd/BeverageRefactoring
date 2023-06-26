public abstract class BeverageSupplements implements Beverage{
    // here the implementation of each order with its price

    protected Beverage BS;

    public BeverageSupplements(Beverage BS) {
        this.BS = BS;
    }

    @Override
    public double price() {
        return BS.price();
    }

    @Override
    public String getOrder() {
        return BS.getOrder();
    }

}
