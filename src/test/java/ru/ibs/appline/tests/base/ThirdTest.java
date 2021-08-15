package ru.ibs.appline.tests.base;


import org.junit.jupiter.api.*;
import ru.ibs.appline.pages.StartPage;

public class ThirdTest extends BaseTests {


    StartPage startPage = new StartPage();


    @DisplayName("Проверка DNS shop")
    @Tag("TestGroup1")
    @Test
    void testCase() {
//Монитор  detroyt

        //Assertions.assertNotNull(startPage, "объект не иницилизирован");
        app.getStartPage()
                .closeCity()
                .responseCertainProduct("Монитор Samsung Odyssey G3 F24G35TFWI")
                .checkOpenProductPage()
                .getGaranty()
                .getAdditGuarantee()
                .chekPrice()
                .buyMonitor()
                .newSearch("detroyt")
                .getProductByXpath("//div[@class='products-page__content']//div[@data-code='1225442']//a[contains(@class,'product__name')]")
                .checkOpenProductPage()
                .buyGame()
                .intoShopBusket()
                .getPrices()
                .chekSumOfProduct()
                .chekUseGaranty()
                .deleteDetroitFromBasket()
                .plusOneMonitor(2);


        //        String btnCityXpath = "//div[@class='dropdown-city']//a[@class='btn btn-additional']";
//        WebElement btnCity = driver.findElement(By.xpath(btnCityXpath));
//        btnCity.click();
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(btnCityXpath)));

        //        WebElement search = driver.findElement(By.xpath("//form[@class='presearch']//div[@class='ui-input-search ui-input-search_presearch']/input[@type='search']"));
//        search.click();
//        search.sendKeys("Монитор Samsung Odyssey G3 F24G35TFWI");
//        search.sendKeys(Keys.ENTER);

//        WebElement modelMonitor = driver.findElement(By.xpath("//div[@class='presearch__suggests']//a[contains(text(),'f24g35tfwi')]"));
//        modelMonitor.click();
        //Assertions.assertTrue(productPageMonitor.headerProductMonitor.getAttribute());
//        WebElement headerFormPage = driver.findElement(By.xpath("//h1[contains(@class,'product-card-top')]"));
//        Assertions.assertTrue(headerFormPage.isDisplayed(), "Страница не открылась");
//        WebElement guarantee = driver.findElement(By.xpath("//span[@class='product-card-top__add-sales additional-sales-tabs']//div[contains(text(),'Гарантия: 24 мес.')]"));
//        guarantee.click();
//        WebElement additGuarantee = driver.findElement(By.xpath("//input[@value='1']/../span[@class='ui-radio__content']"));
//        additGuarantee.click();

//        String priceXpath = "//div[contains(@class,'top__buy')]//div[contains(@class,'price_active')]";
//        WebElement price = driver.findElement(By.xpath(priceXpath));
//        wait.until(ExpectedConditions.attributeContains(price, "innerText", "15 879 \u20BD"));
//        System.out.println("\u20BD");


//        String buttonXPath = "//div[@class='product-buy product-buy_one-line']//button[contains(text(),'Купить')]";
//        WebElement buttonBuy = driver.findElement(By.xpath(buttonXPath));
//        buttonBuy.click();


//        String searcBtnXpath = "//div[@class='container']//input[@name='q']";
//        WebElement searchBtn2 = driver.findElement(By.xpath(searcBtnXpath));
//        wait.until(ExpectedConditions.visibilityOf(searchBtn2));
//        searchBtn2.click();
//        searchBtn2.sendKeys("detroyt");
//        searchBtn2.sendKeys(Keys.ENTER);


//        WebElement gameExampl = driver.findElement(By.xpath("//div[@class='catalog-products view-simple']//a[@class='catalog-product__name ui-link ui-link_black']"));
//        gameExampl.click();


//        WebElement buyDetroit = driver.findElement(By.xpath("//div[contains(@class,'card-top__buy')]//div[contains(@class,'one-line')]//button[contains(@class,'_passive')]"));
//        WebElement buyDetroit = driver.findElement(By.xpath("//div[@data-code='1225442']//div[@class='product-buy product-buy_one-line catalog-product__buy']//button[contains(text(),'Купить')]"));
//        wait.until(ExpectedConditions.elementToBeClickable(buyDetroit));
//        buyDetroit.click();

