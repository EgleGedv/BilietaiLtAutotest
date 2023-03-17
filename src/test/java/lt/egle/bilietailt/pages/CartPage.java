package lt.egle.bilietailt.pages;

public class CartPage {

    public static void enterContactEmail(String text) {
        Common.sendKeysToElement(Locator.CartPage.inputEmail, text);
    }

    public static String getCartCounterNumber() {
        return Common.getElementText(Locator.CartPage.spanCartCounter);
    }

    public static void selectApmoketi() {
        Common.clickElement(Locator.CartPage.buttonApmoketi);
    }
}
