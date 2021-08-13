package ru.ibs.appline.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainBlocks {

    @FindBy(xpath = ("//div[@class='container']//input[@name='q']"))
    public WebElement searchInput;


}
