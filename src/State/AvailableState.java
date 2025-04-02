package State;

public class AvailableState implements BookingState {
    @Override
    public void book(Seat seat) {
        System.out.println("🟢 The seat is booked!");
        seat.setState(new BookedState()); //changing it's state to booked
    }

    @Override
    public void cancel(Seat seat) {
        System.out.println("❌ The seat is now available for booking.");
    }

    @Override
    public void reserve(Seat seat) {
        System.out.println("🟡 The seat is reserved, but not booked.");
        seat.setState(new ReservedState());
    }
}