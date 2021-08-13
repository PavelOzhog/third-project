package ru.ibs.appline.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.ibs.appline.pages.blockPages.MainSearchBlock;


public class StartPage extends BasePage {

    @FindBy(xpath = "//div[@class='dropdown-city']//a[@class='btn btn-additional']")
    private WebElement btnCity;



    public MainSearchBlock closeCity() {
        btnCity.click();
        return pageManager.getMainSearch();
    }

}
