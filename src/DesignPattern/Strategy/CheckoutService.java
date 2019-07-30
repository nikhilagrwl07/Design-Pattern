package DesignPattern.Strategy;

public class CheckoutService {

    private PaymentMethod paypalPayment;
    private PaymentMethod creditCardPayment;
    private ShoppingCart shoppingCart;

    public CheckoutService(PaymentMethod paypalPayment, PaymentMethod creditCardPayment, ShoppingCart shoppingCart) {
        this.paypalPayment = paypalPayment;
        this.creditCardPayment = creditCardPayment;
        this.shoppingCart = shoppingCart;
    }

    public boolean completePayment(PaymentChannel paymentChannel){

        Double amount = shoppingCart.getTotal();

        if(paymentChannel==PaymentChannel.CreditCard){
            return creditCardPayment.payment(amount);
        }
        else if(paymentChannel==PaymentChannel.PayPal){
            return paypalPayment.payment(amount);
        }
        else
        {
            throw new UnknownPaymentChannelException("Payment channel not found.");
        }
    }
}
