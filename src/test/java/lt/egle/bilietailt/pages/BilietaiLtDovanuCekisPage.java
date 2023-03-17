package lt.egle.bilietailt.pages;

public class BilietaiLtDovanuCekisPage {

    public static void selectBuyATicket() {
        Common.clickElement(Locator.BilietaiLtDovanuCekis.buttonPirktiBilieta);
    }

    public static void selectQuantityFor50Euro() {
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
}
