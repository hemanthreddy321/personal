package testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test8 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://leafground.com/alert.xhtml");
        driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']")).click();
        String simpleAlertText = driver.switchTo().alert().getText();
        System.out.println(simpleAlertText);
        driver.switchTo().alert().accept();
        driver.findElement(By.id("j_idt88:j_idt93")).click();
        driver.switchTo().alert().dismiss();
        driver.findElement(By.name("j_idt88:j_idt95")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='Dismiss']"))).click();
/*        driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt100\"]/span[2]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"j_idt88:j_idt101\"]/div[1]/a"))).click();
        Thread.sleep(1000);*/
        driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hello");
        alert.accept();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[.='Delete']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='No']"))).click();
        driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt111\"]/span[2]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='ui-icon ui-icon-extlink']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"j_idt88:j_idt112\"]/div[1]/a[1]"))).click();
        driver.quit();
    }
}
