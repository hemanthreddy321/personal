package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.ScreenshotUtil;
import utils.ExtentReportManager;
import com.aventstack.extentreports.ExtentTest;

import java.lang.reflect.Method;

public class NewCustomerTest {
    WebDriver driver;
    ExtentTest test;

    @BeforeClass
    public void setup() {
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
    public void testAddNewCustomer() {
        test.info("Navigating to New Customer page");
        driver.findElement(By.linkText("New Customer")).click();
        test.info("Filling customer details");
        driver.findElement(By.name("name")).sendKeys("John Doe");
        driver.findElement(By.name("rad1")).click();
        driver.findElement(By.name("dob")).sendKeys("01/01/1990");
        driver.findElement(By.name("addr")).sendKeys("123 Main Street");
        driver.findElement(By.name("city")).sendKeys("New York");
        driver.findElement(By.name("state")).sendKeys("NY");
        driver.findElement(By.name("pinno")).sendKeys("123456");
        driver.findElement(By.name("telephoneno")).sendKeys("1234567890");
        driver.findElement(By.name("emailid")).sendKeys("john.doe@example.com");
        driver.findElement(By.name("password")).sendKeys("password123");
        test.info("Submitting the form");
        driver.findElement(By.name("sub")).click();
        test.pass("New customer created successfully");
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
