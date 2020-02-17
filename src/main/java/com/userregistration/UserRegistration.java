package com.userregistration;

public class UserRegistration {
    static String VALID_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Form");
    }

    public static boolean validateName(String name) {
        return (name.matches(VALID_NAME_PATTERN));
    }
}
