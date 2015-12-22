package fileservice;
//import java.io.*;

import java.io.File;

/**
 *
 * @author Scott
 */
public interface FileReaderStrat {
    /**
     * 
     * @param file
     * @return the line of text specified
     */
    public abstract String readLine(File file, int line);
    
    /**
     * 
     * @param file
     * @return print the entire contents of the file
     */
    public abstract void readAll(File file);
}
