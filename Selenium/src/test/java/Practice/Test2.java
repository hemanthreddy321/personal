package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.*;
import java.util.List;

public class Test2 {
    private WebDriver driver;
    private static final String URL_FILE = "src/url.txt";
    private static final String OUTPUT_FILE = "src/output.csv";

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void extractWebTable() {
        String url = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(URL_FILE))) {
            url = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver.get(url);

        try {
            WebElement table = driver.findElement(By.id("countries"));
            List<WebElement> rows = table.findElements(By.tagName("tr"));

            StringBuilder csvData = new StringBuilder();
            for (WebElement row : rows) {
                List<WebElement> cells = row.findElements(By.tagName("td"));
                for (int i = 0; i < cells.size(); i++) {
                    csvData.append(cells.get(i).getText().trim());
                    if (i < cells.size() - 1) {
                        csvData.append(", ");
                    }
                }
                csvData.append("\n");
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {
                writer.write(csvData.toString());
            }

            System.out.println("Extracted table data saved to " + OUTPUT_FILE);

        } catch (Exception e) {
            System.out.println("Table not found!");
        }
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
