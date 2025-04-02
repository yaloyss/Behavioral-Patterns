package Visitor;

public class PremiumTicket implements Ticket {
    private double basePrice = 200;

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
