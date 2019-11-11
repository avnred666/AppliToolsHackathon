package SeleniumTests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UIElementsTraditionalTests extends TestBase {

    @Test
    /**
     * This test attempts to verify the presence of all the expected UI elements on the page. It also verifies that the input fields are enabled
     * Limitation - The limitation of this test is that it is unable to identify if toggling the theme changes the background color
     */
    public void testUIElements() {

        driver.get("appURLV1");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(login.verifyPageHeading(), "Page heading is not available or incorrect");
        softAssert.assertTrue(login.verifyToggleLink(), "Toggle theme option is not enabled or not present on the page");
        softAssert.assertTrue(login.verifyUsernameInput(), "Username input field is not enabled or not present on the page");
        softAssert.assertTrue(login.verifyUsernameImage(), "Username image is not available or is different");
        softAssert.assertTrue(login.verifyUsernameLbl(), "Username label is not displayed or is different");
        softAssert.assertTrue(login.verifyPasswordInput(), "Password input field is not available or not enabled");
        softAssert.assertTrue(login.verifyPasswordImg(), "Password image is not displayed or is different");
        softAssert.assertTrue(login.verifyPasswordLbl(), "Password label is not displayed or is different");
        softAssert.assertTrue(login.verifyLoginBtn(), "Login button is not enabled or is not present on the page");
        softAssert.assertTrue(login.verifyRmbrMeCheckbox(), "Remember Me checkbox is not enabled or is not present on the page");
        softAssert.assertTrue(login.verifyRmbrMeLbl(), "Remember Me label is not displayed or is different");
        softAssert.assertTrue(login.verifyTwitterLinkImg(), "Twitter link is not enabled or is different");
        softAssert.assertTrue(login.verifyFbLinkImg(), "Facebook link is not enabled or is different");
        softAssert.assertTrue(login.verifyLinkedinLinkImg(), "Linkedin link is not enabled or is different");
        softAssert.assertAll();
    }
}
