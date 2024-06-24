package it.leonardo.lez06_simple_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
        try {
            String dbURL = "jdbc:mysql://localhost:3306/lez_recap_03_rubrica";
            String user = "root";
            String pass = "password"; // Password esposta

            Connection conn = DriverManager.getConnection(dbURL, user, pass);

            String nome = "Luigi";
            String cognome = " ', '', ''); DROP TABLE Contatto;--";
            String email = "luigi@fake.com";
            String telefono = "456";

            String query = "INSERT INTO Contatto(nome, cognome, mail, telefono) "
                    + "VALUES ('" + nome + "', '" + cognome + "', '" + email + "', '" + telefono + "')";

            PreparedStatement ps = conn.prepareStatement(query);

            int affRows = ps.executeUpdate();

            if (affRows > 0)
                System.out.println("Inserimento riuscito");
            else
                System.out.println("Inserimento non riuscito");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
