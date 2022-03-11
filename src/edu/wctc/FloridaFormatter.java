package edu.wctc;

public class FloridaFormatter implements DriversLicenseFormatter {

    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {
        //Uses the getter methods of the driver's license object to retrieve the components of the license number.
        // Returns them in a String in the format of SSSS-FFF-YY-DDD-N
        return driversLicense.getSSSS() + "-" + driversLicense.getFFF() + "-" + driversLicense.getYY() + "-" + driversLicense.getDDD() + "-" + driversLicense.getNN();
    }
}
