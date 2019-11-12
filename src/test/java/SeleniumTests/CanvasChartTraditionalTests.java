package SeleniumTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CanvasChartTraditionalTests extends TestBase {

    @Test
    /**
     * Selenium has a limitation while attempting to get the javascript data from the chart. Hence this test only checks the presence of the chart and
     * if the chart is still present after clicking on Show next year data.
     */
    public void verifyCanvasChart() {
        driver.get(appURLV1);
        login.loginForm("test", "test");
        home.clickCompareExpenses();
        Assert.assertTrue(chart.isChartAvailable(), "Compare Expenses chart is not present on the page");
        chart.clickShowDataNextYear();
        Assert.assertTrue(chart.isChartAvailable(), "Compare expenses chart is not present on page when attempting to show data for next year");
    }
}
