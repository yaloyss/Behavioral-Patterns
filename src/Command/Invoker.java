package Command;

class Invoker {   // відправник
    private BookingCommand command;

    public void setCommand(BookingCommand command)
    {
        this.command = command;
    }
    public void executeCommand()
    {
        command.execute();
    }
}