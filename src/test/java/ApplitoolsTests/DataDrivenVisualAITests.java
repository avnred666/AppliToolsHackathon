package ApplitoolsTests;

import com.applitools.eyes.RectangleSize;
import org.testng.annotations.Test;


public class DataDrivenVisualAITests extends TestBaseVisualAITests {

    @Test
    public void verifyLoginVisualAITest (){

        driver.get(appURLV1);
        driver.manage().window().maximize();
        eyes.open(driver, "Hackathon App", "Data driven Visual AI tests", new RectangleSize(1024, 768));

        login.loginForm("", "");
        eyes.checkWindow("Login Page blank credentials");

        login.loginForm("test","");
        eyes.checkWindow("Login Page blank password");

        login.usernameInput.clear();
        login.loginForm("","test");
        eyes.checkWindow("Login Page blank username");

        login.usernameInput.clear();
        login.passwordInput.clear();
        login.loginForm("test","test");
        eyes.checkWindow("Login Page correct credentials");

        eyes.closeAsync();

    }

}
