package Stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.List;

public class WebTableSteps {
    StringBuilder csvData = new StringBuilder();
    private WebDriver driver;
    private String url;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("I have a URL stored in {string}")
    public void i_have_a_url_stored_in(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            url = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @When("I open the webpage")
    public void i_open_the_webpage() {
        driver.get(url);
    }

    @Then("I extract table data from row {int} and column {int}")
    public void i_extract_table_data_from_row_and_column(int rowIndex, int colIndex) {
        extractSpecificCellData(rowIndex, colIndex);
    }

    private void extractSpecificCellData(int rowIndex, int colIndex) {
        try {
            WebElement table = driver.findElement(By.id("countries"));
            List<WebElement> rows = table.findElements(By.tagName("tr"));

            if (rowIndex < 1 || rowIndex > rows.size()) {
                System.out.println("Invalid row index");
            } else {
                List<WebElement> cells = rows.get(rowIndex - 1).findElements(By.tagName("td"));
                if (colIndex < 1 || colIndex > cells.size()) {
                    System.out.println("Invalid column index");
                } else {
                    csvData.append(cells.get(colIndex - 1).getText().trim()).append("\n");
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("Table not found!");
        }
    }

    @Then("I save the extracted data to {string}")
    public void i_save_the_extracted_data(String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(csvData.toString());
        }
        System.out.println("Extracted table data saved to " + filePath);
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
