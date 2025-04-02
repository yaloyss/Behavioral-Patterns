package TemplateMethod;

public class PremiumBooking extends TicketBooking {
    @Override
    protected void selectSeat() {
        System.out.println("Premium seat was selected.");
    }

    @Override
    protected void enterPassengerDetails() {
        System.out.println("VIP passenger details with additional options entered.");
    }

    @Override
    protected void makePayment() {
        System.out.println("Premium booking paid (with additional services).");
    }
}
