package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class Assessment {
    WebDriver driver;
    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }
    @Test
    public void endToEndOrderFlow() throws InterruptedException {
        // Step 1: Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);

        // Step 2: Add items to cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

        // Step 3: Go to cart
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(1000);

        // Step 4: Checkout
        driver.findElement(By.id("checkout")).click();

        // Step 5: Enter user info
        driver.findElement(By.id("first-name")).sendKeys("Hemanth");
        driver.findElement(By.id("last-name")).sendKeys("Reddy");
        driver.findElement(By.id("postal-code")).sendKeys("516360");
        driver.findElement(By.id("continue")).click();
        Thread.sleep(1000);

        // Step 6: Finish order
        driver.findElement(By.id("finish")).click();

        // Verify success message
        WebElement msg = driver.findElement(By.className("complete-header"));
        if (msg.getText().equals("Thank you for your order!")) {
            System.out.println("Order completed successfully");
        } else {
            System.out.println("Order not completed");
        }

        // Step 7: logout
        driver.findElement(By.id("back-to-products")).click();
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("logout_sidebar_link")).click();
    }
    @AfterClass
    public void teardown() {
        driver.quit();
    }
}