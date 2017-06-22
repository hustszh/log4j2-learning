package me.ranjit.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by suzh on 6/22/2017.
 */
public class CustomXmlLocationMain {
    public static void main(String[] args) {
//        Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
        Logger logger = LogManager.getLogger("mylog");//logger尝试获得一个名称为"mylog"的Logger，如果找不到，会使用Root Logger
        for(int i = 0; i < 50000; i++) {
            logger.trace("trace level");
            logger.debug("debug level");
            logger.info("info level");
            logger.warn("warn level");
            logger.error("error level");
            logger.fatal("fatal level");
        }
        try {
            Thread.sleep(1000 * 61);
        } catch (InterruptedException e) {}
        logger.trace("trace level");
        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");
        logger.fatal("fatal level");
    }
}
