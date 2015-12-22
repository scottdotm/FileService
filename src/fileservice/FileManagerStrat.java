package fileservice;

/**
 *
 * @author Scott
 */

public interface FileManagerStrat {
    /**
     * append text to the end of the file
     * @param toWrite text to append
     * @param mode
     * 
     */
    public abstract void writeAppend(String toWrite, int mode);
    
    /**
     * overwrite the text to the file
     * @param toWrite text to write
     * @param mode
     */
    public abstract void writeNoAppend(String toWrite, int mode);
    
    /**
     * read a specific line from the file
     * @param line the line to be read, starting with 1
     * @param mode
     * @return the specified line as a String
     */
    public abstract String readLine(int line, int mode);
    
    /**
     * read all lines from the file
     */
    public abstract void readAll();
}
