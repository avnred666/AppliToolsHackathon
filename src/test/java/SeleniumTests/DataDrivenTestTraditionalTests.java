package SeleniumTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DataDrivenTestTraditionalTests extends TestBase {

    @Test
    /**
     * This test verifies the four combination of attempted logins and returns error if the error message is incorrect or if the correct combination
     * of credentials returns an error message
     */
    public void testLoginMessages() {
        driver.get("appURLV1");
        Assert.assertEquals(login.loginForm("", ""), "Both Username and Password must be present", "Error message incorrect when username and password is missing");
        Assert.assertEquals(login.loginForm("test", ""), "Password must be present", "Error message incorrect when password is missing");
        login.usernameInput.clear();
        Assert.assertEquals(login.loginForm("", "test"), "Username must be present", "Error message incorrect when username is missing");
        login.usernameInput.clear();
        Assert.assertEquals(login.loginForm("test", "test"), null, "User unable to login when valid credentials are provided");
    }

}
