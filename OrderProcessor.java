// Order Processor: Centralized Coordinator
public class OrderProcessor {
    private final Order order;
    private final Invoice invoice;
    private final Notification notification;

    public OrderProcessor(Order order, Invoice invoice, Notification notification) {
        this.order = order;
        this.invoice = invoice;
        this.notification = notification;
    }

    public void processOrder(double price, int quantity, String customerName, String address, String fileName, String email) {
        order.calculateTotal(price, quantity);
        order.placeOrder(customerName, address);
        invoice.generateInvoice(fileName);
        notification.sendEmailNotification(email);
    }
}