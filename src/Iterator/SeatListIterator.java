package Iterator;

import java.util.List;

public class SeatListIterator implements SeatIterator {
    private List<String> seats;
    private int i = 0;

    public SeatListIterator(List<String> seats)
    {
        this.seats = seats;
    }
    @Override
    public boolean hasNext()
    {
        return i < seats.size();
    }
    @Override
    public String nextSeat()
    {
        return hasNext() ? seats.get(i++) : null;
    }
}