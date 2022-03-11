package edu.wctc;

public class WisconsinFormatter implements DriversLicenseFormatter{
    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {

        //Uses the getter methods of the driver's license object to retrieve the components of the license number.
        // Returns them in a String in the format of SSSS-FFFY-YDDD-NN
        String fff = String.valueOf(driversLicense.getFFF());
       String ddd = String.valueOf(driversLicense.getDDD());
       String y1 = String.valueOf(String.valueOf(driversLicense.getYY()).charAt(0));
        String y2 = String.valueOf(String.valueOf(driversLicense.getYY()).charAt(1));
        String fffy = fff + y1;
        String yddd = ddd + y2;

        return driversLicense.getSSSS() + "-" + fffy + "-" + yddd + "-" + driversLicense.getN();
    }
}
