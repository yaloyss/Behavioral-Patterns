package Visitor;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Ticket> tickets = List.of(new StandardTicket(), new PremiumTicket());

        TicketVisitor priceCalculator = new PriceCalculator();
        TicketVisitor notificationSender = new NotificationSender();

        // Applying visitors to tickets
        System.out.println("Calculating ticket prices:");
        for (Ticket ticket : tickets) {
            ticket.accept(priceCalculator);
        }

        System.out.println("\nSending notifications:");
        for (Ticket ticket : tickets) {
            ticket.accept(notificationSender);
        }
    }
}
