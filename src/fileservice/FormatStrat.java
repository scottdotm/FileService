package fileservice;

/**
 *
 * @author Scott
 */
public interface FormatStrat {
    /**
     * Format a string to the specified format
     * @param toWrite
     * @return formatted string
     */
    public abstract String toFormat(String toWrite);
}
