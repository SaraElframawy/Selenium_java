package org.example.test;
import io.qase.api.annotation.QaseTitle;
import org.example.pages.JavascriptAlertPage;
import org.testng.annotations.Test;

public class JavascriptAlertsTest extends BaseTest {
    private JavascriptAlertPage javascriptAlertPage;
    @Test
    @QaseTitle("click alert item to insert a name")
    public void clickAndInputAlertBox(){
        javascriptAlertPage = landingPage.followLinkToJavascriptALerts();
        javascriptAlertPage.clickPromptBox();
       javascriptAlertPage.pressAndPressOk("Viktor");




    }

}
