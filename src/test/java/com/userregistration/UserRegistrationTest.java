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
}