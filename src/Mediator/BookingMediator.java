package Mediator;

public interface BookingMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
