package me.ranjit.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;

import java.io.*;

/**
 * Created by suzh on 6/22/2017.
 */
public class StartedMain {
    public static void main(String[] args) throws IOException {
        File file = new File("./config/log4j2.xml");
        BufferedInputStream is = new BufferedInputStream(new FileInputStream(file));
//        InputStream is = StartedMain.class.getClassLoader().getResourceAsStream("config/log4j2.xml");
        final ConfigurationSource source = new ConfigurationSource(is);
        Configurator.initialize(null, source);

        Logger logger = LogManager.getLogger("mylog");//logger尝试获得一个名称为"mylog"的Logger，如果找不到，会使用Root Logger
        logger.trace("trace level");
        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");
        logger.fatal("fatal level");
    }
}
