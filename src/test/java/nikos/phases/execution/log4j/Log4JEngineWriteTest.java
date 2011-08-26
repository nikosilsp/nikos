package nikos.phases.execution.log4j;

import nikos.apache.log4j.Log4JEngine;
import nikos.phases.configuration.TestConfiguration;
import nikos.util.SuicideUtil;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author nikos
 */
public class Log4JEngineWriteTest {

    static private final Log4JEngine engine = new Log4JEngine();

    @BeforeClass
    public static void init() throws Exception {
        engine.init();
    }
    
    @Test
    public void writeAndDie() throws Exception{
        engine.writeData(TestConfiguration.createTestData());
        System.err.println("Log4JEngineWriteTest - writeAndDie - succeeded!!!");
        SuicideUtil.kill();
    }
    
}
