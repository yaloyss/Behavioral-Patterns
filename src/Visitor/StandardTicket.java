package Visitor;

public class StandardTicket implements Ticket {
    private double basePrice = 100;

    public double getBasePrice()
    {
        return basePrice;
    }

    @Override
    public void accept(TicketVisitor visitor)
    {
        visitor.visit(this);
    }
}
