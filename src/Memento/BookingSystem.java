package Memento;

public class BookingSystem {
    private String bookingDetails;

    public void setBookingDetails(String details)
    {
        System.out.println(details);
        this.bookingDetails = details;
    }

    public BookingMemento saveToMemento()
    {
        return new BookingMemento(bookingDetails); //creating memento object, saving current state
    }

    public void restoreFromMemento(BookingMemento memento)
    {
        bookingDetails = memento.getSavedBooking();
        System.out.println("Restored last booking state: " + bookingDetails);
    }
}
