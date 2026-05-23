package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

//static web table
        WebElement table = driver.findElement(By.name("BookTable"));
//rows, columns, cells
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        int totalRows = rows.size();

        List<WebElement> columns = rows.get(0).findElements(By.tagName("th"));
        int totalColumns = columns.size();

        List<WebElement> cells = table.findElements(By.tagName("td"));
        int totalCells = cells.size();

        System.out.println("Total Rows::: "+ totalRows);
        System.out.println("Total columns::: "+ totalColumns);
        System.out.println("Total cells::: "+ totalCells);

        String spName = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[2]/td[2]")).getText();
        System.out.println("Specific Cell name "+spName);
        for(int i = 2; i<= totalRows; i++) {
            for(int j = 1; j <= totalColumns; j++) {
                String cellData = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
                System.out.print(cellData + " | ");
            }
            System.out.println();
        }

//pagination
        List<WebElement> pages = driver.findElements(By.xpath("//ul[@id='pagination']//a"));
        boolean productFound = false;
        for(int i = 0; i < pages.size(); i++) {
            pages.get(i).click();
            List<WebElement> pRows = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr"));
            for(WebElement row: pRows) {
                List<WebElement> rCell = row.findElements(By.tagName("td"));
                String productName= rCell.get(1).getText();
                System.out.println(productName);
                if(productName.equalsIgnoreCase("Gaming Console")) {
                    WebElement checkbox = rCell.get(rCell.size()-1).findElement(By.tagName("input"));
                    checkbox.click();
                    productFound = true;
                    break;
                }
            }
            if(productFound) {
                break;
            }
        }


    }

}
