package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://leafground.com/select.xhtml");
        WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
        Select select = new Select(dropdown1);
        select.selectByVisibleText("Selenium");
        WebElement dropdown2 = driver.findElement(By.id("j_idt87:country_label"));
        dropdown2.click();

       WebElement country = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@data-label='Germany']")));
       country.click();

/*        WebElement dropdown3 = driver.findElement(By.id("j_idt87:city_label"));
        dropdown3.click();

        WebElement city = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@data-label='Berlin']")));
        city.click();*/

        driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete\"]/button")).click();
        WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@data-item-label='Playwright']")));
        course.click();



        driver.quit();
    }
}
