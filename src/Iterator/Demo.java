package Iterator;

public class Demo {
    public static void main(String[] args) {
        SeatCollection seats = new SeatCollection();

        //receiving  SeatListIterator
        SeatIterator iterator = seats.getIterator();
        System.out.println("List of available seats: ");

        while (iterator.hasNext()) {
            System.out.println(iterator.nextSeat());
        }
    }
}