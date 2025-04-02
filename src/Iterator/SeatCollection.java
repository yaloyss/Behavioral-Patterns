package Iterator;
import java.util.List;

public class SeatCollection {
    private List<String> availableSeats;

    public SeatCollection()
    {
        availableSeats = List.of("A1", "A2", "B3", "C6", "F1", "E3", "D5");
    }
    public SeatIterator getIterator()
    {
        return new SeatListIterator(availableSeats);
    }
}