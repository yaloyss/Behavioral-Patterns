package Visitor;

public interface TicketVisitor {
    void visit(StandardTicket standardTicket);
    void visit(PremiumTicket premiumTicket);
}