package pageFiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseFiles.AutomationBase;

public class DynamicTablePage extends AutomationBase{
    
    @FindBy(tagName = "h2")
    WebElement headerValue;

    @FindBy(xpath = "//button[text()='Add Row']")
    WebElement addRowButton;

    @FindBy(xpath = "//table//tr[4]//td[2]")
    WebElement fourthUserName;

    @FindBy(xpath = "//table//tr[4]//td[3]")
    WebElement fourthUserAge;


    public DynamicTablePage() {
        PageFactory.initElements(driver, this);
    }


    public String getHeaderValue() {
        return headerValue.getText();
    }

    public void clickAddRowButton() {
        addRowButton.click();
    }

    public String getFourthUserName() {
        return fourthUserName.getText();
    }

    public String getFourthUserAge() {
        return fourthUserAge.getText();
    }

    
}
