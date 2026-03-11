package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test1 {

    @Test
        public void method() throws InterruptedException {

/*        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");*/

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.switchTo().newWindow(WindowType.WINDOW);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://projects.hackerearth.com/p4/index.html#/");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("document.querySelector('.__chobitsu-hide__').style.display='none';");

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div[2]/ul/li[1]")));
        element.click();

        String currentUrl = driver.getCurrentUrl();
        WebElement headerElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h2")));
        String header = headerElement.getText();

        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/button")));
        element1.click();

        System.out.println(currentUrl);
        System.out.println(header);

        driver.navigate().to("https://projects.hackerearth.com/p4/index.html#/tabs");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/button[1]")).click();
    }
}
