package lt.egle.bilietailt.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class Homepage {

        public static By buttonAcceptCookies = By.xpath("//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
        public static By buttonPasirinkitePerioda = By.xpath("(//span[@class='date_search_button_text'])[1]");
        public static By radiobuttonKitaSavaite = By.xpath("/html/body/div[7]/form/div[1]/div[3]/a");
        public static By startDateKitaSavaite = By.xpath("//td[@class=' calendar_selector_activemonth calendar_selector_selected calendar_selector_selected']/span");
        public static By endDateKitaSavaite = By.xpath("//td[@class=' calendar_selector_activemonth calendar_selector_weekend calendar_selector_selected calendar_selector_selected_end']/span");
    }
}
