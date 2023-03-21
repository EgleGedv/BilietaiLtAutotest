package lt.egle.bilietailt.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class Homepage {
        public static By buttonAcceptCookies = By.xpath("//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
        public static By buttonPasirinkitePerioda = By.xpath("(//span[@class='date_search_button_text'])[1]");
        public static By labelKitaSavaite = By.xpath("(//label[@class='date_search_popup_preset_label'])[3]");
        public static By tabDovanuCekiai = By.xpath("//*[@id='module_39890']/div[1]/div/a[1]");
        public static By iconBasket = By.xpath("/html/body/div[1]/div[2]/div/app-cart-status");

        public static By inputByDayofMonth(String day) {
            return By.xpath(
                    String.format("//td[contains(@class, 'calendar_selector')]//span[contains(text(),'%s')]", day)
            );
        }
    }

    public static class GiftCards {
        public static By imageDovanuCekiai = By.xpath("//*[@id='content-48215']/div/div[2]/div[3]/div/div/div/a[1]/span[1]/img");
        public static By imageLNDTDovanuKuponas = By.xpath("//*[@id='content-48215']/div/div[2]/div[3]/div/div/div/a[4]/span[1]/img");
    }

    public static class BilietaiLtDovanuCekis {
        public static By buttonPirktiBilieta = By.xpath("/html/body/div[3]/div/div/div[1]/div/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/button/span/span");
        public static By spanValue50Euro = By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/div[1]/app-tickets-selection/div[2]/div/div/app-price-zones-selector/app-price-zones-table/table/tr[7]/td[1]");
        public static By buttonAddQuantity50Euro = By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/div[1]/app-tickets-selection/div[2]/div/div/app-price-zones-selector/app-price-zones-table/table/tr[7]/td[3]/app-tickets-amount-input/div/app-ui-button[2]/button");
        public static By buttonTinka = By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/div[1]/app-tickets-selection/div[2]/div/div/app-price-zones-selector/app-tickets-summary/div/app-ui-button/button");
        public static By buttonTinkaSiulomosVietos = By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/div[1]/app-tickets-selection/div[2]/div[2]/app-ui-button[1]/button");
    }

    public static class Cart {
        public static By inputEmail = By.xpath("//input[@type='email']");
        public static By spanCartCounter = By.xpath("//span[@class='cart-counter']");
        public static By buttonApmoketi = By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/div[2]/div/app-shopping-cart/div/app-delivery/div[4]/form/div/app-ui-button/button");
        public static By buttonXRemoveItem = By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/div[2]/div/app-shopping-cart/div/app-shopping-basket-checkout/div[2]/div[1]/div/app-checkout-event/app-checkout-ticket/div[3]/div");
        public static By textCartHeading = By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/div[1]/app-tickets-selection/div[1]/div");
    }

    public static class LNDTDovanuKuponas {
        public static By buttonPirktiBilieta = By.xpath("/html/body/div[3]/div/div/div[1]/div/div[1]/div[1]/div[2]/table/tbody/tr/td[4]/div/button/span/span");
        public static By buttonAdd = By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/div[1]/app-tickets-selection/div[2]/div/div/app-price-zones-selector/app-price-zones-table/table/tr[2]/td[3]/app-tickets-amount-input/div/app-ui-button[2]/button");
        public static By buttonTinka = By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/div[1]/app-tickets-selection/div[2]/div/div/app-price-zones-selector/app-tickets-summary/div/app-ui-button/button");
        public static By buttonTinkaUnderSiulomosVietos = By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/div[1]/app-tickets-selection/div[2]/div[2]/app-ui-button[1]/button");
    }
}
