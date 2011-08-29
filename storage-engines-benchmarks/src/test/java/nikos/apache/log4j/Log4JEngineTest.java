package nikos.apache.log4j;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static junit.framework.Assert.assertTrue;

/**
 *
 * @author nikos
 */
public class Log4JEngineTest {

    static final Log4JEngine engine = new Log4JEngine();

    @AfterClass
    static public void clearRecordsAfter() throws Exception {
        engine.init();
        engine.clearPersistence();
    }

    @BeforeClass
    static public void clearRecordsBefore() throws Exception {
        engine.init();
        engine.clearPersistence();
        engine.init();
    }

    @Test
    public void basicWrite() throws Exception {
        engine.writeData("mother fucker-1");
        engine.writeData("mother fucker-2");
    }

    @Test
    public void basicRead() throws Exception {
        final String contents = engine.readData();
        assertTrue(contents.contains("mother fucker-1"));
        assertTrue(contents.contains("mother fucker-2"));
    }
}
