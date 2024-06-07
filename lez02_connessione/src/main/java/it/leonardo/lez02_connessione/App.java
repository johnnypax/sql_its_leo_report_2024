package it.leonardo.lez02_connessione;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mysql.cj.jdbc.MysqlDataSource;

/**
1. H: Le stringhe sono visibili anche nei file .class ovvero i compilati
2. H: La passsword è troppo corta
3. H: Non rispetta la regola del "least priviledge"
4. M: Scoraggiare la visualizzazione esterna delle Primary Key
5. H: SSL non abilitato

6. H: Inconsistenza del dato dovuta a mancata "validazione input"
7. H: Esposizione a SQL Injection
8. L: Mostro lo schema del DB

 */
public class App 
{
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
        	String cognome = " ', '', ''); SELECT * FROM Contatto;";
        	String email = "mar@ros.com";
        	String telefono = "124";
        	
        	//INSERT INTO Contatto(nome, cognome, mail, telefono) VALUES ('Mario', '', '', ''); SELECT * FROM Contatto;
        	String query = "INSERT INTO Contatto(nome, cognome, mail, telefono) "
        			+ "VALUES ('" + nome + "', '" + cognome + "', '" + email + "', '" + telefono + "')";
        	
        	PreparedStatement ps = conn.prepareStatement(query);
        	
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
