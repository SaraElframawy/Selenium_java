package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    private WebDriver driver;
    public void setDriver(WebDriver driver){
        this.driver = driver;

    }
    protected WebElement find(By locator){
     return  driver.findElement(locator);

    }
    protected void click(By locator){
        find(locator).click();
    }
    protected void sendKeys(By locator, String input){
        find(locator).sendKeys(input);
    }
    protected String  getText(By locator){
        return find(locator).getText();

    }
}
