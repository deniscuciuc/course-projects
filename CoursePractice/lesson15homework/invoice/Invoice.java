package lesson15homework.invoice;

public class Invoice {
    private String deviceModel;
    private String productDescription ;
    private int quantity;
    private double price;

    public Invoice(String deviceModel, String productDescription, int quantity, double price) {
        this.deviceModel = deviceModel;
        this.productDescription = productDescription;
        this.quantity = quantity <= 0 ? 0 : quantity;
        this.price = price <= 0.00 ? 0.00 : price;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity <= 0 ? 0 : quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price <= 0.00 ? 0.00 : price;
    }

    public double getAmount() {
        return getPrice() * (double)getQuantity();
    }

    public void displayInvoice() {
        System.out.println("\033[01mInvoice\033[0m");
        System.out.println("Model: " + getDeviceModel());
        System.out.println("Product Description: " + getProductDescription());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Price for each model: " + getPrice() + " $");
        System.out.println("Total amount: " + getAmount() + " $");
    }
}
