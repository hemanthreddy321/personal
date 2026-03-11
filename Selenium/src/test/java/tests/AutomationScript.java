package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AutomationScript {

    static WebDriver driver;
    static WebDriverWait wait;
    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://projects.hackerearth.com/p3/index.html#/");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) driver.quit();
    }

    @Test(priority = 1)
    public void task1_verifyTitle() throws InterruptedException {
        // Task 1
        wait.until(ExpectedConditions.titleContains("eCommerce Store"));
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "eCommerce Store");
    }

    @Test(priority = 2)
    public void task2_collectHomeEssentialsList() {
        // Task 2
        WebElement productLink = driver.findElement(By.linkText("Products"));
        wait.until(ExpectedConditions.elementToBeClickable(productLink));
        productLink.click();

        String url = driver.getCurrentUrl();

        WebElement ele = driver.findElement(By.xpath("//h3[contains(text(),'Home Essentials')]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", ele);

        List<WebElement> products = driver.findElements(By.xpath("//div[@id='home-essentials']/div/div/span"));

        List<String> details = new ArrayList<>();
        details.add(url);

        for (WebElement el : products) {
            String text = el.getText();
            details.add(text);
        }

        System.out.println(details);
    }

    @Test(priority = 3, dependsOnMethods = "task2_collectHomeEssentialsList")
    public void task3_addAllHomeEssentialsToCart() {
        // Task 3
        WebElement ele1 = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h3[contains(text(),'Home Essentials')]")));
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].scrollIntoView(true)", ele1);

        List<WebElement> products1 = driver.findElements(By.xpath("//div[@id='home-essentials']/div/div/span"));
        List<String> items = new ArrayList<>();

        for (WebElement element : products1) {
            String text1 = element.getText();
            items.add(text1);
        }
        System.out.println(items);

        List<WebElement> cards = driver.findElements(By.xpath("//div[@id='home-essentials']/div/div"));

        for (int i = 0; i < cards.size(); i++) {
            WebElement card = driver.findElements(By.cssSelector("#home-essentials > div > div")).get(i);
            WebElement btn = card.findElement(By.xpath(".//button[contains(.,'Add to Cart')]"));
            wait.until(ExpectedConditions.elementToBeClickable(btn));
            js1.executeScript("arguments[0].click();", btn);
        }
    }

    @Test(priority = 4, dependsOnMethods = "task3_addAllHomeEssentialsToCart")
    public void task4_goToCartAndCollectDetails() {
        // Task 4
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        WebElement navBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/nav")));
        js1.executeScript("arguments[0].scrollIntoView(true)", navBar);
        WebElement cart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/nav/div[2]/a")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", cart);

        List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div/ul/li"));
        List<String> details1 = new ArrayList<>();
        String url = driver.getCurrentUrl();
        details1.add(url);

        WebElement totalPrice = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("#root > div > div > div > div > h3")));
        String priceText = totalPrice.getText();

        for (WebElement e : list) {
            String itemsText = e.getText();
            details1.add(itemsText);
        }
        details1.add(priceText);

        System.out.println(details1);
    }
}