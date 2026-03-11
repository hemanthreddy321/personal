package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://leafground.com/frame.xhtml");
        driver.switchTo().frame(0);
        driver.findElement(By.id("Click")).click();
        driver.switchTo().defaultContent();
        List<WebElement> count = driver.findElements(By.tagName("iframe"));
        System.out.println(count.size());
        driver.switchTo().frame(2);
        driver.switchTo().frame("frame2");
        driver.findElement(By.id("Click")).click();
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        driver.quit();
    }
}
