package TemplateMethod;

public class StandardBooking extends TicketBooking {
    @Override
    protected void selectSeat()
    {
        System.out.println("Standard seat was selected.");
    }
    @Override
    protected void enterPassengerDetails()
    {
        System.out.println("Passenger details entered.");
    }
    @Override
    protected void makePayment()
    {
        System.out.println("Standard booking paid.");
    }
}