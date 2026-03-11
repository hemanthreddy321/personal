package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Test12 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/table.xhtml");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement table = driver.findElement(By.xpath("//table[@role='grid']/tbody"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                System.out.println(cell.getText() + "\t");
            }
        }

        WebElement input = driver.findElement(By.id("form:j_idt89:globalFilter"));
        input.sendKeys("Japan");
        Thread.sleep(2000);
        List<WebElement> filteredrows = table.findElements(By.tagName("tr"));
        wait.until(ExpectedConditions.visibilityOfAllElements(filteredrows));
        for (WebElement each : filteredrows) {
            System.out.println(each.getText());
        }
        driver.findElement(By.xpath("//*[@id=\"form:j_idt89:j_idt92\"]")).click();

        input.clear();


        WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"form:j_idt89_paginator_bottom\"]/span/a"));
        if (nextButton.isEnabled()) {
            nextButton.click();
        }

        driver.quit();
    }
}
