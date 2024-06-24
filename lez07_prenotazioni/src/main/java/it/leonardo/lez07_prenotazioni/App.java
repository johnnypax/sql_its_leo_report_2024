package it.leonardo.lez07_prenotazioni;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
        BookingService bookingService = new BookingService();

        Booking booking = new Booking("John Doe", "Suite', '', ''); DROP TABLE Booking;--", "2024-07-01", "2024-07-10");

        bookingService.addBooking(booking);

        bookingService.showBooking("<script>alert('Ciao Giovanni');</script>");
    }
}
