package tests;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.ExtentReportManager;
import utils.ScreenshotUtil;

import java.lang.reflect.Method;

public class FundTransferTest {
    WebDriver driver;
    ExtentTest test;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("mngr627831");
        driver.findElement(By.name("password")).sendKeys("YsenAty");
        driver.findElement(By.name("btnLogin")).click();
    }

    @BeforeMethod
    public void startReport(Method method) {
        test = ExtentReportManager.createTest(method.getName());
    }

    @Test
    public void testFundTransfer() {
        test.info("Navigating to Fund Transfer page");
        WebElement element = driver.findElement(By.linkText("Fund Transfer"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        test.info("Entering transfer details");
        driver.findElement(By.name("payersaccount")).sendKeys("123456");
        driver.findElement(By.name("payeeaccount")).sendKeys("654321");
        driver.findElement(By.name("ammount")).sendKeys("500");
        driver.findElement(By.name("desc")).sendKeys("Test Transfer");
        test.info("Submitting transfer");
        driver.findElement(By.name("AccSubmit")).click();
        test.pass("Fund transfer submitted successfully");
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
