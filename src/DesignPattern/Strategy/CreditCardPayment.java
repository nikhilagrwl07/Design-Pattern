
package DesignPattern.Strategy;

public class CreditCardPayment implements PaymentMethod {

    private PaymentChannel paymentChannel;
    private String cardNumber;
    private String ccv;

    public CreditCardPayment() {
        this.paymentChannel = PaymentChannel.CreditCard;
    }

    @Override
    public boolean payment(Double amount) {

        // custom code to pay amount
        System.out.println("Payment of " + amount + " through credit card is complete");
        return true;

    }
}
