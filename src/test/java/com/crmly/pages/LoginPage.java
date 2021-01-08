package com.crmly.pages;

import com.crmly.tests.TestBase;
import com.crmly.utilities.ConfigurationReader;
import com.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

    public LoginPage() {

        PageFactory.initElements(Driver.get(), this);

    }

    @FindBy(name ="USER_LOGIN")
    public WebElement usernameInput;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(xpath= "//input[@value='Log In']")
    public WebElement loginBtn;

    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }

    public void loginAsHelpdesk(){
        String username = ConfigurationReader.get("Helpdesk_username");
        String password = ConfigurationReader.get("Helpdesk_password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }

    public void loginAsHumanResource(){
        String username = ConfigurationReader.get("HumanResource_username");
        String password = ConfigurationReader.get("HumanResource_password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }

    public void loginAsMarketing(){
        String username = ConfigurationReader.get("Marketing_username");
        String password = ConfigurationReader.get("Marketing_password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }







}
