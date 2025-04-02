package Observer;

public class Demo {
    public static void main(String[] args) {
        BookingSystem bookingSystem = new BookingSystem();

        User user1 = new User("May");
        User user2 = new User("Layla");

        bookingSystem.addObserver(user1);
        bookingSystem.addObserver(user2);

        bookingSystem.setAvailabilityStatus("Seats are available for booking!");
        bookingSystem.removeObserver(user1);
        //updating users again
        bookingSystem.setAvailabilityStatus("Seats booked!");
    }
}
