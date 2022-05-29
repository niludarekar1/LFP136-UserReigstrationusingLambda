package com.bridgelabz;

public class UserRegistrationRegex {
    public static void main(String[] args) {
        UserRegistration userInformation = new UserRegistration();

        System.out.println(userInformation.validateFirstName());
        System.out.println(userInformation.validateLastName());
        System.out.println(userInformation.validateMailID());
        System.out.println(userInformation.validateMobileNumber());
        System.out.println(userInformation.validatePassword());
    }

}