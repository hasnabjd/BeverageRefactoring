public class Coffee implements Beverage {
    //here the implementation of each order with its price
    @Override
    public double price() {
        return 1.20;}

        @Override
        public String getOrder () {
            return "Coffee";
        }
    }
