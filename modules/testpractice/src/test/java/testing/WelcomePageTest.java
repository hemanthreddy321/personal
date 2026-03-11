package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pageFiles.RegisterPage;
import pageFiles.WelcomePage;

import java.time.Duration;
import static org.testng.Assert.assertEquals;

public class WelcomePageTest {
    WebDriver driver;
    WelcomePage objWelcomePage;
    RegisterPage objRegisterPage;

    @BeforeTest

    public void setup() {

        // Initiate the Webdriver
        driver = new ChromeDriver();

        // adding implicit wait of 12 secs
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        driver.manage().window().maximize();

        // Opening the webpage
        driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
        objWelcomePage = new WelcomePage(driver);
        objRegisterPage = new RegisterPage(driver);
    }
    @Test(priority = 1)
    public void verifyWelcomePageHeading() {

        // object of WelcomePage page class

        String text = objWelcomePage.verifyPageHeading();
        System.out.println("Page heading in Welcome Page: " + text);

        // assertions to test case
        assertEquals(text, "Welcome, Login In");
    }
    @Test(priority = 2)
    public void moveToRegisterPage() {

        objWelcomePage.clickOnNewUser();
    }
    @Test(priority = 3)
    public void verifyRegisterPageHeading() {

        // object of RegisterPage page class

        String text = objRegisterPage.verifyPageHeading();
        System.out.println("Page heading in Register Page: " + text);

        // assertions to test case
        assertEquals(text, "Welcome,Register");
    }
    @AfterTest
    public void teardown() {
        // quitting browser
        driver.quit();
    }
}