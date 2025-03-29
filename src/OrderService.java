public class OrderService {
    private Calculable calculable;
    private Orderable orderable;

    public OrderService(Calculable calculator, Orderable processor) {
        this.calculable = calculator;
        this.orderable = processor;
    }

    public void processOrder(Order order){
        orderable.placeOrder(order.getCustomerName(), order.getAddress());
        calculable.calculateTotal(order.getPrice(), order.getQuantity());
    }
}