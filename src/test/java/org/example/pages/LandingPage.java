package org.example.pages;

import io.qase.api.annotation.Step;
import org.openqa.selenium.By;

public class LandingPage extends BasePage{
    private final By simpleFormDemoLink = new By.ByLinkText("Simple Form Demo");
    @Step("click on link to simple demo page")
    public SimpleFormDemoPage followLinkToSimpleDemo (){
        click(simpleFormDemoLink);
        return new SimpleFormDemoPage();
    }

}
