package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class selectDropDownListPage extends BasePage{
    // the test on each page

    private final By singleDropDown = By.id("select-demo");
    private final By multiSelectList = By.id("multi-select");
    public void selectFromDropDown(String day){
        Select select = new Select(find(singleDropDown));
        //this method select is  to choose from dropdown list
        select.selectByVisibleText(day);


    }
public void multiable_from_multiable_list(List<String> optionText){
        Select select = new Select(find(multiSelectList));
       optionText.forEach(select::selectByVisibleText);

}





}
