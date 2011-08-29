package nikos.phases.execution.log4j;

import nikos.apache.log4j.Log4JEngine;
import nikos.phases.configuration.TestConfiguration;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author nikos
 */
public class Log4JEngineReadTest {
    
    static private final Log4JEngine engine = new Log4JEngine();

    @BeforeClass
    public static void init() throws Exception {
        engine.init();
    }
    
    @Test
    public void readAndVerify() throws Exception{
        final String dataExpected = TestConfiguration.createTestData();
        final String dataRead = engine.readData().substring(0,dataExpected.length());
        System.err.println(dataRead.length());
        System.err.println(dataRead.charAt(dataRead.length()-1));
        System.err.println(dataExpected.length());
        Assert.assertEquals(dataExpected, dataRead);
        
//        final String [] dataReadArray = dataRead.split("\n"); 
//        final String [] dataExpectedArray = dataExpected.split(TestConfiguration.delimiter); 
//        Assert.assertArrayEquals(dataExpectedArray, dataReadArray);
    }
    
}
