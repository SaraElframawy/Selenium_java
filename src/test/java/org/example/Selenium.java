package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Assert;
import org.testng.annotations.*;


public class Selenium {
   private WebDriver driver;
   public String url = "https://www.lambdatest.com/selenium-playground";
    @BeforeClass
    public void init (){

        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    public void setup(){
       driver = new ChromeDriver();
       driver.manage().window().setPosition(new Point(2000,0));
       driver.manage().window().maximize();

    }
    @Test
    public void input_shoulDisplay() throws InterruptedException{
        driver.get("https://learnpoint.se");
        Thread.sleep(2000);
        driver.get("https://google.se");
        Thread.sleep(2000);
        driver.navigate().back();


//driver.findElement(By.linkText("Simple Form Demo")).click();



    }

    @Test
    public void simpleFor_enterInput_shouldDisplayInput() throws InterruptedException{

        driver.get("https://lambdatest.com/selenium-playground");
        driver.findElement(By.linkText("Simple Form Demo")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("user-message")).sendKeys("hej,,,,");
        Thread.sleep(2000);
       driver.findElement(By.id("showInput")).click();
       String message = driver.findElement(By.id("message")).getText();

        System.out.println(message);
        Assert.assertEquals(message,"hej,,,,");
    }
    @Test
    public void advanceButtoninteraction(){
        driver.get("https://demoqa.com/buttons");
        Actions actions = new Actions(driver);

       WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
       actions.doubleClick(doubleClickButton).perform();

       WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
       actions.contextClick(rightClickButton).perform();


    }

    @Test
    public void dynmaicButtonClick(){
        driver.get("https://demoqa.com/buttons");

        By dynmaicButton = RelativeLocator.with(By.tagName("button")).below(By.id(("rightClickBtn")));
        //click on the button below the right click button on  the page
        driver.findElement(dynmaicButton).click();
    }


    @Test
    public void radioButtons(){
        driver.get(url+ "/radiobutton-demo");
        // xpath syntax "//tagName[@attribute ='attribute value' and ...]
        // attribute like name id , or class
        driver.findElement(By.xpath("//input[@name ='optradio' and @value ='Male']")).click();


    }
    @Test()
    public void test_Prairi(){
        driver.navigate().to("https://prairi.com/");

        driver.findElement(By.linkText("Log In")).click();
        driver.findElement(By.xpath("//input[@type ='text' and @name ='username']"))
                .sendKeys("sara.elfaramawy.93@gmail.com");
        driver.findElement(By.xpath("//input[@type ='password' and @name ='password']"))
                .sendKeys("Itisanewlife325");
        driver.findElement(By.xpath("//input[@type ='submit' and @value ='Log In' ]")).click();


    }
    @AfterMethod
    public void tearDown () throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
