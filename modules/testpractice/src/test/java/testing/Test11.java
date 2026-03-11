package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class Test11 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://leafground.com/drag.xhtml");
        WebElement draggable = driver.findElement(By.id("form:conpnl"));
        Actions act = new Actions(driver);
        act.dragAndDropBy(draggable,250,300).build().perform();
        WebElement ele1 = driver.findElement(By.id("form:drag_content"));
        WebElement ele2 = driver.findElement(By.id("form:drop"));
        act.dragAndDrop(ele1,ele2).perform();
        WebElement col1 = driver.findElement(By.xpath("//*[@id=\"form:j_idt94:j_idt95\"]"));
        WebElement col2 = driver.findElement(By.xpath("//*[@id=\"form:j_idt94:j_idt97\"]"));
        act.clickAndHold(col1)
                .moveToElement(col2)
                .release()
                .perform();
        WebElement row1 = driver.findElement(By.xpath("//*[@id=\"form:j_idt111_data\"]/tr[1]/td[1]"));
        WebElement row2 = driver.findElement(By.xpath("//*[@id=\"form:j_idt111_data\"]/tr[2]/td[1]"));
        act.clickAndHold(row1)
                .moveToElement(row2)
                .release()
                .perform();
        driver.findElement(By.xpath("//button[.='Start']")).click();
        boolean progress = wait.until(ExpectedConditions.textToBe(By.className("ui-progressbar-label"),"100%"));
        assertTrue(progress);
        WebElement start = driver.findElement(By.xpath("//*[@id=\"form:j_idt125\"]/span[1]"));
        WebElement end = driver.findElement(By.xpath("//*[@id=\"form:j_idt125\"]/span[2]"));
        act.clickAndHold(start)
                .moveToElement(end)
                .release()
                .perform();

        driver.quit();
    }
}
