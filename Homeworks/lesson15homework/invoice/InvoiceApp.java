package lesson15homework.invoice;

public class InvoiceApp {
    public static void main(String[] args) {
        Invoice product1 = new Invoice("Logitech Wireless", "Wireless gaming mouse", 2, 69);
        Invoice product2 = new Invoice("Logitech", "Steel mouse", -2, 0);
        Invoice product3 = new Invoice("HyperX Fury", "Mouse", 4, 21);
        product1.displayInvoice();
        product2.displayInvoice();
        product3.setPrice(22);
        product3.setQuantity(-4);
        product3.displayInvoice();
    }
}
