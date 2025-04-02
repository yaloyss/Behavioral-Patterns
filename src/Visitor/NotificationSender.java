package Visitor;

public class NotificationSender implements TicketVisitor {
    @Override
    public void visit(StandardTicket standardTicket) {
        System.out.println("Notification sent for standard ticket.");
    }

    @Override
    public void visit(PremiumTicket premiumTicket) {
        System.out.println("VIP notification sent for premium ticket.");
    }
}
