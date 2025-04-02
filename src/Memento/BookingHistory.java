package Memento;
import java.util.Stack;

public class BookingHistory {
    private final Stack<BookingMemento> history = new Stack<>();

    public void save(BookingMemento memento)
    {
        history.push(memento);
    }

    public BookingMemento undo()
    {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}