package it.leonardo.lez08_utenze;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerExample {
    private static final Logger logger = LogManager.getLogger(LoggerExample.class);

    public void logMessage(String message) {
        logger.info("Logging message: {}", message);
    }
}