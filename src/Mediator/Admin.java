package Mediator;

public class Admin extends User {
    public Admin(BookingMediator mediator, String name)
    {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message)
    {
        System.out.println(name + " (admin) sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message)
    {
        System.out.println(name + " (admin) received: " + message);
    }
}