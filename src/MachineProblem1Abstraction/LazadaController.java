package MachineProblem1Abstraction;

public class LazadaController {

    private LazadaView view;
    private Product[] phones;

    // Constructor
    public LazadaController(LazadaView view) {
        this.view = view;

        // Available products
        this.phones = new Product[] {
                new Product("Oppo N9 Ultra", 125_000.00),
                new Product("Vivo X300 Ultra", 118_000.00),
                new Product("Xiaomi 17 Ultra", 75_999.00),
                new Product("IPhone 17 Pro Max", 168_000.00)
        };
    }

    // Main ordering process
    public void startOrdering() {

        boolean buyAgain;

        do {

            // 1. Get customer information
            String name = view.getCustomerName();
            String address = view.getShippingAddress();

            // 2. Display products
            view.displayProducts(phones);

            // 3. Get selected product
            Product selectedProduct = view.getPhoneSelection(phones);

            // 4. Get quantity
            int quantity = view.getQuantity();

            // 5. Validate credit card
            String cardNumber;

            do {
                cardNumber = view.getCreditCardNumber();

                if (!LuhnValidator.isValid(cardNumber)) {
                    view.displayInvalidCard();
                }

            } while (!LuhnValidator.isValid(cardNumber));

            view.displayValidCard();

            // 6. Create order
            Order order = new Order(
                    name,
                    address,
                    selectedProduct,
                    quantity
            );

            // 7. Calculate payment
            order.computeGrossPay();
            order.computeVAT();
            order.netPay();

            // 8. Display order summary
            view.displayOrderSummary(order);

            // 9. Ask if customer wants to buy again
            buyAgain = view.askBuyAgain();

        } while (buyAgain);

        // End application
        view.displayThankYouMessage();
        view.closeScanner();
    }
}