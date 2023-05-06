package org.example.pages;

import io.qase.api.annotation.Step;
import org.openqa.selenium.By;

public class SimpleFormDemoPage  extends BasePage{
    private final By SingleInputField = By.id("user-message");
    //the input field to write the message

    private final By getCheckedValueButton = By.id("showInput");
    //the id of the button


    private final By displayMessage = By.id("message");
 //the left place where the message is appearing after clicking ion the button
 @Step("Type input text {input} into single input field ")
    public void typeInfoSingleInputField(String input){
        sendKeys(SingleInputField,input);
        //the new method of sendKey from BasePageClass
    }
@Step("click on the 'get checked button'")
    public void clickGetCheckedValueButton(){
        click(getCheckedValueButton,1);
    }
    @Step("Get the displayed message")
    public String getDisplayedMessage(){
        return getText(displayMessage);
    }


}

