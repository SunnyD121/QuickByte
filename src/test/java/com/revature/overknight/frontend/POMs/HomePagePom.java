package com.revature.overknight.frontend.POMs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePagePom {
    private WebDriver driver;

    private By element = By.xpath("");
    private By logInOutButton = By.xpath("/html/body/app-root/html/body/app-homepage/app-nav-bar/nav/div/ul[2]/li[2]/a");
    private By signUpOrPostButton = By.xpath("/html/body/app-root/html/body/app-homepage/app-nav-bar/nav/div/ul[2]/li[1]/a");
    public HomePagePom(WebDriver driver){
        this.driver = driver;
    }

    public String getLogInOutButtonText(){
        return driver.findElement(logInOutButton).getText();
    }

    public void clickLogInOutButton(){
        driver.findElement(logInOutButton).click();
    }

    public String getSignUpOrPostButtonText(){
        return driver.findElement(signUpOrPostButton).getText();
    }

    public void clickSignUpOrPostButton(){
        driver.findElement(signUpOrPostButton).click();
    }

/* Templates:

    public String get(){
        return driver.findElement().getText();
    }

    public void clickButton(){
        driver.findElement().click();
    }
*/

}
