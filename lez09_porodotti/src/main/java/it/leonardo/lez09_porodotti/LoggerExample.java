package it.leonardo.lez09_porodotti;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerExample {
	private static final Logger logger = LoggerFactory.getLogger(LoggerExample.class);

    public void logMessage(String message) {
        logger.info("Logging message: {}", message);
    }
}
