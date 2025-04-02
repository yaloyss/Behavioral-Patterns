package Command;

public class CommandBookTicket implements BookingCommand {
    private Receiver receiver;

    public CommandBookTicket(Receiver receiver)
    {
        this.receiver = receiver;   //приймаємо об'єкт отримувача і зберігаєм його
    }

    @Override
    public void execute()
    {
        receiver.bookTicket();
    }
}