package lt.egle.bilietailt.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class Homepage {

        public static By buttonAcceptCookies = By.xpath("//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
        public static By buttonPasirinkitePerioda = By.xpath("(//span[@class='date_search_button_text'])[1]");
        public static By radiobuttonKitaSavaite = By.xpath("/html/body/div[8]/form/div[1]/div[3]/a");

        public static By inputByDayofMonth(String day) {
            return By.xpath(
                    String.format("//td[contains(@class, 'calendar_selector')]//span[contains(text(),'%s')]", day)
            );
        }
    }
}
