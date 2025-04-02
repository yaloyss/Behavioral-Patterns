package ChainOfResponsibility;

class PaymentHandler extends BookingHandler {
    @Override
    public void handle(BookingRequest request)
    {
        if (request.getUserBalance() >= request.getTicketPrice()) {
            System.out.println("Booking confirmed!");
        } else {
            System.out.println("Booking unsuccessful. Not enough money.");
        }
    }
}