
package DesignPattern.Strategy;

public class MainDriver {
    public static void main(String[] args) {

        Item item1 = new Item("Hair Oil", 10.0);
        Item item2 = new Item("Shampoo", 12.0);
        Item item3 = new Item("Bread", 6.0);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        shoppingCart.addItem(item3);

        PaymentMethod paypalPayment = new PaypalPayment();
        PaymentMethod creditPayment = new CreditCardPayment();

        // Dependency Injection Pattern
        CheckoutService checkoutService = new CheckoutService(paypalPayment, creditPayment, shoppingCart);

        checkoutService.completePayment(PaymentChannel.PayPal);
        checkoutService.completePayment(PaymentChannel.CreditCard);
    }
}
