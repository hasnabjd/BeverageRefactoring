public abstract class BeverageSupplements implements Beverage{
   // This class acts as a decorator


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
