package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "user-name")
    public WebElement inputUserName_loc;

    @FindBy(id = "password")
    public WebElement inputPassword_loc;

    @FindBy(id = "login-button")
    public WebElement loginBtn_loc;

    public void login_mtd(String username,String password){

        inputUserName_loc.sendKeys(username);
        inputPassword_loc.sendKeys(password);
        loginBtn_loc.click();
    }



}
