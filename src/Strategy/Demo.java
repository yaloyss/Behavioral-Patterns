package Strategy;

public class Demo {
    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.setPaymentStrategy(new CreditCardPayment());
        payment.pay(399.98);

        payment.setPaymentStrategy(new PayPalPayment());
        payment.pay(989.99);

        payment.setPaymentStrategy(new BankTransferPayment());
        payment.pay(654.3);
    }
}
