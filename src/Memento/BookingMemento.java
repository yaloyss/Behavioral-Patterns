package Memento;

public class BookingMemento {
    private final String bookingDetails;

    public BookingMemento(String bookingDetails)
    {
        this.bookingDetails = bookingDetails; //приймаємо дані
    }

    public String getSavedBooking() //зберігаємо стан
    {
        return bookingDetails;
    }
}
