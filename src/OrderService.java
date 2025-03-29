public class OrderService {
    private Order order;
    private Calculable calculable;
    private Orderable orderable;
    private InvoiceGenerator invoiceGenerator;
    private NotificationSender notificationSender;

    public OrderService(Order order, Calculable calculator, Orderable processor, InvoiceGenerator invoiceGenerator, NotificationSender notificationSender) {
        this.order = order;
        this.calculable = calculator;
        this.orderable = processor;
        this.invoiceGenerator = invoiceGenerator;
        this.notificationSender = notificationSender;
    }

    public void processOrder(){
        orderable.placeOrder(order.getCustomerName(), order.getAddress());
        calculable.calculateTotal(order.getPrice(), order.getQuantity());
        invoiceGenerator.generateInvoice("randomFileName.txt");
        notificationSender.sendEmailNotification(order.getEmail());
    }
}