package State;

public interface BookingState {
    void book(Seat seat);
    void cancel(Seat seat);
    void reserve(Seat seat);
}
