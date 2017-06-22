package me.ranjit.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by suzh on 6/22/2017.
 */
public class AsyncMain {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger("asynclog");
        logger.trace("trace level");
        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");
        logger.fatal("fatal level");
    }
}
