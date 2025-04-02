package TemplateMethod;

public abstract class TicketBooking {

    public final void bookTicket()
    {
        selectSeat();
        enterPassengerDetails();
        makePayment();
        sendConfirmation();
    }
    protected abstract void selectSeat();
    protected abstract void enterPassengerDetails();
    protected abstract void makePayment();

    private void sendConfirmation()   //mutual method for all types of booking
    {
        System.out.println("Booking confirmation was sent to you via e-mail.");
    }
}
