package testing;

import io.cucumber.java.eo.Se;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class Test2 {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
//        co.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("https://leafground.com/input.xhtml");
        driver.findElement(By.id("j_idt88:name")).sendKeys("Hemanth Reddy");
        driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        String text = driver.findElement(By.id("j_idt106:thisform:j_idt110_error-detail")).getText();
        System.out.println(text);
        driver.findElement(By.id("j_idt88:j_idt91")).sendKeys(" - Bangalore");
        WebElement ele = driver.findElement(By.id("j_idt106:float-input"));

        Point p = ele.getLocation();
        System.out.println(p);
        ele.click();
        Thread.sleep(2000);
        ele.sendKeys("godula");

        WebElement ele1 = driver.findElement(By.id("j_idt106:j_idt113"));
        Point p1 = ele1.getLocation();
        System.out.println(p1);

        boolean disabled = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
        assertFalse(disabled);
        System.out.println(disabled);

        WebElement ele2 = driver.findElement(By.id("j_idt106:auto-complete_input"));
        ele2.sendKeys("Hemanth");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt106:auto-complete_panel\"]/ul/li[3]")).click();
        Thread.sleep(1000);

        WebElement ele3 = driver.findElement(By.id("j_idt88:j_idt95"));
        ele3.clear();
        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('j_idt106:j_idt116_input').value='3/4/2026'");
        Thread.sleep(1000);
        String ele4 = driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
        System.out.println(ele4);
        WebElement ele5 = driver.findElement(By.id("j_idt106:j_idt118_input"));
        ele5.sendKeys("5");
        WebElement ele6 = driver.findElement(By.xpath("//*[@id=\"j_idt106:j_idt118\"]/a[1]/span/span"));
        ele6.click();
        ele6.click();
        String text1 = ele5.getAttribute("aria-valuenow");
        System.out.println(text1);
        WebElement ele7 = driver.findElement(By.id("j_idt88:j_idt99"));
        ele7.sendKeys("hemanthreddy@gmail.com",Keys.TAB);
        Thread.sleep(1000);
        WebElement activeElement = driver.switchTo().activeElement();
        String activeElementId = activeElement.getAttribute("id");
        System.out.println("Currently focused element ID: " + activeElementId);
        assertEquals("j_idt88:j_idt101",activeElementId);
        if ("j_idt88:j_idt101".equals(activeElementId)) {
            System.out.println("✅ Focus successfully moved to the next element.");
        } else {
            System.out.println("❌ Focus did not move as expected.");
        }
        driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("I am enthusiastic about learning new technologies and continuously upskilling to meet evolving project needs. If you are aware of any suitable opportunities. I would sincerely appreciate your support.");


        WebElement inputSlider = driver.findElement(By.id("j_idt106:slider"));
        Point before = inputSlider.getLocation();
        System.out.println(before);
        inputSlider.sendKeys("50");
        Thread.sleep(2000);
        WebElement slider = driver.findElement(By.xpath("//div[@id='j_idt106:j_idt120']/span"));
        Point after = slider.getLocation();
        System.out.println(after);

        WebElement keyboard = driver.findElement(By.id("j_idt106:j_idt122"));
        keyboard.click();
        Thread.sleep(2000);
        boolean displayed = keyboard.isDisplayed();
        System.out.println(displayed);
        driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
        Thread.sleep(1000);
        WebElement editor = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt103_editor\"]/div[1]/p"));
        js.executeScript("arguments[0].scrollIntoView(true)",editor);
        driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt103_toolbar\"]/span[1]/span[1]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"ql-picker-options-0\"]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt103_editor\"]/div[1]/p")).sendKeys("hello");
        Thread.sleep(2000);
        driver.quit();
    }
}
