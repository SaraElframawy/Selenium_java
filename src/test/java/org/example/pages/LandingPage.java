package org.example.pages;

import io.qase.api.annotation.Step;
import org.openqa.selenium.By;


public class LandingPage extends BasePage{
    private final By simpleFormDemoLink = new By.ByLinkText("Simple Form Demo");
    private static final By dropDownListLink = new By.ByLinkText("Select Dropdown List");
    private final By jsAlertLink = new By.ByLinkText("Javascript Alerts");
    private static final By downloadProgressLink = new By.ByLinkText("Bootstrap Progress bar");
    @Step("click on link to simple demo page")
    public SimpleFormDemoPage followLinkToSimpleFormDemo(){
        click(simpleFormDemoLink);
        return new SimpleFormDemoPage();

    }

    @Step("click on link to dropdown list")
    public selectDropDownListPage followLinkToDropDownListPage(){
       click(dropDownListLink);
        return new selectDropDownListPage();
    }
    @Step("click on the link to javascript alert ")
    public JavascriptAlertPage followLinkToJavascriptALerts(){
        click(jsAlertLink);
        return new JavascriptAlertPage();
    }

    @Step("click on the download progress page")
    public DownloadProgressPage followLinkToDownloadProgress(){
        click(downloadProgressLink);
        return new DownloadProgressPage();
    }


}
