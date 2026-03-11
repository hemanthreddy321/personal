package tests;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.ExtentReportManager;
import utils.ScreenshotUtil;

import java.lang.reflect.Method;

public class Guru99LoginTest {
    WebDriver driver;
    ExtentTest test;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void startReport(Method method) {
        test = ExtentReportManager.createTest(method.getName());
    }

    @Test
    public void testValidLogin() {
        test.info("Navigating to login page");
        driver.get("https://www.demo.guru99.com/V4/");
        test.info("Entering username");
        driver.findElement(By.name("uid")).sendKeys("mngr627831");
        test.info("Entering password");
        driver.findElement(By.name("password")).sendKeys("YsenAty");
        test.info("Clicking login button");
        driver.findElement(By.name("btnLogin")).click();

        String expectedTitle = "Guru99 Bank Manager HomePage";
        String actualTitle = driver.getTitle();
        test.info("Verifying page title");
        Assert.assertEquals(actualTitle, expectedTitle, "Login failed or unexpected page title.");
        test.pass("Login test passed");
    }

    @AfterMethod
    public void captureFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            ScreenshotUtil.captureScreenshot(driver, result.getName());
            test.fail("Test failed: " + result.getThrowable());
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
        ExtentReportManager.flushReport();
    }
}
