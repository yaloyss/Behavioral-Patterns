package State;

public class ReservedState implements BookingState {
    @Override
    public void book(Seat seat) {
        System.out.println("🟢 The seat is confirmed and booked.");
        seat.setState(new BookedState());
    }

    @Override
    public void cancel(Seat seat) {
        System.out.println("🔴 Booking is canceled.");
        seat.setState(new AvailableState());
    }

    @Override
    public void reserve(Seat seat) {
        System.out.println("❌ The seat is already reserved.");
    }
}