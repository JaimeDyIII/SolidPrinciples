public class OrderTest {
    public static void main(String[] args){
        Order order1 = new Order("Leo",
                                 "Unit 123, Something St. Malayo City",
                                 540,
                                 12,
                                 "Leopogi123@gmail.com");
        Orderable orderProcessor = new OrderProcessor();
        Calculable orderCalculator = new OrderCalculator();
        InvoiceGenerator orderInvoiceGenerator = new OrderInvoiceGenerator();
        NotificationSender emailNotificationSender = new EmailNotificationSender();
        OrderService orderService = new OrderService(orderCalculator, orderProcessor);
        
        orderService.processOrder(order1);
        orderInvoiceGenerator.generateInvoice("order1.pdf");
        emailNotificationSender.sendEmailNotification(order1.getEmail());
    }
}
