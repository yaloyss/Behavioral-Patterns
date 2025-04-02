package Memento;

public class Demo {
    public static void main(String[] args) {
        BookingSystem bookingSystem = new BookingSystem();
        BookingHistory history = new BookingHistory();

        System.out.println("Booking state: ");
        bookingSystem.setBookingDetails("Naya - Seat F6");
        history.save(bookingSystem.saveToMemento());

        bookingSystem.setBookingDetails("Leon - Seat D2");
        history.save(bookingSystem.saveToMemento());

        bookingSystem.setBookingDetails("Roxy - Seat C3");

        System.out.println("\nUndoing last booking:");
        bookingSystem.restoreFromMemento(history.undo());

        System.out.println("\nUndoing booking again:");
        bookingSystem.restoreFromMemento(history.undo());
    }
}
