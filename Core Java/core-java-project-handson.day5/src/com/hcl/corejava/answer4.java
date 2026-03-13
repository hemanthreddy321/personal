package com.hcl.corejava;

public class answer4 {
    static void validate(int age) throws InvalidAgeException {
        if (age < 19) {
            throw new InvalidAgeException("age is not eligible");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            validate(13);
        } catch (InvalidAgeException e) {
            System.out.println("exception");

        }


    }


}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        super(str);
    }
}