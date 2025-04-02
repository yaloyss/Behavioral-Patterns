package Strategy;

public class Payment implements PaymentStrategy {
    private PaymentStrategy paymentStrategy;

    // setting payment strategy
    public void setPaymentStrategy(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy = paymentStrategy;
    }
    public void pay(double amount)
    {
        paymentStrategy.pay(amount);
    }
}