package Mediator;

public class Demo {
    public static void main(String[] args) {
        BookingMediator mediator = new BookingSystemMediator();

        User customer1 = new Customer(mediator, "Layla");
        User admin = new Admin(mediator, "Manager");

        mediator.addUser(customer1);
        mediator.addUser(admin);

        customer1.sendMessage("I want to book a ticket.");
        admin.sendMessage("Your booking request is confirmed.");
    }
}