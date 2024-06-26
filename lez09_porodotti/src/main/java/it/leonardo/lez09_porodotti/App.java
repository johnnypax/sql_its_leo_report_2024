package it.leonardo.lez09_porodotti;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 LoggerExample loggerExample = new LoggerExample();
         loggerExample.logMessage("Hello, OWASP Dependency Checker with SLF4J and H2 Database!");

         DatabaseManager dbManager = new DatabaseManager();
         dbManager.connect();
         dbManager.createTable();
         dbManager.insertProduct("Laptop", 999.99);
         dbManager.getProducts();
         dbManager.getProductByNameVulnerable("Laptop");
         dbManager.closeConnection();
    }
}
