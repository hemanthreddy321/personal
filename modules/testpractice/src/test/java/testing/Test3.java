package testing;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import java.util.List;

import static org.junit.Assert.assertFalse;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/button.xhtml");
        driver.findElement(By.xpath("//button[.='Click']")).click();
        String title = driver.getTitle();
        System.out.println(title);
        driver.navigate().back();
        boolean disabled = driver.findElement(By.xpath("//button[.='Disabled']")).isEnabled();
        assertFalse(disabled);

        System.out.println(disabled);
        WebElement submit = driver.findElement(By.id("j_idt88:j_idt94"));
        Point p = submit.getLocation();
        System.out.println(p);
        WebElement save = driver.findElement(By.id("j_idt88:j_idt96"));
        String color = save.getCssValue("color");
        System.out.println(color);
        String hex = Color.fromString(color).asHex();
        System.out.println(hex);
        WebElement sub = driver.findElement(By.id("j_idt88:j_idt98"));
        Dimension d = sub.getSize();
        d.getHeight();
        d.getWidth();
        System.out.println(d);

        Actions act = new Actions(driver);
        WebElement colorbutton = driver.findElement(By.id("j_idt88:j_idt100"));
        String initialColor = Color.fromString(colorbutton.getCssValue("background-color")).asHex();
        act.moveToElement(colorbutton).build().perform();
        String hoverColor = Color.fromString(colorbutton.getCssValue("background-color")).asHex();
        if (!initialColor.equals(hoverColor)) {
            System.out.println("Success: Color changed from " + initialColor + " to " + hoverColor);
        } else {
            System.out.println("Failure: Color remained " + initialColor);
        }
        WebElement image = driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));
        image.click();
        Thread.sleep(2000);
        WebElement hiddenimage = driver.findElement(By.id("j_idt88:j_idt102:j_idt104"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenimage);


        List<WebElement> roundedButtons = driver.findElements(By.xpath("//button[@id='j_idt88:j_idt107' or @id='j_idt88:j_idt108' or @id='j_idt88:j_idt109' or @id='j_idt88:j_idt110']"));

        System.out.println("Number of rounded buttons: " + roundedButtons.size());

        driver.quit();
    }
}
