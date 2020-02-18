package com.userregistration;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ValidEmailIdTest {
    private String emailId;
    private boolean expectedEmailResult;
    private UserRegistration userRegistration;
    public ValidEmailIdTest(String emailId,boolean expectedEmailResult){
        this.emailId=emailId;
        this.expectedEmailResult=expectedEmailResult;
    }

    @Before
    public void initialize() throws Exception {
        userRegistration=new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][]{{"abc@yahoo.com",true},
                                            {"abc-100@yahoo.com",true},
                                            {"abc.100@yahoo.com",true},
                                            {"abc111@abc.com",true},
                                            {"abc-100@abc.net",true},
                                            {"abc.100@abc.com.au",true},
                                            {"abc@1.com",true},
                                            {"abc@gmail.com.com",true},
                                            {"abc-gmail.com",false},
                                            {"abc@.com.my",false},
                                            {"abc123@gmail.a",false},
                                            {"abc123@.com",false},
                                            {"abc123@.com.com",false},
                                            {".abc@abc.com",false},
                                            {"abc()*@gmail.com",false},
                                            {"abc@%*.com",false},
                                            {"abc..2002@gmail.com",false},
                                            {"abc.@gmail.com",false},
                                            {"abc@abc@gmail.com",false},
                                            {"abc@gmail.com.1a",false},
                                            {"abc@gmail.com.aa.au",false}
                                           });
    }

    @Test
    public void testUserEmailId() {
        System.out.println(expectedEmailResult);
        assertEquals(expectedEmailResult,UserRegistration.validateEmailId(emailId));
    }
}
