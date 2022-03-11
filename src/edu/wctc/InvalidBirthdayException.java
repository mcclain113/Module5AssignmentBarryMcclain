package edu.wctc;

public class InvalidBirthdayException extends Exception {
   public InvalidBirthdayException(int year, int month, int day) {
    //Constructor that calls the superclass constructor with a message that the given year, month, and day are invalid.
      System.out.println("Error: the given year, month, and day are invalid.");
   }

}
