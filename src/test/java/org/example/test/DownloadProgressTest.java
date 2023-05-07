package org.example.test;


import io.qase.api.annotation.QaseTitle;

import org.example.pages.DownloadProgressPage;
import org.testng.Assert;
import org.testng.annotations.Test;



public class DownloadProgressTest extends BaseTest {
    private DownloadProgressPage downloadProgressPage;



    @Test
    @QaseTitle("download bar display success message at the end ogf the downloading")
    public void waitAndCheckDisplayedMessage(){
        downloadProgressPage = landingPage.followLinkToDownloadProgress();
        downloadProgressPage.clickDownloadButton();
         downloadProgressPage.clickDownloadButton();
       String result = downloadProgressPage.waitAndReturnSuccessMessage();
      Assert.assertEquals(result,"Dowload completed!");






    }
}
