package com.revature.overknight.frontend.POMs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CreatePostPagePom {
    private WebDriver driver;

    private By titleForm = By.xpath("//li[2]/input");
    private By recipeForm = By.xpath("//li[5]/textarea");
    private By choosePictureButton = By.xpath("//li[8]/input");
    private By previewButton = By.xpath("//li[10]/button");
    private By categoryDropDown = By.xpath("//li[13]/select");
    private By commentForm = By.xpath("//li[16]/textarea");
    private By submitButton = By.xpath("//li[17]/button");
    private By resetButton = By.xpath("//li[17]/input");

    public CreatePostPagePom(WebDriver driver){
        this.driver = driver;
    }

    public void inputTitle(String text){
        driver.findElement(titleForm).sendKeys(text);
    }

    public void inputRecipe(String text){
        driver.findElement(recipeForm).sendKeys(text);
    }

    public void clickPictureButton(){
        driver.findElement(choosePictureButton).click();

    }

    public void clickPreviewButton(){
        driver.findElement(previewButton).click();
    }

    public void selectOption(int option){
        List<WebElement> elements = driver.findElements(categoryDropDown);
        int i = 0;
        for(WebElement e : elements){
            e.click();
            if (i == option) break;
            else i++;
        }
    }

    public void inputComment(String text){
        driver.findElement(commentForm).sendKeys(text);
    }

    public void clickSubmitButton(){
        driver.findElement(submitButton).click();
    }

    public void clickResetButton(){
        driver.findElement(resetButton).click();
    }

    public void loseFocus(){
        driver.findElement(By.xpath("/html/body/app-root/html/body/app-signuppage/body/div/div/form/div/h1")).click();
    }

    public void clearInput(){
        driver.findElement(resetButton).click();
    }

}
