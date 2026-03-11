package stepDefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFiles.HomePage;
import pageFiles.TabsPage;

public class TabsSd {

    HomePage homePage;
    TabsPage tabs;

    public TabsSd() {
        homePage = new HomePage();
        tabs=new TabsPage();
    }

    @When("User navigates to Tabs page")
    public void userNavigatesToTabsPage() {
        homePage.clickTabsButton();

    }

    @Given("User clicks the Tab1 button")
    public void userClicksTheTab1Button() {
        tabs.clickTab1Button();
    }

    @When("User clicks the test button")
    public void userClicksTheTestButton() {
        tabs.clickTestButton();
    }

    @Then("the button text should be {string}")
    public void theButtonTextShouldBe(String expectedValue) {
        assertEquals(expectedValue, tabs.getButtonText());
        System.out.println(tabs.getButtonText());
    }

}
