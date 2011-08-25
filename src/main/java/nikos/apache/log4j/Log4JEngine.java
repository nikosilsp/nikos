package nikos.apache.log4j;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import nikos.util.CheckContentsUtil;
import nikos.util.type.PersistenceEngine;

import org.apache.log4j.Logger;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.spi.NOPLogger;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author nikos
 */
public class Log4JEngine implements PersistenceEngine {

    private String fileName = "Log4JEngine.log";
    private Logger internalLogger;
    private String positionInFileSystem;

    @Override
    public void init() throws IOException {
        internalLogger = Logger.getLogger(fileName);
        internalLogger.setLevel(Level.INFO);        
        internalLogger.removeAllAppenders();
        final PatternLayout layout = new PatternLayout();
        //layout.setConversionPattern();
        final FileAppender fileAppender = new FileAppender(layout, fileName);
        internalLogger.addAppender(fileAppender);        
        positionInFileSystem = CheckContentsUtil.findFile(fileName);
    }

    @Override
    public void writeData(String data) throws Exception {
        internalLogger.info(data);
    }

    @Override
    public String readData() throws Exception {
        return IOUtils.toString(new FileInputStream(positionInFileSystem));
    }

    @Override
    public void clearPersistence() throws Exception {
        final File f = new File(positionInFileSystem);
        f.delete();
    }
}
