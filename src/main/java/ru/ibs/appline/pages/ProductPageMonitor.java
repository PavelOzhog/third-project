package ru.ibs.appline.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.ibs.appline.pages.blockPages.MainSearchBlock;


public class ProductPageMonitor extends BasePage {

    @FindBy(xpath = "//h1[contains(@class,'product-card-top')]")
    public WebElement headerProductMonitor;

    @FindBy(xpath = ("//span[@class='product-card-top__add-sales additional-sales-tabs']//div[contains(text(),'Гарантия: 24 мес.')]"))
    public WebElement guarantee;


    @FindBy(xpath = ("//input[@value='1']/../span[@class='ui-radio__content']"))
    public WebElement additGuarantee;


    @FindBy(xpath = ("//div[contains(@class,'top__buy')]//div[contains(@class,'price_active')]"))
    public WebElement price;


    @FindBy(xpath = ("//div[@class='product-buy product-buy_one-line']//button[contains(text(),'Купить')]"))
    public WebElement buyMonitorBtn;


//    @FindBy(xpath = ("//div[@class='container']//input[@name='q']"))
//    public WebElement searchInput;


    public ProductPageMonitor checkOpenProductPage() {
        Assertions.assertEquals("24\" Монитор Samsung Odyssey G3 F24G35TFWI черный", headerProductMonitor.getText(), "Заголовок не соответствует странице");
        return this;
    }

    public ProductPageMonitor getGaranty() {
        //wait.until(ExpectedConditions.visibilityOf(guarantee));
        guarantee.click();
        return this;
    }


    public ProductPageMonitor getAdditGuarantee() {
        //wait.until(ExpectedConditions.elementToBeClickable(additGuarantee));
        additGuarantee.click();
        return this;
    }

    public ProductPageMonitor chekPrice() {
        Assertions.assertEquals(price.getAttribute("innerText"), "15 879 \u20BD", "Сумма товара не соответствует покупке");
        return this;
    }


    public MainSearchBlock buyMonitor() {
        buyMonitorBtn.click();
        return new MainSearchBlock();
    }


//    public void newSearch (String value){
//        searchInput.click();
//        searchInput.sendKeys(value);
//        searchInput.sendKeys(Keys.ENTER);
//    }


}