//        WebElement shopBucket = driver.findElement(By.xpath("//button[contains(text(),'В корзине')]"));
//        wait.until(ExpectedConditions.elementToBeClickable(shopBucket));
//        shopBucket.click();

//        WebElement summInTheShopBucket = driver.findElement(By.xpath("//div[@class='buttons']//span[@class='cart-link__price']"));
//        wait.until(ExpectedConditions.attributeContains(summInTheShopBucket, "innerText", "18 778"));
//        System.out.println(summInTheShopBucket.getAttribute("innerText"));
//        Assertions.assertTrue(summInTheShopBucket.getAttribute("innerText").equals("18 778"), "Сумма не равна сумме покупок");


//        WebElement shopBucket = driver.findElement(By.xpath("//a[@class='ui-link cart-link']"));
//        wait.until(ExpectedConditions.elementToBeClickable(shopBucket));
//        shopBucket.click();


//        WebElement isUseGarantyRadio = driver.findElement(By.xpath("//span[@class='base-ui-radio-button__icon base-ui-radio-button__icon_checked']"));
//
//        wait.until(ExpectedConditions.visibilityOf(isUseGarantyRadio));
//
//        Assertions.assertTrue(isUseGarantyRadio.isEnabled(), "гарантия не выбрана");

//!!!!!
//        WebElement priceAtBucketMonitor = driver.findElement(By.xpath("//a[contains(text(),'Odyssey G3')]/../../../../..//span[@class='price__current']"));
//        WebElement priceAtBucketDetroyt = driver.findElement(By.xpath("//a[contains(text(),'Detroit')]/../../../../..//span[@class='price__current']"));
//        WebElement allProceAtBucket = driver.findElement(By.xpath("//div[@class='total-amount__label']//span[@class='price__current']"));
//
//        Assertions.assertTrue(priceAtBucketMonitor.getAttribute("innerText").equals("12 999 \u20BD"), "цена монитора не соответствует");
//        Assertions.assertTrue(priceAtBucketDetroyt.getAttribute("innerText").equals("2 899 \u20BD"), "цена игры не соответствует");
//        Assertions.assertTrue(allProceAtBucket.getAttribute("innerText").equals("18 778 \u20BD"), "общая цена не соответствует");

//        WebElement deleteBtn = driver.findElement(By.xpath("//a[contains(text(),'Detroit')]/../../div[@class='menu-product menu-product_position-absolute']//button[contains(text(),'Удалить')]"));
//        //scrollToElementJs(deleteBtn);
//        wait.until(ExpectedConditions.visibilityOf(deleteBtn));
//        deleteBtn.click();


        //работает неправильно
        //Assertions.assertFalse(deleteBtn.isEnabled(), "игра не удалена");


//        String btnPlusOneMonitorXpass = "//a[contains(text(),'amsung Odyssey G3')]/../../../../..//button[@class='count-buttons__button count-buttons__button_plus']";
//        WebElement btnPlusOneMonitor = driver.findElement(By.xpath(btnPlusOneMonitorXpass));
//        btnPlusOneMonitor.click();


        //дописать тест кейс
//        wait.until(ExpectedConditions.attributeContains(By.xpath("//input[@class='count-buttons__input']"), "value", "2"));
//        btnPlusOneMonitor.click();
//        wait.until(ExpectedConditions.attributeContains(By.xpath("//input[@class='count-buttons__input']"), "value", "3"));


        //        WebElement mainPaige = driver.findElement(By.id("a#header-logo"));
//        Assertions.assertTrue(mainPaige.isDisplayed(), "такого элемента нет на странице");
//
//        //wait.until(ExpectedConditions.elementToBeClickable(mainPaige));
//
//        mainPaige.click();


        //Assertions.assertTrue();


        //switchToByText("xbox series s - DNS – интернет магазин цифровой и бытовой техники по доступным ценам.");

    }
}


//