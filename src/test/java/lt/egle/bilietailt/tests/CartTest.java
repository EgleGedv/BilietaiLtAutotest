package lt.egle.bilietailt.tests;

import lt.egle.bilietailt.pages.GiftCardsPage;
import lt.egle.bilietailt.pages.Homepage;
import lt.egle.bilietailt.tests.common.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setup() {
        Homepage.open();
        Homepage.acceptCookies();
        Homepage.selectDovanuCekiai();
    }
    @Test
    public void testAdd50EuroGiftCardToCart(){
        GiftCardsPage.selectBuyDovanuCekis();

    }
}
