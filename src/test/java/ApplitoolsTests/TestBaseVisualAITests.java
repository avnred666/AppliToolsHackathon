package ApplitoolsTests;

import AppPages.CanvasChart;
import AppPages.HomePage;
import AppPages.LoginPage;
import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.EyesRunner;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBaseVisualAITests {

    private static final String MY_APPLITOOLS_KEY = "igl0OHy5CaXxCY3weJulCx3mop0fFPHAcMPiWA19qkE110" ;
    public static WebDriver driver;
    public static Eyes eyes;
    public static EyesRunner runner;
    public static BatchInfo batch;

    public static String appURLV1 = "https://demo.applitools.com/hackathon.html";
    public static String appURLV2 = "https://demo.applitools.com/hackathonV2.html";
    public static String appWithAdsURL = "https://demo.applitools.com/hackathon.html?showAd=true";
    public static String appWithAdsURLV2 = "https://demo.applitools.com/hackathonV2.html?showAd=true";

    public static LoginPage login;
    public static HomePage home;
    public static CanvasChart chart;

    @BeforeClass
    public static void initializeAppliTools() {
        batch = new BatchInfo("AppliTools Hackathon");
        runner = new ClassicRunner();
        eyes = new Eyes(runner);
        eyes.setApiKey(MY_APPLITOOLS_KEY);
        eyes.setBatch(batch);
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        login = new LoginPage(driver);
        home = new HomePage(driver);
        chart = new CanvasChart(driver);
    }

    @AfterClass
    public void closeAppliTools() {
        driver.quit();
        eyes.abortIfNotClosed();
        TestResultsSummary allTestResults = runner.getAllTestResults();
        System.out.println(allTestResults);
    }

}


