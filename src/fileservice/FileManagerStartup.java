package fileservice;

import java.io.File;

/**
 *
 * @author Scott
 */
public class FileManagerStartup {

    public static void main(String[] args) {

        String fileName = ("src" + File.separatorChar + "test.txt");
        SimpleFileManager fmPlain = new SimpleFileManager(fileName, new PlainTextReader(new PlainTextFormatStrat()), new PlainTextWriter());
        System.out.println("Third Line of the Plain text format : " + fmPlain.readLine(3, 0));
        fmPlain.readAll();
        
    }
    
}
