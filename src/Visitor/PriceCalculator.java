package Visitor;

public class PriceCalculator implements TicketVisitor {
    @Override
    public void visit(StandardTicket standardTicket) {
        double finalPrice = standardTicket.getBasePrice() * 0.9; // 10% discount
        System.out.println("-- Standard ticket final price: $" + finalPrice);
    }

    @Override
    public void visit(PremiumTicket premiumTicket) {
        double finalPrice = premiumTicket.getBasePrice() * 0.85; // 15% discount
        System.out.println("⭑ Premium ticket final price: $" + finalPrice);
    }
}
