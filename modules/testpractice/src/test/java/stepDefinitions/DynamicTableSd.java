package stepDefinitions;

import static org.junit.Assert.assertEquals;

import baseFiles.AutomationBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFiles.DynamicTablePage;
import pageFiles.HomePage;

public class DynamicTableSd {

    HomePage homePage;
    DynamicTablePage tablePage;
    AutomationBase base;

    public DynamicTableSd() {
        homePage = new HomePage();
        tablePage = new DynamicTablePage();
        base = new AutomationBase();
    }

    @Given("User is on Home page")
    public void userIsOnHomePage() {
        homePage.openHomePageUrl();
    }

    @When("User navigates to dynamic table page")
    public void userNavigatesToDynamicTablePage() {
        homePage.clickDynamicTableButton();
    }

    @Then("the url should be {string}")
    public void theUrlShouldBe(String expectedUrl) {
        assertEquals(expectedUrl, base.getUrl());
    }

    @Then("the header should be {string}")
    public void theHeaderShouldBe(String expectedHeader) {
        assertEquals(expectedHeader, tablePage.getHeaderValue());

    }

    @When("User clicks the add row button")
    public void userClicksTheAddRowButton() {
        tablePage.clickAddRowButton();
    }

    @Then("the user name should be {string}")
    public void theUserNameShouldBe(String expectedName) {
        assertEquals(expectedName, tablePage.getFourthUserName());
    }

    @Then("the user age should be {string}")
    public void theUserAgeShouldBe(String expectedAge) {
        assertEquals(expectedAge, tablePage.getFourthUserAge());
    }

}
