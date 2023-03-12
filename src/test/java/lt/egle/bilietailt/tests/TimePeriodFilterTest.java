package lt.egle.bilietailt.tests;

import lt.egle.bilietailt.pages.Homepage;
import lt.egle.bilietailt.tests.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimePeriodFilterTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setup() {
        Homepage.open();
        Homepage.acceptCookies();
    }

    @Test
    public void testFilterKitaSavaiteFromAndToDatesGetMarkedInBlue() {
        String expectedResult = "rgb(25, 0, 95)";

        int dayOfMonthFrom = Homepage.getDayOfMonthFrom();
        int dayOfMonthTo = Homepage.getDayOfMonthFrom() + 6;

        String dayFrom = Integer.toString(dayOfMonthFrom);
        String dayTo = Integer.toString(dayOfMonthTo);

        Homepage.selectPasirinkitePerioda();
        Homepage.selectKitaSavaite();

        String actualResultStartDate = Homepage.getStartDateBackgroundColor(dayFrom);
        String actualResultEndDate = Homepage.getEndDateBackgroundColor(dayTo);

        Assert.assertTrue(actualResultStartDate.contains(expectedResult) & actualResultEndDate.contains(expectedResult));
    }
}
