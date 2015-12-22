package fileservice;

/**
 * leaves the format of text as is
 * @author Scott
 */
public class PlainTextFormatStrat implements FormatStrat{

    public PlainTextFormatStrat(){}
    
    /**
     * plain text format - returns text as is.
     * @param toWrite
     * @return toWrite
     */
    @Override
    public String toFormat(String toWrite) {
        return toWrite;
    }
    
}
