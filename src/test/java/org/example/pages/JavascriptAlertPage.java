package org.example.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
//page object model for the explicit wait like this  //
// WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(image));

public class JavascriptAlertPage extends BasePage {
    private final By allClickMeButtons = By.xpath("//button[text()='Click Me']");
    public void clickPromptBox(){
        click(allClickMeButtons,2);
    }
    public void pressAndPressOk(String input){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys(input);
        alert.accept();

    }


}
