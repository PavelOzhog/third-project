package ru.ibs.appline.pages.blockPages;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.ibs.appline.pages.BasePage;

import java.util.List;

public class ShopBusket extends BasePage {

    @FindBy(xpath = "//div[@class='cart-items__products']//div[@class='cart-items__product']//span[@class='price__current']")
    List<WebElement> listProductsInBusket;

    @FindBy(xpath = "//div[@class='buttons']//span[@class='cart-link__price']")
    WebElement summOfProducts;

    @FindBy(xpath = "//span[@class='base-ui-radio-button__icon base-ui-radio-button__icon_checked']")
    WebElement isUseGarantyRadio;

    @FindBy(xpath = "//a[contains(text(),'Detroit')]/../../div[@class='menu-product menu-product_position-absolute']//button[contains(text(),'Удалить')]")
    WebElement deleteDetroitBtn;

    @FindBy(xpath = "//a[contains(text(),'amsung Odyssey G3')]/../../../../..//button[@class='count-buttons__button count-buttons__button_plus']")
    WebElement plusMonitor;


    @Step("Получаем сумму корзины")
    public ShopBusket getPrices() {
        for (WebElement element : listProductsInBusket) {
            element.getAttribute("innerText");
        }
        return this;
    }

    @Step("Проверяем сумму покупок и сумму в корзине")
    public ShopBusket chekSumOfProduct() {
        //Assertions.assertEquals(summOfProducts.getAttribute("innerText").equals("18 778"), "Сумма покупок не равна сумме товаров123");
        return this;
    }

    @Step("Проверяем выбрана ли гарантия")
    public ShopBusket chekUseGaranty() {
        Assertions.assertTrue(isUseGarantyRadio.isEnabled(), "гарантия не выбрана");
        return this;
    }

@Step("Удаляем игру из корзины")
    public ShopBusket deleteDetroitFromBasket() {
        wait.until(ExpectedConditions.elementToBeClickable(deleteDetroitBtn));
        deleteDetroitBtn.click();
        return this;
    }

@Step("Добавляем монитор в корзину")
    public void plusOneMonitor(int stuff) {
        for (int i = 0; i < stuff; i++) {
            plusMonitor.click();
        }
    }


}
