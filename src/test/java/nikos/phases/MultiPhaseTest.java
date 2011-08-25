package nikos.phases;

/**
 *
 * @author nikos
 */
public interface MultiPhaseTest {
//phases in different VM's
    void clearContents();
    void writeDataPhase();
    void checkDataPhase();
}
