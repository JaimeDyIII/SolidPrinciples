public class OrderInvoiceGenerator implements InvoiceGenerator{
    @Override
    public void generateInvoice(String fileName) {
        System.out.println("Generating invoice...\nGenerated Invoice: " + fileName);
    }
}
