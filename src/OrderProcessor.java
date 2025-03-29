public class OrderProcessor implements Orderable {
    @Override
    public void placeOrder(String customerName, String address) {
        System.out.println("Order Placed:" +
                           "\nName: " + customerName +
                           "\nAddress: " + address);
    }
}
