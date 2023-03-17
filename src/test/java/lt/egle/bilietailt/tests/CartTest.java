package lt.egle.bilietailt.tests;

import lt.egle.bilietailt.pages.Homepage;
import lt.egle.bilietailt.tests.common.BaseTest;
import org.testng.annotations.BeforeMethod;

public class CartTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setup() {
        Homepage.open();
    }
}
