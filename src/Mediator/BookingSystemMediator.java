package Mediator;
import java.util.ArrayList;
import java.util.List;

public class BookingSystemMediator implements BookingMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user)
    {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) //sending messages through mediator, not directly
    {
        for (User user : users) {
            if (user != sender) //not sending message back to the sender
            {
                user.receiveMessage(message);
            }
        }
    }
}
