package edu.wctc;
import org.apache.commons.codec.language.Soundex;
public class LastNameUtility {
    private	Soundex	soundex;

    public String encodeLastName(String lastName) throws MissingNameException{
//If the last name is blank, throws a MissingNameException.
// Returns the encoding of the last name generated by the Soundex algorithm.
        int firstNameValue = 0;
        int middleInitialValue =0;

        if (lastName != null){
            Soundex soundex = new Soundex();
            String encoding = soundex.encode(lastName);
            return encoding;

        }
        else{
            throw new MissingNameException();
        }
    }
}
