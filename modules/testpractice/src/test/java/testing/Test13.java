package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test13 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
/*        driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
        driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\godula.hemanthreddy\\Downloads\\HemanthReddyResume.pdf");
        driver.findElement(By.id("downloadButton")).click();
        Thread.sleep(2000);*/

/*        driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
        driver.findElement(By.id("datetimepicker1")).click();
        driver.findElement(By.cssSelector(".flatpickr-monthDropdown-months")).sendKeys("February");
        driver.findElement(By.xpath("//span[text()='15']")).click();
        driver.findElement(By.cssSelector(".flatpickr-hour")).sendKeys("10");
        driver.findElement(By.cssSelector(".flatpickr-minute")).sendKeys("30");
        driver.findElement(By.xpath("/html/body/main/div/div/div[2]")).click();*/

        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        WebElement dob = driver.findElement(By.id("dob"));
        dob.clear();
        dob.sendKeys("25-12-1995");
        WebElement dropdown = driver.findElement(By.id("state"));

        Select select = new Select(dropdown);
        select.selectByVisibleText("Uttar Pradesh");
//        driver.quit();
    }
}
