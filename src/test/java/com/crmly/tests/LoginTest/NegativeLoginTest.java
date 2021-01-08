package com.crmly.tests.LoginTest;

import com.crmly.pages.LoginPage;
import com.crmly.tests.TestBase;
import com.crmly.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class NegativeLoginTest extends TestBase {

    @Test
    public void invalidUsernameTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("InvalidUsername", ConfigurationReader.get("Helpdesk_password"));
    }

    @Test
    public void invalidPasswordTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigurationReader.get("Helpdesk_username"), "InvalidPassword");
    }

    @Test
    public void invalidUsernameAndPasswordTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("InvalidUsername", "InvalidPassword");
    }

    @Test
    public void blankUsernameTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("", ConfigurationReader.get("Helpdesk_password"));
    }

    @Test
    public void blankPasswordTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login( ConfigurationReader.get("Helpdesk_username"), "");
    }

    @Test
    public void blankUsernameAndPasswordTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("","");
    }


}
