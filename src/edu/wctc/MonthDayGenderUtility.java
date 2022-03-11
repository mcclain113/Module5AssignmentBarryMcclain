package edu.wctc;

import org.apache.commons.codec.language.Soundex;

public class MonthDayGenderUtility {
    private	final	int	MOD_MALE	=0;
    private	final	int	MOD_FEMALE	=500;
    private	final	String	CODE_MALE	="M";
    private	final String	CODE_FEMALE	="F";

    public int encodeMonthDayGender(int year, int month, int day, String genderCode) throws UnknownGenderCodeException, InvalidBirthdayException{
//If the gender code does not match one of the constants, an UnknownGenderCodeException is thrown.
        int genderModConstant = MOD_MALE;
        if (genderCode.equals(CODE_FEMALE) || genderCode.equals(CODE_MALE)){
            if( genderCode.equals("F")){
                genderModConstant = MOD_FEMALE;
            }

            if (day <31 || month <12 || month >=1 || day >=1){
                return (month - 1) * 40 + day + genderModConstant;

            }
            else {throw new InvalidBirthdayException(year,month,day);}

        }

        else{throw new UnknownGenderCodeException(genderCode);}
// If the year, month, and day of birth do not constitute a valid date (such as February 31st or December 47th),
// an InvalidBirthdayException is thrown.
//
//Returns (month - 1) * 40 + day + genderModConstant.
    }

}
