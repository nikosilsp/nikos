package nikos.phases.configuration;

/**
 *
 * @author nikos
 */
public abstract class TestConfiguration {

    final public static int writeSize = 100;
    final public static int entrySize = 5;
    final public static String dataUnit = "@#$ZX";
    final public static String delimiter = "\n";

    public static final String createTestData() {
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < writeSize; i++) {
            for (int j = 0; j < entrySize; j++) {
                builder.append(dataUnit);
                builder.append(j);
                builder.append(i);
                builder.append(delimiter);
            }
        }
        return builder.toString();
    }
}
