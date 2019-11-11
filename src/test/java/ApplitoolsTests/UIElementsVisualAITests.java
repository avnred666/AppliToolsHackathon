package ApplitoolsTests;

import com.applitools.eyes.*;
import org.testng.annotations.Test;

public class UIElementsVisualAITests extends TestBaseVisualAITests {

    @Test
    public void verifyUIVisualAITest(){
        driver.get(appURLV1);
        driver.manage().window().maximize();
        eyes.open(driver, "Hackathon App", "Login UI Visual AI Test", new RectangleSize(1024, 768));
        eyes.checkWindow("Login Page");

        login.togglethemeLink.click();
        eyes.checkWindow("Login Page after theme change");

        eyes.closeAsync();
    }
}
