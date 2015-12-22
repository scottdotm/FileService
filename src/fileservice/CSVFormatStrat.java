package fileservice;
//import java.util.regex.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * converts a string to a comma delimited string
 * @author Scott
 */
public class CSVFormatStrat implements FormatStrat {
    private final Pattern pattern;
    private Matcher matcher;
    
    public CSVFormatStrat(){
        pattern = Pattern.compile("(\\s+)");
    }

    /**
     * return formatted string separated by commas
     * @param toWrite
     * @return comma delimited String of toWrite
     */
    @Override
    public String toFormat(String toWrite) {
        //return a string replacing spaces with commas
        matcher = pattern.matcher(toWrite);
        String out = matcher.replaceAll(",");
        return out;
    }
    
}
