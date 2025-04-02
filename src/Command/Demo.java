package Command;

public class Demo {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        BookingCommand bookCommand = new CommandBookTicket(receiver);
        BookingCommand cancelCommand = new CommandCancelTicket(receiver);

        Invoker invoker = new Invoker();

        invoker.setCommand(bookCommand); //передаємо інвокеру команду для бронювання квитка
        invoker.executeCommand();

        invoker.setCommand(cancelCommand);
        invoker.executeCommand();
    }
}
