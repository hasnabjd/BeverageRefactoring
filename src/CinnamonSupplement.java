public class CinnamonSupplement extends BeverageSupplements {
    /* here the implementation of the added supplement
    we can add classes of supplements as many as we want*/

    private static final double CINNAMON_PRICE = 0.05;

    /* here we use the object from super class so we can manipulate the order and its price with it*/
    public CinnamonSupplement(Beverage BS) {
        super(BS);
    }

    @Override
    public double price() {
        return super.price() + CINNAMON_PRICE;
    }

    @Override
    public String getOrder() {
        return super.getOrder() + " with Cinnamon";
    }
}
