package com.revature.overknight.frontend.POMs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePom {

    private WebDriver driver;

    private By usernameForm = By.xpath("//input[1]");
    private By passwordForm = By.xpath("//input[2]");
    private By waitMessage = By.xpath("//form/h3");
    private By loginErrorMessage = By.xpath("//*[@id='error-login']");
    private By loginButton = By.xpath("//button");

    public LoginPagePom(WebDriver driver){
        this.driver = driver;
    }

    public String getUsername(){
        return driver.findElement(usernameForm).getText();
    }

    public String getPassword(){
        return driver.findElement(passwordForm).getText();
    }

    public String getWaitMessage(){
        return driver.findElement(waitMessage).getText();
    }

    public String getErrorMessage(){
        return driver.findElement(loginErrorMessage).getText();
    }

    public void inputUsername(String username){
        driver.findElement(usernameForm).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(passwordForm).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public void clearInput(){
        driver.findElement(usernameForm).clear();
        driver.findElement(passwordForm).clear();
    }


}
