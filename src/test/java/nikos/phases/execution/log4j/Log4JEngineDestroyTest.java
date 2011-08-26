package nikos.phases.execution.log4j;

import nikos.apache.log4j.Log4JEngine;
import org.junit.Test;

/**
 *
 * @author nikos
 */
public class Log4JEngineDestroyTest {

    @Test
    public void init() throws Exception {
        final Log4JEngine engine = new Log4JEngine();
        engine.init();
        engine.clearPersistence();
    }
}
