package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Test7 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://leafground.com/link.xhtml");
        driver.findElement(By.linkText("Go to Dashboard")).click();
        String title = driver.getTitle();
        assertEquals("Dashboard", title);
        driver.navigate().back();
        String link = driver.findElement(By.linkText("Find the URL without clicking me.")).getAttribute("href");
        System.out.println(link);
        WebElement brokenlink = driver.findElement(By.linkText("Broken?"));
        brokenlink.click();
        String title1 = driver.getTitle();

        assertEquals("Error 404 /lists.xhtml Not Found in ExternalContext as a Resource", title1);
        driver.navigate().back();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        driver.quit();
    }
}
