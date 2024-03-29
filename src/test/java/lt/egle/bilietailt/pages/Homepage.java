package lt.egle.bilietailt.pages;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Homepage {
    public static void open() {
        Common.openUrl("https://www.bilietai.lt/lit/");
    }

    public static void acceptCookies() {
        Common.waitUntilPageCompletelyLoaded(10);
        Common.clickElement(Locator.Homepage.buttonAcceptCookies);
    }

    public static void selectPasirinkitePerioda() {
        Common.waitUntilPageCompletelyLoaded(10);
        Common.clickElement(Locator.Homepage.buttonPasirinkitePerioda);
    }

    public static void selectKitaSavaite() {
        Common.waitUntilPageCompletelyLoaded(10);
        Common.clickElement(Locator.Homepage.labelKitaSavaite);
    }

    public static String getStartDateBackgroundColor(String day) {
        Common.waitUntilPageCompletelyLoaded(10);
        return Common.getAttributeColor(Locator.Homepage.inputByDayofMonth(day));
    }

    public static String getEndDateBackgroundColor(String day) {
        return Common.getAttributeColor(Locator.Homepage.inputByDayofMonth(day));
    }

    public static int getDayOfMonthFrom() {
        int dayFrom = 0;

        int todayDayofMonth = LocalDate.now().getDayOfMonth();
        DayOfWeek todayDayofWeek = LocalDate.now().getDayOfWeek();

        if (todayDayofWeek == DayOfWeek.SUNDAY) {
            dayFrom = todayDayofMonth + 1;
        } else if (todayDayofWeek == DayOfWeek.MONDAY) {
            dayFrom = todayDayofMonth + 7;
        } else if (todayDayofWeek == DayOfWeek.TUESDAY) {
            dayFrom = todayDayofMonth + 6;
        } else if (todayDayofWeek == DayOfWeek.WEDNESDAY) {
            dayFrom = todayDayofMonth + 5;
        } else if (todayDayofWeek == DayOfWeek.THURSDAY) {
            dayFrom = todayDayofMonth + 4;
        } else if (todayDayofWeek == DayOfWeek.FRIDAY) {
            dayFrom = todayDayofMonth + 3;
        } else if (todayDayofWeek == DayOfWeek.SATURDAY) {
            dayFrom = todayDayofMonth + 2;
        }
        return dayFrom;
    }

    public static void selectDovanuCekiai() {
        Common.clickElement(Locator.Homepage.tabDovanuCekiai);
    }
}
