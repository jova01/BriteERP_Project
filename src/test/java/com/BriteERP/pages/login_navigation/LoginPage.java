package com.BriteERP.pages.login_navigation;

import com.BriteERP.utilities.BasePage;
import com.BriteERP.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css = "input[type='text']")
    public WebElement userNameElement;

    @FindBy(css = "input[type='password']")
    public WebElement passwordElement;

    @FindBy(css="button[type='submit']")
    public WebElement loginButtonElement;


    public void login(){
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }

    public void login(String username, String password){
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }




}
