package org.example.test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.example.pages.LandingPage;


public class BaseTest {

    private WebDriver driver;
    public String url = "https://www.lambdatest.com/selenium-playground";
    protected static LandingPage landingPage;

    @BeforeClass
    public void init (){

        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().setPosition(new Point(2000,0));
        driver.manage().window().maximize();
        driver.get(url);
        landingPage = new LandingPage();
        landingPage.setDriver(driver);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
