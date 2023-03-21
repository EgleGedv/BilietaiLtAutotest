package lt.egle.bilietailt.pages;

public class CartPage {

    public static void enterContactEmail(String text) {
        Common.sendKeysToElement(Locator.Cart.inputEmail, text);
    }

    public static String getCartCounterNumber() {
        Common.waitUntilPageCompletelyLoaded(10);
        return Common.getElementText(Locator.Cart.spanCartCounter);
    }

    public static void selectApmoketi() {
        Common.clickElement(Locator.Cart.buttonApmoketi);
    }

    public static void selectQuantity1For50Euro() {
        Common.waitUntilPageCompletelyLoaded(10);
        Common.scrollToElement(Locator.BilietaiLtDovanuCekis.spanValue50Euro);
        Common.waitUntilPageCompletelyLoaded(10);
        Common.clickElement(Locator.BilietaiLtDovanuCekis.buttonAddQuantity50Euro);
    }

    public static void selectTinka() {
        Common.clickElement(Locator.BilietaiLtDovanuCekis.buttonTinka);
    }

    public static void selectTinkaUnderSiulomosVietos() {
        Common.clickElement(Locator.BilietaiLtDovanuCekis.buttonTinkaSiulomosVietos);
    }

    public static void removeBilietaiLtDovanuCekisFromCart() {
        Common.waitUntilPageCompletelyLoaded(10);
        Common.clickElement(Locator.Cart.buttonXRemoveItem);
    }

    public static String getCurrentPageTitle() {
        Common.waitUntilPageCompletelyLoaded(10);
        return Common.getElementText(Locator.Cart.textCartHeading);
    }
}
