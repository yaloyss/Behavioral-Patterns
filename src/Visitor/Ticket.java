package Visitor;

public interface Ticket {
    void accept(TicketVisitor visitor);
}
