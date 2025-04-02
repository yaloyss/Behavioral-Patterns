package ChainOfResponsibility;

public class Demo {
    public static void main(String[] args) {
        BookingHandler seatCheck = new SeatAvailabilityHandler();
        BookingHandler userCheck = new UserVerificationHandler();
        BookingHandler paymentCheck = new PaymentHandler();

        seatCheck.setNextHandler(userCheck);
        userCheck.setNextHandler(paymentCheck);

        BookingRequest request = new BookingRequest(5, true, 100, 50);
        seatCheck.handle(request);  // starting to check seat availability (from first handler)
    }
}
