package org.example.pages;

import org.openqa.selenium.By;

public class SimpleFormDemoPage  extends BasePage{
    private final By SingleInputField = By.id("user-message");
    private final By getCheckedValueButton = By.id("showInput");

    private final By displayMessage = By.id("message");
    public void typeInfoSingleInputField(String input){
        sendKeys(SingleInputField,input);
    }
    public void clickGetCheckedValueButton(){
        click(getCheckedValueButton);
    }
    public String getDisplayedMessage(){
        return getText(displayMessage);
    }


}

