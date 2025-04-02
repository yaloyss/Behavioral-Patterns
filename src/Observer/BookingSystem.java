package Observer;
import java.util.ArrayList;
import java.util.List;

public class BookingSystem implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String availabilityStatus;

    @Override
    public void addObserver(Observer observer)
    {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers()
    {
        for (Observer observer : observers) {
            observer.update(availabilityStatus);
        }
    }

    // Оновлення статусу доступності
    public void setAvailabilityStatus(String status) {
        this.availabilityStatus = status;
        notifyObservers();
    }
}