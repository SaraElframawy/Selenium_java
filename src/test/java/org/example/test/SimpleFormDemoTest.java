package org.example.test;

import io.qase.api.annotation.QaseTitle;
import io.qase.api.annotation.Step;
import org.example.pages.LandingPage;
import org.example.pages.SimpleFormDemoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleFormDemoTest extends BaseTest {

 @Test
@QaseTitle("Simple form demo should input display")
    public void simpleFormDemo_WhenInputText_ShoulDisplayText() {
     //given
     String testMessage = "Test";
     //when
     SimpleFormDemoPage simpleFormDemoPage = landingPage.followLinkToSimpleDemo();
     simpleFormDemoPage.typeInfoSingleInputField(testMessage);
     simpleFormDemoPage.clickGetCheckedValueButton();
  //instead of writing driver.findElemnent(By.id ()).click();
     String result = simpleFormDemoPage.getDisplayedMessage();

  //instaed of driver.findElement(By.id()).getText();
  //we use our own written method to specify them to make them in less steps and changeable easily
     getAssertEquals(testMessage, result);



 }
@Step("Assert displayed text equal inputed text")
 private static void getAssertEquals(String testMessage, String result) {
  Assert.assertEquals(testMessage, result );
 }


}
