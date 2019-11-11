package ApplitoolsTests;

import com.applitools.eyes.RectangleSize;
import org.testng.annotations.Test;

public class DynamicContentVisualAITests extends TestBaseVisualAITests {

    @Test
    public void verifyDynamicContentVisualAITest (){

        driver.get(appWithAdsURL);
        driver.manage().window().maximize();
        login.loginForm("test", "test");

        eyes.open(driver, "Hackathon App", "Dynamic Content Visual AI Test", new RectangleSize(1024, 768));
        eyes.checkWindow("Verify presence of dynamic content");

        eyes.closeAsync();

    }
}
