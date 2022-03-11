package edu.wctc;

public class MissingNameException extends Exception{


    public MissingNameException(){
        //Constructor that calls the superclass constructor with a message that the name type (e.g. "first name") may not be blank.
        System.out.println("Error: the name type (e.g. \"first name\") may not be blank.");
    }
}
