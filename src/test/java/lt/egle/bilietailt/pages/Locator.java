package lt.egle.bilietailt.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class Homepage {

        public static By buttonAcceptCookies = By.xpath("//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
        public static By buttonPasirinkitePerioda = By.xpath("(//span[@class='date_search_button_text'])[1]");
        public static By labelKitaSavaite = By.xpath("(//label[@class='date_search_popup_preset_label'])[3]");
        public static By buttonDovanuCekiai = By.xpath("//*[@id='module_39890']/div[1]/div/a[1]");

        public static By inputByDayofMonth(String day) {
            return By.xpath(
                    String.format("//td[contains(@class, 'calendar_selector')]//span[contains(text(),'%s')]", day)
            );
        }
    }

    public static class GiftCards {

        public static By imageDovanuCekiai = By.xpath("//*[@id='content-48215']/div/div[2]/div[3]/div/div/div/a[1]/span[1]/img");
        public static By buttonPirktiBilieta = By.xpath("//*[@id='content-48215']/div/div[2]/div[3]/div/div/div/a[1]/span[1]/span/span[1]/span/span/span");
    }

}
