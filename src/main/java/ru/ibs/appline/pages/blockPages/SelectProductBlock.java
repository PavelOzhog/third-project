package ru.ibs.appline.pages.blockPages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.ibs.appline.pages.BasePage;
import ru.ibs.appline.pages.ProductPageGameDetroyt;

public class SelectProductBlock extends BasePage {

    @FindBy(xpath = "//div[@class='products-page__content']//div[@data-code='1225442']//a[contains(@class,'product__name')]")
    public WebElement headerProductDetroyt;


    @Step("Выбираем нужный товар из поиска")
    public ProductPageGameDetroyt getProductByXpath(String xPath){
        WebElement element = driverManager.getDriver().findElement(By.xpath(xPath));
        element.click();
        return pageManager.getGameDetroyt();

    }



}
