package org.example.test;


import io.qase.api.annotation.QaseTitle;
import org.example.pages.selectDropDownListPage;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropdownListTest extends BaseTest {
    private selectDropDownListPage selectDropdownListPage;
    @Test
    @QaseTitle("select one item from dropdown list")
    public void selectFromDropDown(){
    selectDropdownListPage = landingPage.followLinkToDropDownListPage();
        selectDropdownListPage.selectFromDropDown("Tuesday");

    }
    @Test
    @QaseTitle("select multiple items from a list")
    public void selectMultipleOptions(){
        selectDropdownListPage = landingPage.followLinkToDropDownListPage();
        selectDropdownListPage.multiable_from_multiable_list(List.of("Texas","Ohio","Florida"));

    }
}
