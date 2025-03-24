public class OrderTest {
    public static void main(String[] args) {
        Order order = new OrderAction();
        Invoice invoice = new InvoiceAction();
        Notification notification = new NotificationAction();

        OrderProcessor orderProcessor = new OrderProcessor(order, invoice, notification);
        System.out.println();
        orderProcessor.processOrder(10.0, 2, "John Doe", "123 Main St", "order_123.pdf", "johndoe@example.com");
    }
}