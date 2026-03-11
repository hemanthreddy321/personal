package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class WebTableSd {

    WebDriver driver;

    @Given("User is on Web table home page")
    public void userIsOnHomePage() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cosmocode.io/automation-practice-webtable/");
    }

    @Then("User select the visited checkbox for the country {string}")
    public void selectCheckbox(String country) {
        List<WebElement> countryNameList=driver.findElements(By.xpath("//tbody//tr//td[2]"));
        List<WebElement> checkBoxList=driver.findElements(By.xpath("//tbody//tr//td[1]"));

        for(int i=0;i<countryNameList.size();i++) {
            String countryName=countryNameList.get(i).getText();
            if (countryName.equalsIgnoreCase(country)) {
                checkBoxList.get(i).click();
                break;
            }
        }

    }

    
}
