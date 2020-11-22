package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".form-control.input-sm.input-xsmall.input-inline")
    WebElement dropDownClick;

    @FindBy(css = ".btn.btn-primary.btn-sm")
    List<WebElement> tableRows;

    @FindBy(css = ".form-control.select2")
    WebElement bookCategory;

    public void clickRecord(String records) {
        Select select = new Select(dropDownClick);
        select.selectByValue(records);
        int count = 0;
        for (int i = 1; i < tableRows.size(); i++) {
            count++;
        }
        System.out.println("Amount of records: " + count);
    }

    public void chooseCategory(String category) {
        bookCategory.click();
        bookCategory.sendKeys(category);

    }
}
