package ru.ibs.appline.pages.blockPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.ibs.appline.pages.BasePage;
import ru.ibs.appline.pages.ProductPageMonitor;

public class MainSearchBlock extends BasePage {

    @FindBy(xpath = "//div[@class='container']//input[@name='q']")
    public WebElement searchInput;


    @FindBy(xpath = "//nav[@id='header-search']//input[@name='q']")
    private WebElement searchBtn;


    @FindBy(xpath = ("//nav[@id='header-search']//span[@class='cart-link__price']"))
    public WebElement shopBusket;

    public SelectProductBlock newSearch(String value) {
        searchInput.click();
        searchInput.sendKeys(value);
        searchInput.sendKeys(Keys.ENTER);
        return pageManager.getProductBlock();
    }


    public ProductPageMonitor responseCertainProduct(String value) {
        searchBtn.click();
        searchBtn.sendKeys(value);
        searchBtn.sendKeys(Keys.ENTER);
        return pageManager.getProdPageMon();
    }


    public ShopBusket intoShopBusket() {
        shopBusket.click();
        return pageManager.getShopBusket();
    }

}
