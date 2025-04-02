package ChainOfResponsibility;

class UserVerificationHandler extends BookingHandler {
    @Override
    public void handle(BookingRequest request)
    {
        if (request.isUserRegistered()) {
            System.out.println("User is verified.");
            if (nextHandler != null)
                nextHandler.handle(request);
        } else {
            System.out.println("User is not registered.");
        }
    }
}