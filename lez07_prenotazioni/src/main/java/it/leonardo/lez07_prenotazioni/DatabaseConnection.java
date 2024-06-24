package it.leonardo.lez07_prenotazioni;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/hotel_booking_system";
    private static final String USER = "root";
    private static final String PASS = "admin123";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}