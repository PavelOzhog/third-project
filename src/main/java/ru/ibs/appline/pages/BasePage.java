package ru.ibs.appline.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.appline.framework.managers.DriverManager;
import ru.appline.framework.managers.PageManager;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class BasePage {

    protected DriverManager driverManager = DriverManager.getDriverManager();
    protected WebDriverWait wait = new WebDriverWait(driverManager.getDriver(), 17, 2000);
    protected JavascriptExecutor js = (JavascriptExecutor) driverManager.getDriver();

    protected PageManager pageManager = PageManager.getPageManager();


    public BasePage() {
        PageFactory.initElements(driverManager.getDriver(), this);

    }


    //метод ожидания загрузки элемента
    protected WebElement waitUtilElementToBeVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    //метод ожидания кликабельности элемента
    protected WebElement waitUtilElementToBeClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    //удаление пробелов в string
    protected String changeString(String string) {
        return string.trim().toLowerCase(Locale.ROOT).replaceAll("\\s+", "");
    }

    //преобразование в число
    protected int getIntFromString(String string) {
        return Integer.parseInt(changeString(string).replaceAll("[^\\d.]", ""));
    }


    public void closeDynamicPopUp() {
        driverManager.getDriver().manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        try {
            WebElement element = driverManager.getDriver().findElement(By.xpath("//*[@class='Ribbon-close']"));
            element.click();
        } catch (NoSuchElementException ignore) {
        } finally {
            driverManager.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }
    }

    public void fillDate(By locator, String value) {
        WebElement dateFiled = driverManager.getDriver().findElement(locator);
        dateFiled.click();
        dateFiled.clear();
        dateFiled.click();
        dateFiled.sendKeys(value);
        dateFiled.sendKeys(Keys.RETURN);
        dateFiled.sendKeys(Keys.TAB);
        Assertions.assertEquals(dateFiled.getAttribute("defaultValue"), value, "Поле заполнено неккоректно");
    }


    public void fillAdressOfStay(By locator, String value) {
        closeDynamicPopUp();
        WebElement element = driverManager.getDriver().findElement(locator);
        element.click();
        element.clear();
        element.sendKeys(value);
        wait.until(ExpectedConditions.attributeContains(locator, "value", value));
        element.sendKeys(Keys.DOWN);
        element.sendKeys(Keys.RETURN);
        Assertions.assertEquals(element.getAttribute("defaultValue"), value, "Поле заполнено неккоректно");
    }

    public void fillPhone(By locator, String value) {
        String maskRu = "+7";
        WebElement phoneField = driverManager.getDriver().findElement(locator);
        phoneField.clear();
        phoneField.click();
        phoneField.sendKeys(value);
        //wait.until(ExpectedConditions.attributeContains(locator,"value",value ));
        //value = value.substring() + value.substring()
        //Assertions.assertEquals( maskRu + value,phoneField.getAttribute("defaultValue"),"Данные введены не верно");

    }

    public void fillAdress(By locator, String value) {
        closeDynamicPopUp();
        WebElement element = driverManager.getDriver().findElement(locator);
        element.click();
        element.clear();
        element.sendKeys(value);
        element.sendKeys(Keys.TAB);
        Assertions.assertEquals("Поле не заполнено", value, value);
    }


    protected void scrollToElementJs(WebElement element) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driverManager.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    private void waitUtilElementToBeVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void fill(By locator, String value) {
        closeDynamicPopUp();
        WebElement element = driverManager.getDriver().findElement(locator);
        element.click();
        element.clear();
        element.sendKeys(value);

    }


    protected void switchToByText(String text) {
//      Получаем идентификатор вкладки на которой мы сейчас находимся
        String parentWindow = driverManager.getDriver().getWindowHandle();
//      Получаем список вкладок
        List<String> vkladki = new ArrayList<>(driverManager.getDriver().getWindowHandles());
        for (String item : vkladki) {
//          Если не совпал идентификатор с нашей вкладкой значит нужно переключиться
//          Т.е. попадем в if
            if (!item.equals(parentWindow)) {
                driverManager.getDriver().switchTo().window(item);
//              Проверка текста на вкладке если текст совпал то останавливаем цикл
                if (driverManager.getDriver().getTitle().equals(text)) {
                    return;
                }
            }
        }
        Assertions.fail("Вкладка с текстом '" + text + "' не найдена");
    }


}
