package MachineProblem1Abstraction;

public class Order implements LazadaOnlineOrdering{
    private String customerName;
    private String shippingAddress;
    private Product selectedProduct;
    private int quantity;
    private double grossAmount;
    private double vat;
    private double totalPrice;

    public Order(String customerName, String shippingAddress, Product selectedProduct, int quantity) {
        this.customerName = customerName;
        this.shippingAddress = shippingAddress;
        this.selectedProduct = selectedProduct;
        this.quantity = quantity;
    }
    @Override
    public void computeGrossPay(){
        grossAmount = selectedProduct.getPrice() * quantity;
    }
    @Override
    public void computeVAT(){
        vat = grossAmount * 0.12;
    }
    @Override
    public void netPay(){
        totalPrice = grossAmount + vat;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getShippingAddress() {
        return shippingAddress;
    }
    public Product getProduct() {
        return selectedProduct;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getGrossAmount() {
        return grossAmount;
    }
    public double getVat() {
        return vat;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
}
