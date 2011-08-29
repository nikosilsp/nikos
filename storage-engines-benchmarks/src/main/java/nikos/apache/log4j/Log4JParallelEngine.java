package nikos.apache.log4j;

import nikos.util.type.PersistenceEngine;

/**
 *
 * @author nikos
 */
public class Log4JParallelEngine implements PersistenceEngine {

    public void writeData(String data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String readData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void init() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void clearPersistence() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
