package edu.wctc;

public class UnknownGenderCodeException extends Exception{
    public UnknownGenderCodeException(String genderCode){
        //Constructor that calls the superclass constructor with a message that the given gender code is not known.
        System.out.println("Error: given gender code is not known.");
    }
}
