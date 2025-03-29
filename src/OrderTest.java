public class OrderTest {
    public static void main(String[] args){
        Order order1 = new Order("Leo",
                         "Unit 123, Something St. Malayo City",
                                  12,
                                 540,
                                 "Leopogi123@gmail.com");
        Orderable orderProcessor = new OrderProcessor();
        Calculable orderCalculator = new OrderCalculator();
        InvoiceGenerator orderInvoiceGenerator = new OrderInvoiceGenerator();
        NotificationSender emailNotificationSender = new EmailNotificationSender();
        OrderService orderService = new OrderService(order1, orderCalculator, orderProcessor, orderInvoiceGenerator, emailNotificationSender);
        orderService.processOrder();
    }
}
