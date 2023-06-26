public class Tea implements Beverage{
   // here the implementation of each order with its price
    @Override
    public double price() {
        return 1.5;
    }
    @Override
    public String getOrder() {
        return "Tea";
    }
}
