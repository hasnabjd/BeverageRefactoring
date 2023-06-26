public class Main {
    public static void main(String[] args) {

        Beverage tea =new Tea(); //instance for a new order
        tea = new CinnamonSupplement(tea); // add the desired supplement (here cinnamon)
        System.out.println("You Ordered : " + tea.getOrder() );
        System.out.println("the total is " + tea.price() + "$");


    }
}
