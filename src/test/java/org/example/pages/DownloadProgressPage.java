package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DownloadProgressPage extends BasePage {
    private final By downloadButton = By.id("dwnBtn");
    private final By successMessage = By.xpath("//p[contains(@class, 'success' )]");
    public void clickDownloadButton(){
        click(downloadButton,1);
    }
    public String waitAndReturnSuccessMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //explicit wait
        wait.until(ExpectedConditions.visibilityOf(find(successMessage)));
        return getText(successMessage);
    }

}
