public class OrderAction implements Order {

    @Override
    public void calculateTotal(double price, int quantity) {
        System.out.println("Order total: $" + (price * quantity));
    }

    @Override
    public void placeOrder(String customerName, String address) {
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}
