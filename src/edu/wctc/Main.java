package edu.wctc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = keyboard.nextLine();
        System.out.println("Enter Middle Initial: ");
        String middleInitial = keyboard.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = keyboard.nextLine();
        System.out.println("Enter Two Digit Year of Birth: ");
        int year = Integer.parseInt(keyboard.nextLine());
        System.out.println("Enter Month of Birth (1-12): ");
        int month = Integer.parseInt(keyboard.nextLine());
        System.out.println("Enter Day of Birth (1-31): ");
        int day = Integer.parseInt(keyboard.nextLine());
        System.out.println("Enter Gender Code (M/F): ");
        String gender = keyboard.nextLine();

        try {
            //Creates a new DriversLicense object
            DriversLicense driversLicense = new DriversLicense();
            LastNameUtility lastNameUtility = new LastNameUtility();
            FirstNameUtility firstNameUtility = new FirstNameUtility();
            MonthDayGenderUtility monthDayGenderUtility = new MonthDayGenderUtility();

            //Uses the utility classes to and the five setter methods to fill the object with data
            driversLicense.setFFF(firstNameUtility.encodeFirstName(firstName,middleInitial));
            driversLicense.setDDD(monthDayGenderUtility.encodeMonthDayGender(year,month,day,gender));
            driversLicense.setYY(year);
            driversLicense.setSSSS(lastNameUtility.encodeLastName(lastName));

            //Uses the two formatter objects to print the driver's license numbers for Florida and Wisconsin
            FloridaFormatter floridaFormatter = new FloridaFormatter();
            WisconsinFormatter wisconsinFormatter = new WisconsinFormatter();
           String florida = floridaFormatter.formatLicenseNumber(driversLicense);
            String wisconsin = wisconsinFormatter.formatLicenseNumber(driversLicense);
            System.out.println(florida);
            System.out.println(wisconsin);

        } catch (MissingNameException e) {
            e.printStackTrace();
        } catch (UnknownGenderCodeException e) {
            e.printStackTrace();
        } catch (InvalidBirthdayException e) {
            e.printStackTrace();
        }

    }

    }

