package fileservice;

//import java.io.*;

import java.io.File;


/**
 *
 * @author Scott
 */
public class SimpleFileManager implements FileManagerStrat{
    private FileReaderStrat fr;
    private FileWriterStrat fw;
    private File data;
    
    public SimpleFileManager(String filePath, FileReaderStrat fr, FileWriterStrat fw){
        data = new File(filePath);
        this.fw = fw;
        this.fr = fr;
    }

    public FileReaderStrat getFr() {
        return fr;
    }

    public void setFr(FileReaderStrat fr) {
        this.fr = fr;
    }

    public FileWriterStrat getFw() {
        return fw;
    }

    public void setFw(FileWriterStrat fw) {
        this.fw = fw;
    }

    public File getData() {
        return data;
    }

    public void setData(File data) {
        this.data = data;
    }
    
    
    @Override
    public void writeAppend(String toWrite, int mode){
        fw.writeAppend(toWrite, data);
    }
    
    
    @Override
    public void writeNoAppend(String toWrite, int mode){
        fw.writeNoAppend(toWrite, data);
    }
    
    /**
     * read a specific line from the file
     * @param line the line to be read, starting with 1
     * @return the specified line as a String
     */
    @Override
    public String readLine(int line, int mode){
        return fr.readLine(data, line);
    }
    
    /**
     * print the contents of the file
     */
    @Override
    public void readAll(){
        fr.readAll(data);
    }
}
