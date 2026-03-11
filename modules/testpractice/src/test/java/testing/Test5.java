package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Test5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://leafground.com/checkbox.xhtml");
        driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]")).click();
        driver.findElement(By.xpath("//div[.='Ajax']")).click();
        //*[@id="j_idt87:msg_container"]/div/div/div[2]/span
        WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"j_idt87:msg_container\"]/div/div/div[2]/span")));
        String msgtext = msg.getText();
        System.out.println(msgtext);

        List<WebElement> chk = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td/div")));
        for (int i=0; i<chk.size();i++){
            chk.get(i).click();
        }
        Thread.sleep(2000);
        driver.findElement(By.id("j_idt87:ajaxTriState")).click();
        //*[@id="j_idt87:id_container"]/div/div/div[2]/p
        WebElement msg1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"j_idt87:id_container\"]/div/div/div[2]/p")));
        String msgtext1 = msg.getText();
        System.out.println(msgtext1);
/*        driver.findElement(By.id("j_idt87:j_idt100")).click();
        WebElement msg2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"j_idt87:msg_container\"]/div/div/div[2]/span")));
        String msgtext2 = msg2.getText();
        System.out.println(msgtext2);*/

        driver.findElement(By.id("j_idt87:multiple")).click();
        List<WebElement> chk1 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div/ul/li/div")));
        System.out.println(chk1.size());
        chk1.get(2).click();
        chk1.get(4).click();
        chk1.get(6).click();
/*        Actions act=new Actions(driver);

        act.keyDown(Keys.CONTROL)
                .click(chk1.get(2))
                .click(chk1.get(4))
                .click(chk1.get(6))
                .build().perform();*/
        List<WebElement> chk2 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"j_idt87:multiple\"]/ul/li")));
        for (WebElement s:chk2) {
            System.out.println(s.getText());
        }
        driver.quit();
    }
}
