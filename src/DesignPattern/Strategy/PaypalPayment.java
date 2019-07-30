
package DesignPattern.Strategy;

public class PaypalPayment implements PaymentMethod {

    private int userName;
    private int password;
    private PaymentChannel paymentChannel;

    public PaypalPayment() {
        this.paymentChannel = PaymentChannel.PayPal;
    }

    @Override
    public boolean payment(Double amount) {

        // custom code to pay amount
        System.out.println("Payment of " + amount + " through paypal is complete");
        return true;
    }
}
