package State;

public class Seat {
    private BookingState state;

    public Seat() {
        state = new AvailableState(); //at the start it's available for booking
    }

    public void setState(BookingState state) {
        this.state = state;
    }

    public void book() {
        state.book(this);
    }

    public void cancel() {
        state.cancel(this);
    }

    public void reserve() {
        state.reserve(this);
    }
}