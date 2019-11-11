package SeleniumTests;

import AppPages.CanvasChart;
import AppPages.HomePage;
import AppPages.LoginPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static LoginPage login;
    public static HomePage home;
    public static CanvasChart chart;

    public static String appURLV1 = "https://demo.applitools.com/hackathon.html";
    public static String appURLV2 = "https://demo.applitools.com/hackathonV2.html";
    public static String appWithAdsURL = "https://demo.applitools.com/hackathon.html?showAd=true";
    public static String appWithAdsURLV2 = "https://demo.applitools.com/hackathonV2.html?showAd=true";

    @BeforeClass
    @Parameters(("browser"))
    /**
     * Open browser and initialize WebDriver for the pages.
     */
    public static void openBrowser(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            driver = new ChromeDriver(options);
        }

        driver.get("appURLV1");

        login = new LoginPage(driver);
        home = new HomePage(driver);
        chart = new CanvasChart(driver);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    @AfterClass
    /**
     * Quit browser
     */
    public static void closeBrowser() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    @AfterMethod
    /**
     * Capture screenshot on failure
     */
    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.moveFile(screenshot, new File("errorscreens/" + result.getName() + ".png"));
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
