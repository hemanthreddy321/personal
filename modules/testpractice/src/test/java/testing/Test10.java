package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Test10 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://leafground.com/window.xhtml");
        String mainWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//button[.='Open Multiple']")).click();
        Set<String> childWindows = driver.getWindowHandles();
        for (String handle: childWindows) {
            if (!handle.equals(mainWindow)){
                driver.switchTo().window(handle);
                System.out.println("Child Window Title: " + driver.getTitle());
                driver.close();
            }
            
        }driver.switchTo().window(mainWindow);
        System.out.println(childWindows.size());
        wait.until(ExpectedConditions.elementToBeClickable(By.id("j_idt88:j_idt95"))).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
