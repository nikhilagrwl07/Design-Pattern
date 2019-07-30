

package DesignPattern.Strategy;

public class UnknownPaymentChannelException extends RuntimeException {
    public UnknownPaymentChannelException(String message) {
        super(message);
    }
}
