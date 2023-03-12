package lt.egle.bilietailt.tests.common;

import lt.egle.bilietailt.pages.Common;
import lt.egle.bilietailt.utils.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public abstract class BaseTest {

    @BeforeMethod
    public abstract void setup();

//    @AfterMethod
//    public void teardown() {
//        Common.closeDriver();
//    }
}
