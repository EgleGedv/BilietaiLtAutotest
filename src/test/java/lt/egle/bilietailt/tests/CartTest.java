package lt.egle.bilietailt.tests;

import lt.egle.bilietailt.pages.*;
import lt.egle.bilietailt.tests.common.BaseTest;
import org.testng.Assert;
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
    public void testAdd50EuroGiftCardToCart() {

        String expectedResult = "1";
        String actualResult;
        String email = "Cocococonut144@gmail.com";

        GiftCardsPage.selectBuyDovanuCekis();
        BilietaiLtDovanuCekisPage.selectBuyATicket();
        BilietaiLtDovanuCekisPage.selectQuantityFor50Euro();
        BilietaiLtDovanuCekisPage.selectTinka();
        BilietaiLtDovanuCekisPage.selectTinkaUnderSiulomosVietos();
        CartPage.enterContactEmail(email);
        CartPage.selectApmoketi();

        actualResult = CartPage.getCartCounterNumber();

        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
