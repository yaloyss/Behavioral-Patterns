package Mediator;

public abstract class User {
    protected BookingMediator mediator;
    protected String name;

    public User(BookingMediator mediator, String name)
    {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}
