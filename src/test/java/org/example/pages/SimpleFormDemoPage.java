package org.example.pages;

import org.openqa.selenium.By;

public class SimpleFormDemoPage extends BasePage {
    private final By singleInputField = By.id("user-message");
    private final By getCheckedValueButton = By.id("showInput");

    private final By displayedMessage = By.id("message");

    public void typeIntoSingleInputField(String input){
        sendKeys(singleInputField, input);
    }

    public void clickGetCHeckedValueButton(){
        click(getCheckedValueButton);
    }

    public String getDisplayedMessageText(){
        return getText(displayedMessage);
    }

}
