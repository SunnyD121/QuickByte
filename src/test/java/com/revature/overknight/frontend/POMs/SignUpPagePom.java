package com.revature.overknight.frontend.POMs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPagePom {

    private WebDriver driver;

    private By usernameForm = By.xpath("//input[1]");
    private By passwordForm1 = By.xpath("//input[2]");
    private By passwordForm2 = By.xpath("//input[3]");
    private By creditCardForm = By.xpath("//input[4]");
    private By waitMessage = By.xpath("//form/h3");
    private By errorMessage_username = By.xpath("//*[@id='error-username']");
    private By errorMessage_password = By.xpath("//*[@id='error-passwords']");
    private By errorMessage_creditCard = By.xpath("//*[@id='error-credit-card']");
    private By submitButton = By.xpath("//button");

    public SignUpPagePom(WebDriver driver){
        this.driver = driver;
    }

    public String getUsername(){
        return driver.findElement(usernameForm).getText();
    }

    public String getPassword1(){
        return driver.findElement(passwordForm1).getText();
    }

    public String getPassword2(){
        return driver.findElement(passwordForm2).getText();
    }

    public String getWaitMessage(){
        return driver.findElement(waitMessage).getText();
    }

    public boolean getErrorMessageUsernameIsDisplayed(){
        return driver.findElement(errorMessage_username).isDisplayed();
    }

    public boolean getErrorMessagePasswordIsDisplayed(){
        return driver.findElement(errorMessage_password).isDisplayed();
    }

    public boolean getErrorMessageCreditCardIsDisplayed(){
        return driver.findElement(errorMessage_creditCard).isDisplayed();
    }

    public void inputUsername(String username){
        driver.findElement(usernameForm).sendKeys(username);
    }

    public void inputPassword1(String password){
        driver.findElement(passwordForm1).sendKeys(password);
    }

    public void inputPassword2(String password){
        driver.findElement(passwordForm2).sendKeys(password);
    }

    public void inputCreditCard(String card){
        driver.findElement(creditCardForm).sendKeys(card);
    }

    public void loseFocus(){
        driver.findElement(By.xpath("/html/body/app-root/html/body/app-signuppage/body/div/div/form/div/h1")).click();
    }

    public void clickSubmitButton(){
        driver.findElement(submitButton).click();
    }

    public void clearInput(){
        driver.findElement(usernameForm).clear();
        driver.findElement(passwordForm1).clear();
        driver.findElement(passwordForm2).clear();
        driver.findElement(creditCardForm).clear();
    }



}
