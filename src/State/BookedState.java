package State;

public class BookedState implements BookingState {
    @Override
    public void book(Seat seat) {
        System.out.println("❌ The seat is already booked.");
    }

    @Override
    public void cancel(Seat seat) {
        System.out.println("🔴 Booking is canceled.");
        seat.setState(new AvailableState());
    }

    @Override
    public void reserve(Seat seat) {
        System.out.println("🟡 The seat is booked. It can be reserved.");
    }
}