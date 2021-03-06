package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean firstName = UserRegistration.validateName("Gajanan");
        Assert.assertTrue(firstName);
    }

    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse() {
        boolean firstName = UserRegistration.validateName("gajanan");
        Assert.assertFalse(firstName);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean lastName = UserRegistration.validateName("Desai");
        Assert.assertTrue(lastName);
    }

    @Test
    public void givenLastName_WhenImproper_ShouldReturnFalse() {
        boolean lastName = UserRegistration.validateName("desai");
        Assert.assertFalse(lastName);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        boolean email = UserRegistration.validateEmailId("abc.xyz@gmail.co.in");
        Assert.assertTrue(email);
    }

    @Test
    public void givenEmailId_WhenImproper_ShouldReturnFalse() {
        boolean email = UserRegistration.validateEmailId("abc.@gmail.com");
        Assert.assertFalse(email);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        boolean mobileNumber = UserRegistration.validateMobileNumber("91 8652556055");
        Assert.assertTrue(mobileNumber);
    }

    @Test
    public void givenMobileNumber_WhenImproper_ShouldReturnFalse() {
        boolean mobileNumber = UserRegistration.validateMobileNumber("918652556055");
        Assert.assertFalse(mobileNumber);
    }

    @Test
    public void givenMobileNumber_WhenNoCountryCode_shouldReturnFalse() {
        boolean mobileNumber = UserRegistration.validateMobileNumber("8652556055");
        Assert.assertFalse(mobileNumber);
    }

    @Test
    public void givenMobileNumber_WhenCounrtryCodeImproper_ShouldReturnFalse() {
        boolean mobileNumber = UserRegistration.validateMobileNumber("1234 8652556055");
        Assert.assertFalse(mobileNumber);
    }

    @Test
    public void givenMobileNumber_WhenMobileNumberImproper_ShouldReturnFalse() {
        boolean mobileNumber = UserRegistration.validateMobileNumber("91 86525560");
        Assert.assertFalse(mobileNumber);
    }

    @Test
    public void givenPasswordMinimumEightCharacters_WhenProper_ShouldReturnTrue() {
        boolean password = UserRegistration.validatePassword("password",UserRegistration.VALID_PASSWORD_MINIMUM_EIGHT_CHARACTERS_PATTERN);
        Assert.assertTrue(password);
    }

    @Test
    public void givenPasswordMinimumEightCharacters_WhenImproper_ShouldReturnFalse() {
        boolean password = UserRegistration.validatePassword("pass",UserRegistration.VALID_PASSWORD_MINIMUM_EIGHT_CHARACTERS_PATTERN);
        Assert.assertFalse(password);
    }

    @Test
    public void givenPasswordWithAtleastOneUpperCase_WhenProper_ShouldReturnTrue() {
        boolean password = UserRegistration.validatePassword("Password",UserRegistration.VALID_PASSWORD_WITH_ATLEAST_ONE_UPPER_CASE_PATTERN);
        Assert.assertTrue(password);
    }

    @Test
    public void givenPasswordWithAtleastOneUpperCase_WhenImproper_ShouldReturnFalse() {
        boolean password = UserRegistration.validatePassword("password",UserRegistration.VALID_PASSWORD_WITH_ATLEAST_ONE_UPPER_CASE_PATTERN);
        Assert.assertFalse(password);
    }

    @Test
    public void givenPasswordWithAtleastOneNumericNumber_WhenProper_ShouldReturnTrue() {
        boolean password = UserRegistration.validatePassword("Password123", UserRegistration.VALID_PASSWORD_WITH_ATLEAST_ONE_NUMERIC_NUMBER);
        Assert.assertTrue(password);
    }

    @Test
    public void givenPasswordWithAtleastOneNumericNumber_WhenImproper_ShouldReturnFalse() {
        boolean password = UserRegistration.validatePassword("Password", UserRegistration.VALID_PASSWORD_WITH_ATLEAST_ONE_NUMERIC_NUMBER);
        Assert.assertFalse(password);
    }

    @Test
    public void givenPasswordWithExactlyOneSpecialSymbol_WhenProper_ShouldReturnTrue() {
        boolean password = UserRegistration.validatePassword("Gajanan@123", UserRegistration.VALID_PASSWORD_WITH_EXACTLY_ONE_SPECIAL_SYMBOL);
        Assert.assertTrue(password);
    }

    @Test
    public void givenPasswordWithExactlyOneSpecialSymbol_WhenImproper_ShouldReturnFalse() {
        boolean password = UserRegistration.validatePassword("Gajanan@@123", UserRegistration.VALID_PASSWORD_WITH_EXACTLY_ONE_SPECIAL_SYMBOL);
        Assert.assertFalse(password);
    }
}