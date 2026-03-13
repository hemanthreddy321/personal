package pageFiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseFiles.AutomationBase;

public class HomePage extends AutomationBase{

    @FindBy(linkText = "Dynamic Table")
    WebElement dynamicTableButton;

    @FindBy(linkText = "Tabs")
    WebElement tabsButton;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void openHomePageUrl() {
        driver.get("https://projects.hackerearth.com/p4/index.html#/");
    }

    public void clickDynamicTableButton() {
        dynamicTableButton.click();
    }

    public void clickTabsButton() {
        tabsButton.click();
    }

    
}
