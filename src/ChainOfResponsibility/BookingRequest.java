package ChainOfResponsibility;

class BookingRequest {
    private int availableSeats;
    private boolean userRegistered;
    private double userBalance;
    private double ticketPrice;

    public BookingRequest(int availableSeats, boolean userRegistered, double userBalance, double ticketPrice) {
        this.availableSeats = availableSeats;
        this.userRegistered = userRegistered;
        this.userBalance = userBalance;
        this.ticketPrice = ticketPrice;
    }

    public int getAvailableSeats() {
        return availableSeats; }

    public boolean isUserRegistered() {
        return userRegistered; }

    public double getUserBalance() {
        return userBalance; }

    public double getTicketPrice() {
        return ticketPrice; }
}