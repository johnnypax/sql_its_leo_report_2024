package it.leonardo.lez08_utenze;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
        LoggerExample loggerExample = new LoggerExample();
        loggerExample.logMessage("Hello, OWASP Dependency Checker with log4j and MySQL!");

        DatabaseManager dbManager = new DatabaseManager();
        dbManager.connect();
        dbManager.insertData("John", "Doe");
        dbManager.getData();
        dbManager.closeConnection();
    }
}
