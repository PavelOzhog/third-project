package ru.ibs.appline.pages;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.ibs.appline.pages.blockPages.MainSearchBlock;

//НАЙТИ СПОСОБ КАК БЫДЕЛИТЬ СТРАНИЦУ ТОВАРА В ОДНУ СТРАНИЦУ
public class ProductPageGameDetroyt  extends BasePage{

    @FindBy(xpath = "//h1[contains(@class,'product-card-top')]")
    public WebElement headerProductDetroyt;


    @FindBy(xpath = ("//div[contains(@class,'top__buy')]//div[contains(@class,'price_active')]"))
    public WebElement priceDetroyt;


    @FindBy(xpath = ("//div[@class='product-buy product-buy_one-line']//button[contains(text(),'Купить')]"))
    public WebElement buyDtroytBtn;




    public ProductPageGameDetroyt checkOpenProductPage() {
        Assertions.assertEquals("Игра Detroit: Стать человеком (PS4)", headerProductDetroyt.getText(), "Заголовок не соответствует странице");
    return this;

    }


    public  MainSearchBlock buyGame(){
        buyDtroytBtn.click();
        return new MainSearchBlock();
    }





}
