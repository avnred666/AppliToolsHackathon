package ApplitoolsTests;

import com.applitools.eyes.RectangleSize;
import org.testng.annotations.Test;

public class CanvasChartVisualAITests extends TestBaseVisualAITests {

    @Test
    public void verifyCanvasChartVisualAITest() {

        driver.get(appURLV1);
        driver.manage().window().maximize();
        login.loginForm("test", "test");
        home.clickCompareExpenses();

        eyes.open(driver, "Hackathon App", "Canvas Chart Visual AI Test", new RectangleSize(1024, 768));
        eyes.checkWindow("Compare Expenses Chart");

        chart.clickShowDataNextYear();
        eyes.checkWindow("Compare Expenses Chart Next Year");

        eyes.closeAsync();
    }
}

