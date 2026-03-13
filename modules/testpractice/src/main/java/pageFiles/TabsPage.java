package pageFiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseFiles.AutomationBase;

public class TabsPage extends AutomationBase{
    

    @FindBy(xpath = "//button[text()='Tab 1']")
    WebElement tab1Button;

    @FindBy(xpath = "//button[text()='Test Button']")
    WebElement testButton;

    public TabsPage() {
        PageFactory.initElements(driver, this);
    }


    public void clickTab1Button() {
        tab1Button.click();
    }

    public void clickTestButton() {
        testButton.click();
        driver.switchTo().alert().accept();
    }

    public String getButtonText() {
        return testButton.getText();
    }
}
