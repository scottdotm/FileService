package fileservice;

//import java.io.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Scott
 */
public class CSVFileWriter implements FileWriterStrat {
    private static PrintWriter out;
    private FormatStrat fs;
    
    public CSVFileWriter(){
        fs = new CSVFormatStrat();
    }
    
    /**
     * append text to the end of the file
     * @param toWrite text to append
     * @param file file to write to
     */
    @Override
    public void writeAppend(String toWrite, File file) {
        try {
            out = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
            toWrite = fs.toFormat(toWrite);
            out.println(toWrite);
        } catch (IOException ex) {
            System.out.println("Error.");
        }
    }

    /**
     * overwrite the text to the file
     * @param toWrite text to write
     * @param file file to write to
     */
    @Override
    public void writeNoAppend(String toWrite, File file) {
        try {
            out = new PrintWriter(new BufferedWriter(new FileWriter(file, false)));
            toWrite = fs.toFormat(toWrite);
            out.println(toWrite);
        } catch (IOException ex) {
            System.out.println("Error.");
        }
    }
}
