package it.leonardo.lez07_prenotazioni;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookingService {

    public void addBooking(Booking booking) {
        try {
            Connection conn = DatabaseConnection.getConnection();

            String query = "INSERT INTO Booking(customer_name, room_type, check_in_date, check_out_date) VALUES ('"
                    + booking.getCustomerName() + "', '" + booking.getRoomType() + "', '"
                    + booking.getCheckInDate() + "', '" + booking.getCheckOutDate() + "')";

            PreparedStatement ps = conn.prepareStatement(query);

            int affRows = ps.executeUpdate();

            if (affRows > 0)
                System.out.println("Prenotazione riuscita");
            else
                System.out.println("Prenotazione non riuscita");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void showBooking(String customerName) {
        try {
            Connection conn = DatabaseConnection.getConnection();

            String query = "SELECT * FROM Booking WHERE customer_name = '" + customerName + "'";

            PreparedStatement ps = conn.prepareStatement(query);

            // Esecuzione e gestione della query omessa per brevità

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}