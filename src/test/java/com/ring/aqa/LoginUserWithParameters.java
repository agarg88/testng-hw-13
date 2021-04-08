package com.ring.aqa;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginUserWithParameters {

    @Parameters({"username","password"})
    @Test
    public void loginUserWithXMLParametersTest(String username, String password) {
        System.out.println("User name from testng.xml is passed as: " + username);
        System.out.println("Password  from testng.xml is passed as: " + password);
    }

    @Test(dataProvider = "InsertDataProvider")
    public void loginUserWithDataParametersTest(String username, String password) {
        System.out.println("User name from data provider is passed as: " + username);
        System.out.println("Password  from data provider is passed as: " + password);
    }

    @DataProvider(name= "InsertDataProvider")
    public Object[][] insertData(){
        return new Object[][]{
                {"John", "passwordJohn"},
                {"Smith", "passwordSmith"},
                {"Cherry", "passwordCherry"},
                {"Sam", "passwordSam"}
        };
    }
}

