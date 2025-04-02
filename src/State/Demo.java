package State;

public class Demo {
    public static void main(String[] args) {
        Seat seat = new Seat(); // Створюємо місце

        seat.reserve();
        seat.book();
        seat.cancel();
    }
}
