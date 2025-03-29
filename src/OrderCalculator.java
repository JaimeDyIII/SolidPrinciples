public class OrderCalculator implements Calculable {
    @Override
    public void calculateTotal(double price, int quantity) {
        System.out.println("Item price: ₱" + price + "\nItem Quantity: " + quantity);
        System.out.println("Total for the order is: ₱" + (price * quantity));
    }
}
