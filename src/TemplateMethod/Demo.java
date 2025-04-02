package TemplateMethod;

public class Demo {
    public static void main(String[] args) {
        System.out.println("-- Standard booking:");
        TicketBooking standard = new StandardBooking();
        standard.bookTicket();

        System.out.println("\n⭑ Premium booking:");
        TicketBooking premium = new PremiumBooking();
        premium.bookTicket();
    }
}

