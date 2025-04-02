package ChainOfResponsibility;

abstract class BookingHandler
{
    protected BookingHandler nextHandler;

    public void setNextHandler(BookingHandler nextHandler)
    {
        this.nextHandler = nextHandler;
    }
    public abstract void handle(BookingRequest request);
}