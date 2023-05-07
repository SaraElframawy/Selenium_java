package org.example.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DownloadProgressPage extends BasePage {
    private final By downloadButton = By.id("dwnBtn");
    private final By successMessage = By.xpath(" //p[contains (@class ,'success')]");
    //*[@id="__next"]/div[1]/section[3]/div/div/div[2]/div/div/div/p

    public void clickDownloadButton(){

        click(downloadButton);
    }
    public String waitAndReturnSuccessMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //explicit wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));

        return getText(successMessage);
    }

}
