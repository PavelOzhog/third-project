package ru.ibs.appline.framework.utils;

import io.qameta.allure.Attachment;
import io.qameta.allure.junit5.AllureJunit5;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.appline.framework.managers.DriverManager;

public class MyAllureListener extends AllureJunit5 implements AfterTestExecutionCallback {

    @Override
    public void afterTestExecution(ExtensionContext context)  {
        if(context.getExecutionException().isPresent()){
            addScreenShot();
        }
    }

    @Attachment(value = "screenshot", type = "image/png")
public static byte[] addScreenShot(){
        return ((TakesScreenshot) DriverManager.getDriverManager()).getScreenshotAs(OutputType.BYTES);
}

}
