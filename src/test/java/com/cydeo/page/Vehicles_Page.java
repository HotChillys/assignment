package com.cydeo.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vehicles_Page {
    public Vehicles_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='caret']")
    public WebElement exportGridBtn;

    @FindBy(xpath = "//label[.='Page:']")
    public WebElement page;

    @FindBy(xpath = "(//a[@title='Refresh'])[1]")
    public WebElement refreshBtn;

    @FindBy(xpath = "//a[@title='Reset']")
    public WebElement resetBtn;

    @FindBy(xpath = "//a[@title='Grid Settings']")
    public WebElement gridSettingBtn;



}
