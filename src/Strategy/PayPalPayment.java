package Strategy;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount)
    {
        System.out.println(amount + " hrn payed via PayPal.");
    }
}