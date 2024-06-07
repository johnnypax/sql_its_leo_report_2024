package it.leonardo.lez02_connessione;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mysql.cj.jdbc.MysqlDataSource;

public class App_Corretta {
	
	public static void main( String[] args )
    {
    	try {
    		MysqlDataSource ds = new MysqlDataSource();
        	ds.setUser("root");
        	ds.setPassword("toor");
        	ds.setServerName("127.0.0.1");
        	ds.setPort(3306);
        	ds.setDatabaseName("lez_recap_03_rubrica");
        	ds.setUseSSL(false);
        	ds.setAllowPublicKeyRetrieval(true);
        	
        	Connection conn = ds.getConnection();
        	
        	String nome = "Mario";
        	String cognome = "D'Amario";
        	String email = "mar@ros.com";
        	String telefono = "129";
        	
        	String query = "INSERT INTO Contatto(nome, cognome, mail, telefono) VALUES (?,?,?,?)";
        	
        	PreparedStatement ps = conn.prepareStatement(query);
        	ps.setString(1, nome);
        	ps.setString(2, cognome);
        	ps.setString(3, email);
        	ps.setString(4, telefono);
        	
        	int affRows = ps.executeUpdate();
			
			if(affRows > 0)
				System.out.println("STAPPOOOOOOOOO");
			else
				System.out.println("Inserimento non riuscito");
        	
    	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    	
    }
}
