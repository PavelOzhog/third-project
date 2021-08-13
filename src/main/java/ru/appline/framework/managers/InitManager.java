package ru.appline.framework.managers;

import org.omg.CORBA.TIMEOUT;

import java.util.concurrent.TimeUnit;

import static ru.ibs.appline.framework.utils.PropConst.IMPLICITLY_WAIT;
import static ru.ibs.appline.framework.utils.PropConst.PAGE_LOAD_TIMEOUT;

public class InitManager {


    private static final TestPropManager props = TestPropManager.getTestPropManager();
    private static DriverManager driverManager = DriverManager.getDriverManager();

    public static void initFramework() {
        driverManager.getDriver().manage().window().maximize();
        driverManager.getDriver().manage().timeouts()
                .implicitlyWait(Integer.parseInt(props.getProperty(IMPLICITLY_WAIT)), TimeUnit.SECONDS);
        driverManager.getDriver().manage()
                .timeouts().pageLoadTimeout(Integer.parseInt(props.getProperty(PAGE_LOAD_TIMEOUT)), TimeUnit.SECONDS);

    }

    public static void quitFramework() {
        driverManager.getDriver().quit();
    }



}
