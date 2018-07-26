package com.revature.overknight.utils;

/* NOTE: Since the class name is the same as the Log4J Logger class, we must specify the Log4J package structure below */

/**
 * This class uses the Log4J Logger to log messages and errors. It is a utility class so that you don't have to
 * initialize a Logger instance at the top of every class, merely call Logger.log() with the appropriate arguments
 * wherever you need to log something.
 */
public class Logger {
    public enum Severity {
        FATAL, ERROR, WARN, INFO, DEBUG, TRACE
    }

    /**
     * This method will log the message in the log defined by log4j.properties
     * @param callingClass the class initiating the log call
     * @param message the message to be printed to the log
     * @param level the severity level of the log, can be one of: FATAL, ERROR, WARN, INFO, DEBUG, TRACE
     */
    public static void log(Class callingClass, String message, Severity level){
        org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(callingClass);    //TODO: Efficiency? Is there a method to simply change the Class type?
        switch (level){
            case FATAL: logger.fatal(message); break;
            case ERROR: logger.error(message); break;
            case WARN: logger.warn(message); break;
            case INFO: //case 4 is also the default.
            default: logger.info(message); break;
            case DEBUG: logger.debug(message); break;
            case TRACE: logger.trace(message); break;
        }
    }

    /**
     * This method will log the message in the log defined by log4j.properties, with a Severity level of DEBUG
     * @param callingClass the class initiating the log call
     * @param message the message to be printed to the log
     */
    public static void log(Class callingClass, String message){
        log(callingClass, message, Severity.DEBUG);
    }

    /**
     * This method is specifically for logging exceptions, which will use the ERROR severity level.
     * @param callingClass The class calling the Logger
     * @param e the Exception being thrown
     */
    public static void log(Class callingClass, Exception e){
        e.printStackTrace();    //Keep this so we still see errors in the console.

        StringBuilder sb = new StringBuilder();
        sb.append(e.getClass().getSimpleName()).append(" encountered: ").append(e.getMessage()).append("\n");
        for (StackTraceElement element : e.getStackTrace()){
            if (!"java.base".equals(getModuleName(element))) {
                sb.append(String.format("%10s", "at ")).append(element.toString()).append("\n");
            }
        }
        org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(callingClass);
        logger.info(sb.toString());
    }

    /**
     * NOTE: If using Java 9+, replace this method with element.getModuleName(). It was added to the StackTraceElement class.
     * @param element the StackTraceElement being analyzed
     * @return a String representing the module name, if it exists, if not, then the whole element.toString()
     */
    private static String getModuleName(StackTraceElement element){
        return element.toString().split("/")[0];
    }

}
