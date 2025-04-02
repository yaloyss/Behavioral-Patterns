package Command;

public class CommandCancelTicket implements BookingCommand {
    private Receiver receiver;

    public CommandCancelTicket(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.cancelTicket();
    }
}