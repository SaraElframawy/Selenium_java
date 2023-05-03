package org.example.pages;

import org.openqa.selenium.By;

public class LandingPage extends BasePage{
    private final By simpleFormDemoLink = new By.ByLinkText("Simple Form Demo");
    public SimpleFormDemoPage followLinkToSimpleDemo (){
        click(simpleFormDemoLink);
        return new SimpleFormDemoPage();
    }

}
