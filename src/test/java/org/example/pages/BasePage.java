package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class BasePage {
    public static WebDriver driver;

    public void setDriver(WebDriver driver) {
        this.driver = driver;

    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);

    }

    protected void click(By locator ,int index) {
        find(locator).click();
    }

    protected void sendKeys(By locator, String input) {
        find(locator).sendKeys(input);
    }

    protected String getText(By locator) {
        return find(locator).getText();

    }
}


