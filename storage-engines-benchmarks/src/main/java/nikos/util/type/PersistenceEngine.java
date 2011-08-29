package nikos.util.type;

/**
 *
 * @author nikos
 */
public interface PersistenceEngine {
    
    String readData() throws Exception;
    void writeData(String data) throws Exception;
    void init() throws Exception;
    void clearPersistence() throws Exception;
}
