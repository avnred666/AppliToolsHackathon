package ApplitoolsTests;

import com.applitools.eyes.RectangleSize;
import org.testng.annotations.Test;

public class TableSortVisualAITests extends TestBaseVisualAITests {

    @Test
    public void verifyTableSortVisualAITest () {
        driver.get(appURLV1);
        driver.manage().window().maximize();
        login.loginForm("test", "test");
        home.clickSort();

        eyes.open(driver, "Hackathon App", "Table Sort Visual AI Test", new RectangleSize(1024, 768));
        eyes.checkWindow("Verify Table Sort");

        eyes.closeAsync();

    }

}
