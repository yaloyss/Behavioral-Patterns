package Mediator;

public class Customer extends User {
    public Customer(BookingMediator mediator, String name)
    {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message)
    {
        System.out.println(name + " (customer) sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message)
    {
        System.out.println(name + " (customer) received: " + message);
    }
}
