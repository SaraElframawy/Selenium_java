package org.example.test;

import org.example.pages.LandingPage;
import org.example.pages.SimpleFormDemoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleFormDemoTest extends BaseTest {

 @Test
    public void simpleFormDemo_WhenInputText_ShoulDisplayText() {
     //given
     String testMessage = "Test";
     //when
     SimpleFormDemoPage simpleFormDemoPage = landingPage.followLinkToSimpleDemo();
     simpleFormDemoPage.typeInfoSingleInputField(testMessage);
     simpleFormDemoPage.clickGetCheckedValueButton();
     String result = simpleFormDemoPage.getDisplayedMessage();
     Assert.assertEquals(testMessage,result);



 }



}
