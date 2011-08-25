package nikos.util;

/**
 *
 * @author nikos
 */
public class SuicideUtil {

    public void kill(Thread thread) {
        thread.stop();
    }

    public void kill() {
        Runtime.getRuntime().halt(-100);
    }
}
