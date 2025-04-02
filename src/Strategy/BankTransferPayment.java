package Strategy;

public class BankTransferPayment implements PaymentStrategy {
    @Override
    public void pay(double amount)
    {
        System.out.println(amount + " hrn payed by bank transfer.");
    }
}