package nikos.util;

/**
 *
 * @author nikos
 */
public abstract class SuicideUtil {

    static public void kill(Thread thread) {
        thread.stop();
    }

    static public void kill() {
        Runtime.getRuntime().halt(-100);
    }
}
