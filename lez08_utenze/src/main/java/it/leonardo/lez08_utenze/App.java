package it.leonardo.lez08_utenze;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
        LoggerExample loggerExample = new LoggerExample();
        loggerExample.logMessage("Hello Giovanni");

        DatabaseManager dbManager = new DatabaseManager();
        dbManager.connect();
        dbManager.insertData("Giovanni", "Pace");
        dbManager.getData();
        dbManager.closeConnection();
    }
}
