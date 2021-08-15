package ru.ibs.appline.tests.base;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import ru.appline.framework.managers.DriverManager;
import ru.appline.framework.managers.InitManager;
import ru.appline.framework.managers.PageManager;
import ru.appline.framework.managers.TestPropManager;
import ru.ibs.appline.framework.utils.MyAllureListener;
import ru.ibs.appline.framework.utils.PropConst;

import static ru.ibs.appline.framework.utils.PropConst.BASE_URL;

@ExtendWith(MyAllureListener.class)
public class BaseTests {

    private TestPropManager propManager = TestPropManager.getTestPropManager();
    protected PageManager app = PageManager.getPageManager();

    @BeforeAll
    static void testBeforeAll() {
        InitManager.initFramework();
    }


    @BeforeEach
    public void beforeEach(){
        DriverManager.getDriverManager().getDriver().get(propManager.getProperty(BASE_URL));
    }

    @AfterEach
    void afterEach() {
        InitManager.quitFramework();

    }

}
