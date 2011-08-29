package nikos.apache.log4j;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author nikos
 */
public class Log4JEnginePerformanceTest {

    static final Log4JEngine engine = new Log4JEngine();
    static final int numRecords = 1000000;

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

    private String[] createData() {
        final String[] stringArray = new String[numRecords];
        for (int i = 0; i < numRecords; i++) {
            stringArray[i] = new String("dummy text" + i);
        }
        return stringArray;
    }

    @Test
    public void basicWrite() throws Exception {

        final long startTime = System.currentTimeMillis();
        for (String str : createData()) {
            engine.writeData(str);
        }
        final long endTime = System.currentTimeMillis();
        System.err.println("write");
        System.err.println(endTime - startTime);
    }

    @Test
    public void basicRead() throws Exception {
        final long startTime = System.currentTimeMillis();
        final String contents = engine.readData();
        final long endTime = System.currentTimeMillis();
        System.err.println("read");
        System.err.println(endTime - startTime);

        final String [] data = contents.split("\n"); 
        int index = 0;
        for (String str : createData()) {
//assertTrue(contents.contains(str));
            assertEquals(data[index],str);
            index++;
        }
        System.err.println("done");
    }
}