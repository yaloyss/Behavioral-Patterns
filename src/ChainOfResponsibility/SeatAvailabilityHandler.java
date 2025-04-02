package ChainOfResponsibility;

class SeatAvailabilityHandler extends BookingHandler {
    @Override
    public void handle(BookingRequest request)
    {
        if (request.getAvailableSeats() > 0) {
            System.out.println("There are available seats.");
            if (nextHandler != null)
                nextHandler.handle(request);
        } else {
            System.out.println("There are no available seats.");
        }
    }
}