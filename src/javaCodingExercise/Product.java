package javaCodingExercise;

public class Product {
    String productName;
    double price;
    int quantity;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    } public void displayProduct() {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    } public double getTotalValue() {
        double totalValue = (price * quantity);
        System.out.println("Total Value: " + totalValue);
        return totalValue;
    } public int addStock(int amount) {
        quantity += amount;
        System.out.println("Total Quantity: " + quantity);
        return amount += quantity;
    } public static void main(String[] args){
        Product product1 = new Product("Keyboard", 750.00, 10);
        product1.getTotalValue();
        product1.addStock(500);
    }
}
