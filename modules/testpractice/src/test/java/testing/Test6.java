package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test6 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://leafground.com/radio.xhtml");
        driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"j_idt87:city2\"]/div/div[1]/div/div[2]/span")).click();
        boolean selected = driver.findElement(By.xpath("//*[@id='j_idt87:console2' and contains(.,'Firefox')]")).isSelected();
        if (selected==true){
            System.out.println("Selected");
        }else {
            driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[2]/div/div[2]/span")).click();
            System.out.println("selected now");
        }Thread.sleep(2000);
//        driver.quit();
    }}
