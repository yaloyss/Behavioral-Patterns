package Strategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount)
    {
        System.out.println(amount + " hrn payed by card.");
    }
}