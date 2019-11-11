package SeleniumTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicContentTraditionalTests extends TestBase {

    @Test
    /**
     * This test verifies the presence of flash sales ads- It expects to see a specific ad gif and flags if the gif is different or not present.
     */
    public void testDynamicContent() {
        driver.get("appWithAdsURL");
        login.loginForm("test", "test");
        Assert.assertTrue(home.isFirstAdPresent(), "Flash Sale Ad-1 is missing or different from expected");
        Assert.assertTrue(home.isSecondAdPresent(), "Flash Sale Ad-2 is missing or different from expected");

    }
}
