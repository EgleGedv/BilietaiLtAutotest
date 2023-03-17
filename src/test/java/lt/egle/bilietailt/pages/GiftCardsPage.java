package lt.egle.bilietailt.pages;

public class GiftCardsPage {

    public static void selectBuyDovanuCekis() {
        Common.mouseHoverOnElement(Locator.GiftCards.imageDovanuCekiai);
        Common.clickElement(Locator.GiftCards.buttonPirktiBilieta);
    }
}
