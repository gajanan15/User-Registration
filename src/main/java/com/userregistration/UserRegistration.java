package com.userregistration;

public class UserRegistration {
    static String VALID_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    static String VALID_EMAIL_PATTERN = "^([a-zA-Z]{3,}([.|_|+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?)$";
    static String VALID_MOBILE_NUMBER_PATTERN = "^([0-9]{1,3}[ ][1-9]{1}[0-9]{9})$";

    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Form");
    }

    public static boolean validateName(String name) {
        return (name.matches(VALID_NAME_PATTERN));
    }

    public static boolean validateEmailId(String email) {
        return (email.matches(VALID_EMAIL_PATTERN));
    }

    public static boolean validateMobileNumber(String mobileNumber) {
        return (mobileNumber.matches(VALID_MOBILE_NUMBER_PATTERN));
    }
}