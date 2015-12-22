package fileservice;
//import java.io.*;

import java.io.File;


/**
 *
 * @author Scott
 */
public interface FileWriterStrat {
    /**
     * append the String to the file
     * @param toWrite
     * @param file 
     */
    public abstract void writeAppend(String toWrite, File file);
    
    /**
     * overwrite the file with the String
     * @param toWrite
     * @param file 
     */
    public abstract void writeNoAppend(String toWrite, File file);
}
