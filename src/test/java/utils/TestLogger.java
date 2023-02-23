package utils;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class TestLogger {
    private static TestLogger instance;
    private final Logger testLogger;

    private TestLogger(){
        BasicConfigurator.configure();
        testLogger = LogManager.getLogger(TestLogger.class);
    }

    public static TestLogger getInstance() {
        if (instance == null) {
            instance = new TestLogger();
        }
        return instance;
    }

    public void logInfo(String message) {
        testLogger.info(message);
    }

    public void logError(String message) {
        testLogger.error(message);
    }

}
