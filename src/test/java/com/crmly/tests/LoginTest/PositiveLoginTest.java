package com.crmly.tests.LoginTest;

import com.crmly.pages.LoginPage;
import com.crmly.tests.TestBase;
import org.testng.annotations.Test;

public class PositiveLoginTest extends TestBase {


    @Test
    public void loginAsHelpdesk(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHelpdesk();
    }

    @Test
    public void loginAsHumanResource(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHumanResource();
    }

    @Test
    public void loginAsMarketing(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsMarketing();
    }






}
