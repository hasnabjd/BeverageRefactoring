public class Hot_Chocolate implements Beverage{
    // here the implementation of each order with its price

    @Override
    public double price() {
        return 1.45;
    }
    @Override
    public String getOrder() {
        return "Hot Chocolate";
    }
}
